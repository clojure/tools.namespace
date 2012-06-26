(ns clojure.tools.namespace.dependency
  "Bidirectional graphs of dependencies and dependent objects."
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
    transitively."))

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

(deftype MapDependencyGraph [dependencies dependents]
  DependencyGraph
  (immediate-dependencies [graph key]
    (get dependencies key #{}))
  (immediate-dependents [graph key]
    (get dependents key #{}))
  (transitive-dependencies [graph key]
    (transitive dependencies key))
  (transitive-dependents [graph key]
    (transitive dependents key))
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

(comment
  ;; These don't work. You can't implement topological sort using a
  ;; comparison sort.
  (defn topo-comparator
    "Returns a comparator which produces a topographical sort based on
  the dependencies in graph."
    [graph]
    (comparator (partial dependent? graph)))

  (defn topo-sort
    "Returns a topographically-sorted sequence of the items in coll
  using dependencies in graph."  
    [graph coll]
    (sort (topo-comparator graph) coll))

  (defn topo-sort-by
    "Returns a topographically-sorted sequence of the items in coll by
  comparing (keyfn item) using dependencies in graph."
    [graph keyfn coll]
    (sort-by keyfn (topo-comparator graph) coll)))

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

  (topo-sort g [:d :a :c :b])
  ;;=> (:a :b :c :d)
  )
