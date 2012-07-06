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
  (let [{:keys [load unload deps]} state
        new-decls (keep tns/read-file-ns-decl files)
        new-deps (update-deps deps new-decls)
        changed (affected-namespaces deps new-decls)]
    (assoc state
      :deps new-deps
      :unload (distinct
               (concat (reverse (sort (dep/topo-comparator deps) changed))
                       unload))
      :load (distinct
             (concat (sort (dep/topo-comparator new-deps) changed)
                     load)))))

(defn reload-one [state]
  (let [{:keys [unload load]} state]
    (cond
      (seq unload)
        (let [n (first unload)]
          (remove-ns n)
          (update-in state [:unload] rest))
      (seq load)
        (let [n (first load)]
          (try (require n :reload)
               (update-in state [:load] rest)
               (catch Throwable t
                 (assoc state :error t :unload [n]))))
      :else
        state)))

(defn reload-all [state]
  (loop [state (dissoc state :error)]
    (let [{:keys [unload load error]} state]
      (if (and (or (seq load) (seq unload))
               (not error))
        (recur (reload-one state))
        state))))
