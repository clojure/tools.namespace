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
  "Returns an updated dependency tracker with new/updated namespaces.

  Depmap is a map describing the new or modified namespaces. Keys in
  the map are namespace names (symbols). Values in the map are sets of
  symbols naming the birect dependencies of each namespace. For
  example, assuming these ns declarations:

      (ns alpha (:require beta))
      (ns beta (:require gamma delta))

  the depmap would look like this:

      {alpha #{beta}
       beta  #{gamma delta}}

  After adding new/updated namespaces, the dependency tracker will
  have two lists:

      :unload is the list of namespaces that need to be removed

      :load is the list of namespaces that need to be reloaded

  To reload namespaces in the correct order, first remove/unload all
  namespaces in the :unload list, then (re)load all namespaces in
  the :load list.
"
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
  "Reads ns declarations from files and adds them to the dependency
  tracker."
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
  "Returns an updated dependency tracker from which the namespaces
  (symbols) have been removed. The :unload and :load lists indicate
  the order in which namespaces should be un/reloaded to reflect this
  change, as with add."
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
  "Returns an updated dependency tracker after removing files. The
  files must have been previously added to the dependency tracker
  using add-files."
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
  "Executes the next pending unload/reload operation in the dependency
  tracker. Returns the updated dependency tracker. If reloading caused
  an error, it is captured as :error."
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
  "Executes all pending unload/reload operations on dependency tracker
  until either an error is encountered or there are no more pending
  operations."
  [state]
  (loop [state (dissoc state :error)]
    (let [{:keys [unload load error]} state]
      (if (and (or (seq load) (seq unload))
               (not error))
        (recur (reload-one state))
        state))))
