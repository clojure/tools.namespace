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

(defn- affected-namespaces [deps new-names]
  (apply set/union
         (set new-names)
         (map #(dep/transitive-dependents deps %) new-names)))

(defn tracker
  "Returns a new namespace dependency tracker."
  []
  {:deps (dep/graph)
   :unload ()
   :load ()
   :namespaces {}})

(defn add-files
  "Reads ns declarations from files; returns an updated dependency
  tracker indicating which namespaces need to be reloaded after files
  were added."
  [state files]
  (let [{:keys [load unload deps namespaces]} state
        new-pairs (keep (fn [file]
                          (when-let [decl (tns/read-file-ns-decl file)]
                            [file decl]))
                        files)
        new-decls (map second new-pairs)
        new-deps (update-deps deps new-decls)
        changed (affected-namespaces deps (map second new-decls))]
    (assoc state
      :namespaces (into namespaces new-pairs)
      :deps new-deps
      :unload (distinct
               (concat (reverse (sort (dep/topo-comparator deps) changed))
                       unload))
      :load (distinct
             (concat (sort (dep/topo-comparator new-deps) changed)
                     load)))))

(defn remove-files
  "Returns an updated dependency tracker indicating which namespaces
  need to be reloaded after files were removed."
  [state files]
  (let [{:keys [load unload deps namespaces]} state
        removed (keep (comp second namespaces) files)
        new-deps (reduce dep/remove-key deps removed)
        changed (affected-namespaces deps removed)]
    (assoc state
      :namespaces (apply dissoc namespaces files)
      :deps new-deps
      :unload (distinct
               (concat (reverse (sort (dep/topo-comparator deps) changed))
                       unload))
      :load (distinct
             (filter (complement (set removed))
                     (concat (sort (dep/topo-comparator new-deps) changed)
                             load))))))

(defn reload-one
  "Executes one unload/reload operation; returns updated dependency
  tracker indicating errors and which namespaces remain to be
  removed/reloaded."
  [state]
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

(defn reload
  "Executes remove/reload operations on a dependency tracker until
  either an error is encountered or there are no more pending
  operations."
  [state]
  (loop [state (dissoc state :error)]
    (let [{:keys [unload load error]} state]
      (if (and (or (seq load) (seq unload))
               (not error))
        (recur (reload-one state))
        state))))
