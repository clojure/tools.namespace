;; Copyright (c) Stuart Sierra, 2012. All rights reserved. The use and
;; distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this
;; distribution. By using this software in any fashion, you are
;; agreeing to be bound by the terms of this license. You must not
;; remove this notice, or any other, from this software.

(ns ^{:author "Stuart Sierra"
      :doc "REPL utilities for working with namespaces"}
  clojure.tools.namespace.repl
  (:require [clojure.tools.namespace.track :as track]
            [clojure.tools.namespace.dir :as dir]
            [clojure.tools.namespace.find :as find]
            [clojure.tools.namespace.reload :as reload]))

(defonce refresh-tracker (track/tracker))

(defonce refresh-dirs [])

(defn- print-and-return [tracker]
  (if-let [e (::reload/error tracker)]
    (do (when (thread-bound? #'*e)
          (set! *e e))
        (prn :error-while-loading (::reload/error-ns tracker))
        e)
    :ok))

(defn- print-pending-reloads [tracker]
  (prn :reloading (::track/load tracker)))

(defn- load-disabled? [sym]
  (false? (::load (meta (find-ns sym)))))

(defn- unload-disabled? [sym]
  (or (false? (::unload (meta (find-ns sym))))
      (load-disabled? sym)))

(defn- remove-disabled [tracker]
  (-> tracker
      (update-in [::track/unload] #(remove unload-disabled? %))
      (update-in [::track/load] #(remove load-disabled? %))))

(defn- referred
  "Given a Namespace object, returns a map of symbols describing the
  Vars it refers from other namespaces, in the following form:

     {other-namespace-name {symbol-in-other-ns symbol-in-this-ns}}"
  [ns]
  (reduce (fn [m [sym var]]
            (let [ns-name (ns-name (:ns (meta var)))
                  var-name (:name (meta var))]
              (assoc-in m [ns-name var-name] sym)))
          {}
          (ns-refers ns)))

(defn- aliased
  "Given a namespace object, returns a map of symbols describing its
  aliases, in the following form:

      {alias-symbol namespace-name}"
  [ns]
  (reduce (fn [m [alias n]] (assoc m alias (ns-name n)))
          {} (ns-aliases ns)))

(defn- recover-ns
  "Given the maps returned by 'referred' and 'aliased', attempts to
  restore as many bindings as possible into the current namespace. Any
  bindings to namespaces or Vars which do not currently exist will be
  ignored."
  [refers aliases]
  (doseq [[ns-name symbol-map] refers]
    (when-let [ns (find-ns ns-name)]
      (doseq [[source-name target-name] symbol-map]
        (when (ns-resolve ns source-name)
          (if (= source-name target-name)
            (refer ns-name :only (list source-name))
            (refer ns-name :only () :rename {source-name target-name}))))))
  (doseq [[alias-sym ns-name] aliases]
    (when (find-ns ns-name)
      (alias alias-sym ns-name))))

(defn scan
  "Scans directories for files which have changed since the last time
  'scan' or 'refresh' was run; updates the dependency tracker
  with new/changed/deleted files.

  Optional argument is map of options:

      :platform  Either clj (default) or cljs, both defined in
                 clojure.tools.namespace.find, controls file extensions
                 and reader options.

      :add-all?  If true, assumes all extant files are modified regardless
                 of filesystem timestamps.

  Returns map with keys:

      ::track/unload   list of namespace symbols that will be unloaded
      ::track/load     list of namespace symbols that will be loaded"
  ([]
   (scan nil))
  ([options]
   (alter-var-root #'refresh-tracker
     #(-> %
        (dir/scan-dirs refresh-dirs options)
        (remove-disabled)))))

(defn refresh-scanned
  "Reloads namespaces in dependency order. Does not scan directories again,
  expected to be used after 'scan'.

  Returns :ok or an error; sets the latest exception to
  clojure.core/*e (if *e is thread-bound).

  The directories to be scanned are controlled by 'set-refresh-dirs';
  defaults to all directories on the Java classpath.

  Options are key-value pairs. Valid options are:

      :after   Namespace-qualified symbol naming a zero-argument
               function to be invoked after a successful refresh. This
               symbol will be resolved *after* all namespaces have
               been reloaded."
  [& options]
  (let [{:keys [after]} options]
    (when after
      (assert (symbol? after) ":after value must be a symbol")
      (assert (namespace after)
        ":after value must be a namespace-qualified symbol"))
    (let [current-ns-name (ns-name *ns*)
          current-ns-refers (referred *ns*)
          current-ns-aliases (aliased *ns*)]
      (print-pending-reloads refresh-tracker)
      (alter-var-root #'refresh-tracker reload/track-reload)
      (in-ns current-ns-name)
      (let [result (print-and-return refresh-tracker)]
        (if (= :ok result)
          (if after
            (if-let [after (ns-resolve *ns* after)]
              (after)
              (throw (Exception.
                       (str "Cannot resolve :after symbol " after))))
            result)
          ;; There was an error, recover as much as we can:
          (do (when-not (or (false? (::unload (meta *ns*)))
                          (false? (::load (meta *ns*))))
                (recover-ns current-ns-refers current-ns-aliases))
            ;; Return the Exception to the REPL:
            result))))))

(defn disable-unload!
  "Adds metadata to namespace (or *ns* if unspecified) telling
  'refresh' not to unload it. The namespace may still be reloaded, it
  just won't be removed first.

  Warning: Aliases to reloaded namespaces will break."
  ([] (disable-unload! *ns*))
  ([namespace] (alter-meta! namespace assoc ::unload false)))

(defn disable-reload!
  "Adds metadata to namespace (or *ns* if unspecified) telling
  'refresh' not to load it. Implies disable-unload! also.

  Warning: Aliases to reloaded namespaces will break."
  ([] (disable-reload! *ns*))
  ([namespace] (alter-meta! namespace assoc ::load false)))

(defn refresh
  "Scans source code directories for files which have changed (since
  the last time this function was run) and reloads them in dependency
  order. Returns :ok or an error; sets the latest exception to
  clojure.core/*e (if *e is thread-bound).

  The directories to be scanned are controlled by 'set-refresh-dirs';
  defaults to all directories on the Java classpath.

  Options are key-value pairs. Valid options are:

      :after   Namespace-qualified symbol naming a zero-argument
               function to be invoked after a successful refresh. This
               symbol will be resolved *after* all namespaces have
               been reloaded."
  [& options]
  (let [{:keys [after]} options]
    (scan {:platform find/clj})
    (apply refresh-scanned options)))

(defn refresh-all
  "Scans source code directories for all Clojure source files and
  reloads them in dependency order.

  The directories to be scanned are controlled by 'set-refresh-dirs';
  defaults to all directories on the Java classpath.

  Options are key-value pairs. Valid options are:

      :after   Namespace-qualified symbol naming a zero-argument
               function to be invoked after a successful refresh. This
               symbol will be resolved *after* all namespaces have
               been reloaded."
  [& options]
  (let [{:keys [after]} options]
    (scan {:platform find/clj
           :add-all? true})
    (apply refresh-scanned options)))

(defn set-refresh-dirs
  "Sets the directories which are scanned by 'refresh'. Supports the
  same types as clojure.java.io/file."
  [& dirs]
  (alter-var-root #'refresh-dirs (constantly dirs)))

(defn clear
  "Clears all state from the namespace/file tracker. This may help
  repair the namespace tracker when it gets into an inconsistent
  state, without restarting the Clojure process. The next call to
  'refresh' will reload all source files, but may not completely
  remove stale code from deleted files."
  []
  (alter-var-root #'refresh-tracker (constantly (track/tracker))))
