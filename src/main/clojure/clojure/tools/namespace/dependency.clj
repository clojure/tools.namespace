(ns clojure.tools.namespace.dependency
  "Bidirectional graphs of dependencies and dependent objects."
  (:refer-clojure :exclude (keys))
  (:require [clojure.set :as set]))

(defprotocol DependencyGraph
  (immediate-dependencies [graph key]
    "Returns the set of immediate dependencies of key.")
  (immediate-dependents [graph key]
    "Returns the set of immediate dependents of key.")
  (transitive-dependencies [graph key]
    "Returns the set of all things which key depends on, directly or
    transitively.")
  (transitive-dependents [graph key]
    "Returns the set of all things which depend upon key, directly or
    transitively.")
  (keys [graph]
    "Returns the set of all keys in graph."))

(defprotocol DependencyGraphUpdate
  (depend [graph key dep]
    "Returns a new graph with a dependency from key to dep (\"key depends
    on dep\"). Forbids circular dependencies.")
  (remove-edge [graph key dep]
    "Returns a new graph with the dependency from key to dep removed.")
  (remove-all [graph key]
    "Returns a new dependency graph with all references to key removed.")
  (remove-key [graph key]
    "Removes the key from the dependency graph without removing it as a
    dependency of other keys. That is, removes all outgoing edges from
    key."))

(defn- remove-from-map [amap x]
  (reduce (fn [m [k vs]]
	    (assoc m k (disj vs x)))
	  {} (dissoc amap x)))

(defn- transitive
  "Recursively expands the set of dependency relationships starting
  at (get m x)"
  [m x]
  (reduce (fn [s k]
	    (set/union s (transitive m k)))
	  (get m x) (get m x)))

(declare depends?)

(def set-conj (fnil conj #{}))

(defrecord MapDependencyGraph [dependencies dependents]
  DependencyGraph
  (immediate-dependencies [graph key]
    (get dependencies key #{}))
  (immediate-dependents [graph key]
    (get dependents key #{}))
  (transitive-dependencies [graph key]
    (transitive dependencies key))
  (transitive-dependents [graph key]
    (transitive dependents key))
  (keys [graph]
    (clojure.set/union (set (clojure.core/keys dependencies))
                       (set (clojure.core/keys dependents))))
  DependencyGraphUpdate
  (depend [graph key dep]
    (when (depends? graph dep key)
      (throw (Exception.
              (binding [*print-length* 10]
               (str "Circular dependency between "
                    (pr-str key) " and " (pr-str dep))))))
    (MapDependencyGraph.
     (update-in dependencies [key] set-conj dep)
     (update-in dependents [dep] set-conj key)))
  (remove-edge [graph key dep]
    (MapDependencyGraph.
     (update-in dependencies [key] disj dep)
     (update-in dependents [dep] disj key)))
  (remove-all [graph key]
    (MapDependencyGraph.
     (remove-from-map dependencies key)
     (remove-from-map dependents key)))
  (remove-key [graph key]
    (MapDependencyGraph.
     (dissoc dependencies key)
     dependents)))

(defn graph "Returns a new, empty, dependency graph." []
  (->MapDependencyGraph {} {}))

(defn depends?
  "True if x is directly or transitively dependent on y."
  [graph x y]
  (contains? (transitive-dependencies graph x) y))

(defn dependent?
  "True if y is a dependent of x."
  [graph x y]
  (contains? (transitive-dependents graph x) y))

(defn topo-sort
  "Returns a topologically-sorted list of keys in graph."
  [graph]
  (loop [sorted ()
         g graph
         todo (set (filter #(empty? (immediate-dependents graph %))
                           (keys graph)))]
    (if (empty? todo)
      sorted
      (let [[key & more] (seq todo)
            deps (immediate-dependencies g key)
            [add g'] (loop [deps deps
                            g g
                            add #{}]
                       (if (seq deps)
                         (let [d (first deps)
                               g' (remove-edge g key d)]
                           (if (empty? (immediate-dependents g' d))
                             (recur (rest deps) g' (conj add d))
                             (recur (rest deps) g' add)))
                         [add g]))]
        (recur (cons key sorted)
               (remove-key g' key)
               (clojure.set/union (set more) (set add)))))))

(defn topo-comparator
  "Returns a comparator fn which produces a topological sort based on
  the dependencies in graph. Keys not present in the graph will sort
  after keys in the graph."
  [graph]
  (let [pos (zipmap (topo-sort graph) (range))]
    (fn [a b]
      (compare (get pos a Long/MAX_VALUE)
               (get pos b Long/MAX_VALUE)))))

(comment
  ;; example usage: building a graph like:
  ;;
  ;;       :a
  ;;      / |
  ;;    :b  |
  ;;      \ |
  ;;       :c
  ;;        |
  ;;       :d
  ;;
  (def g (-> (graph)
             (depend :b :a)   ; "B depends on A"
             (depend :c :b)   ; "C depends on B"
             (depend :c :a)   ; "C depends on A"
             (depend :d :c))) ; "D depends on C"

  (transitive-dependencies g :d)
  ;;=> #{:a :c :b}

  (sort (topo-comparator g) [:d :a :b :foo])
  ;;=> (:a :b :d :foo)

  ;;      'one    'five
  ;;        |       |
  ;;      'two      |
  ;;       / \      |
  ;;      /   \     |
  ;;     /     \   /
  ;; 'three   'four
  ;;    |      /
  ;;  'six    /
  ;;    |    /
  ;;    |   /
  ;;    |  /
  ;;  'seven
  ;;
  (def g2 (-> (graph)
              (depend 'two 'one)
              (depend 'three 'two)
              (depend 'four 'two)
              (depend 'four 'five)
              (depend 'six 'three)
              (depend 'seven 'six)
              (depend 'seven 'four)))

  (transitive-dependencies g2 'seven)
  ;;=> #{two four six one five three}
  
  (transitive-dependents g2 'five)
  ;;=> #{four seven}

  (transitive-dependents g2 'two)
  ;;=> #{four seven six three}

  (topo-sort g2)
  ;;=> (one two three five six four seven)

  (sort (topo-comparator g2) '[three seven nine eight five])
  ;;=> (three five seven nine eight)
)
