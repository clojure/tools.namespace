(ns clojure.tools.namespace.poll
  (:require [clojure.tools.namespace.tracker :as tracker]
            [clojure.java.io :as io]
            [clojure.set :as set])
  (:import (java.util.concurrent Executors ThreadFactory TimeUnit)))

(defn before [state]
  (let [{:keys [error time load unload time]} state
        date (doto (java.util.GregorianCalendar.)
               (.setTimeInMillis time))]
    (prn (array-map :unload unload :reload load :time date))))

(defn after [state]
  (let [{:keys [error load]} state]
    (when error
      (prn (array-map :error error :pending load)))))

(defn clojure-file? [file]
  (and (.isFile file)
       (.endsWith (.getName file) ".clj")))

(defn find-files [state]
  (->> (:dirs state)
       (map io/file)
       (filter #(.exists %))
       (mapcat file-seq)
       (filter clojure-file?)
       (map #(.getCanonicalFile %))))

(defn modified-files [state files]
  (filter #(< (:time state) (.lastModified %)) files))

(defn deleted-files [state files]
  (set/difference (:files state) (set files)))

(defn watcher [& options]
  (merge {:dirs ["src" "test"]
          :time 0
          :files #{}}
         (tracker/tracker)
         (apply hash-map options)))

(defn update-reload [state deleted modified]
  (let [now (System/currentTimeMillis)]
    (-> state
        (update-in [:files] #(apply disj % deleted))
        (tracker/remove-files deleted)
        (update-in [:files] into modified)
        (tracker/add-files modified)
        (assoc :time now)
        (doto before)
        tracker/reload
        (doto after))))

(defn poll-reload [state]
  (let [files (find-files state)
        deleted (seq (deleted-files state files))
        modified (seq (modified-files state files))]
    (if (or deleted modified)
      (update-reload state deleted modified)
      state)))

(def default-delay 500)

(let [a (atom -1)]
  (defn- default-executor []
    (Executors/newSingleThreadScheduledExecutor
     (reify ThreadFactory
       (newThread [this r]
         (Thread. r (str "clojure.tools.namespace.watch executor "
                         (swap! a inc))))))))

(defn poll [& options]
  (let [{:keys [watcher delay executor]
         :or {watcher (watcher)
              delay default-delay
              executor (default-executor)}} options
        a (atom watcher)
        f (bound-fn []
            (try (reset! a (poll-reload @a))
                 (catch Throwable t
                   (binding [*out* (java.io.PrintWriter. *err*)]
                     (println "ERROR in scheduled task"
                              "from clojure.tools.namespace.watch")
                     (.printStackTrace t *out*)))))]
    (.scheduleWithFixedDelay executor f 
                             0 delay TimeUnit/MILLISECONDS)))
