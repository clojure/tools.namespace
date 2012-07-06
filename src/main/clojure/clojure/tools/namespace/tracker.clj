(ns clojure.tools.namespace.tracker
  (:require [clojure.set :as set]
            [clojure.tools.namespace :as tns]
            [clojure.tools.namespace.dependency :as dep]))

(defn- remove-deps [deps names]
  (reduce dep/remove-key deps names))

(defn- add-deps [deps depmap]
  (reduce (fn [ds [name dependencies]]
            (reduce (fn [g dep] (dep/depend g name dep))
                    ds dependencies))
          deps depmap))

(defn- update-deps [deps depmap]
  (-> deps
      (remove-deps (keys depmap))
      (add-deps depmap)))

(defn- affected-namespaces [deps names]
  (apply set/union
         (set names)
         (map #(dep/transitive-dependents deps %) names)))

(defn tracker
  "Returns a new namespace dependency tracker."
  []
  {:deps (dep/graph)
   :unload ()
   :load ()})

(defn add
  "Depmap is a map from a namespace name to the set of names of
  namespaces it depends on."
  [state depmap]
  (let [{:keys [load unload deps nsmap]} state
        new-deps (update-deps deps depmap)
        changed (affected-namespaces new-deps (keys depmap))]
    (assoc state
      :deps new-deps
      :unload (distinct
               (concat (reverse (sort (dep/topo-comparator deps) changed))
                       unload))
      :load (distinct
             (concat (sort (dep/topo-comparator new-deps) changed)
                     load)))))

(defn add-files
  "Reads ns declarations from files; returns an updated dependency
  tracker indicating which namespaces need to be reloaded after files
  were added."
  [state files]
  (let [{:keys [depmap filemap]}
        (reduce (fn [m file]
                  (if-let [decl (tns/read-file-ns-decl file)]
                    (let [deps (tns/deps-from-ns-decl decl)
                          name (second decl)]
                      (-> m
                          (assoc-in [:depmap name] deps)
                          (assoc-in [:filemap file] name)))
                    m))
                {} files)]
    (-> state
        (add depmap)
        (update-in [:filemap] (fnil merge {}) filemap))))

(defn remove-names
  [state names]
  (let [{:keys [load unload deps]} state
        known (set (dep/keys deps))
        removed-names (filter known names)
        new-deps (remove-deps deps removed-names)
        changed (affected-namespaces deps removed-names)]
    (assoc state
      :deps new-deps
      :unload (distinct
               (concat (reverse (sort (dep/topo-comparator deps) changed))
                       unload))
      :load (distinct
             (filter (complement (set removed-names))
                     (concat (sort (dep/topo-comparator new-deps) changed)
                             load))))))

(defn remove-files
  "Returns an updated dependency tracker indicating which namespaces
  need to be reloaded after files were removed."
  [state files]
  (-> state
      (remove-names (keep (:filemap state {}) files))
      (update-in [:filemap] #(apply dissoc % files))))

(defn remove-lib
  "Remove lib's namespace and remove lib from the set of loaded libs."
  [lib]
  (remove-ns lib)
  (dosync (alter @#'clojure.core/*loaded-libs* disj lib)))

(defn reload-one
  "Executes one unload/reload operation; returns updated dependency
  tracker indicating errors and which namespaces remain to be
  removed/reloaded."
  [state]
  (let [{:keys [unload load]} state]
    (cond
      (seq unload)
        (let [n (first unload)]
          (prn :unloading n)
          (remove-lib n)
          (update-in state [:unload] rest))
      (seq load)
        (let [n (first load)]
          (try (prn :loading n)
               (require n :reload)
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
