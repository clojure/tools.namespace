(ns clojure.tools.namespace.tracker
  (:require [clojure.set :as set]
            [clojure.tools.namespace :as tns]
            [clojure.tools.namespace.dependency :as dep]))

(defn- remove-deps [deps new-decls]
  (reduce dep/remove-key deps (map second new-decls)))

(defn- add-deps [deps new-decls]
  (reduce (fn [ds decl]
            (let [nn (second decl)]
              (reduce #(dep/depend %1 nn %2)
                      ds (tns/deps-from-ns-decl decl))))
          deps new-decls))

(defn- update-deps [deps new-decls]
  (-> deps
      (remove-deps new-decls)
      (add-deps new-decls)))

(defn- affected-namespaces [deps new-decls]
  (let [new-names (map second new-decls)]
    (apply set/union
           (set new-names)
           (map #(dep/transitive-dependents deps %) new-names))))

(defn tracker []
  {:deps (dep/graph)
   :unload []
   :load []})

(defn update [state files]
  (if (:error state)
    state
    (let [deps (:deps state)
          new-decls (keep tns/read-file-ns-decl files)
          new-deps (update-deps deps new-decls)
          changed (affected-namespaces deps new-decls)]
      (assoc state
        :deps new-deps
        :unload (reverse (dep/topo-sort deps changed))
        :load (dep/topo-sort new-deps changed)))))

(defn reload [state]
  (let [state (dissoc state :error)
        {:keys [unload load]} state]
    (cond
      (seq unload)
        (let [n (first unload)]
          (prn (list 'remove-ns n))
          (remove-ns n)
          (recur (update-in state [:unload] rest)))
      (seq load)
        (let [n (first load)]
          (prn (list 'require n :reload))
          (let [r (try (require n :reload)
                       true
                       (catch Throwable t t))]
            (if (true? r)
              (recur (update-in state [:load] rest))
              (assoc state :error r :unload [n]))))
      :else
        state)))
