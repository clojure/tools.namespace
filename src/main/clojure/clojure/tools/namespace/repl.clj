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
            [clojure.tools.namespace.reload :as reload]))

(defonce ^:private refresh-tracker (track/tracker))

(defonce ^:private refresh-dirs [])

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

(defn- do-refresh [scan-fn]
  (let [current-ns (ns-name *ns*)]
    (alter-var-root #'refresh-tracker scan-fn)
    (alter-var-root #'refresh-tracker remove-disabled)
    (print-pending-reloads refresh-tracker)
    (alter-var-root #'refresh-tracker reload/track-reload)
    (in-ns current-ns)
    (print-and-return refresh-tracker)))

(defn disable-unload!
  "Adds metadata to namespace (or *ns* if unspecified) telling
  'refresh' not to unload it. The namespace may still be reloaded, it
  just won't be removed first."
  ([] (disable-unload! *ns*))
  ([namespace] (alter-meta! namespace assoc ::unload false)))

(defn disable-reload!
  "Adds metadata to namespace (or *ns* if unspecified) telling
  'refresh' not to load it. Implies disable-unload! also."
  ([] (disable-reload! *ns*))
  ([namespace] (alter-meta! namespace assoc ::load false)))

(defn refresh
  "Scans source code directories for files which have changed (since
  the last time this function was run) and reloads them in dependency
  order. Returns :ok or an error; sets the latest exception to
  clojure.core/*e (if *e is thread-bound).

  The directories to be scanned are controlled by 'set-refresh-dirs';
  defaults to all directories on the Java classpath."
  []
  (do-refresh #(apply dir/scan % refresh-dirs)))

(defn refresh-all
  "Scans source code directories for all Clojure source files and
  reloads them in dependency order.

  The directories to be scanned are controlled by 'set-refresh-dirs';
  defaults to all directories on the Java classpath."
  []
  (do-refresh #(apply dir/scan-all % refresh-dirs)))

(defn set-refresh-dirs
  "Sets the directories which are scanned by 'refresh'. Supports the
  same types as clojure.java.io/file."
  [& dirs]
  (alter-var-root #'refresh-dirs (constantly dirs)))
