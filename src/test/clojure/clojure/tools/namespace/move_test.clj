(ns clojure.tools.namespace.move-test
  (:use [clojure.java.io :as io]
        [clojure.test :only (deftest is)]
        [clojure.tools.namespace.move :only (move-ns)])
  (:import (java.io File)))

(defn- create-temp-dir
  "Creates and returns a new temporary directory java.io.File."
  [name]
  (let [temp-file (File/createTempFile name nil)]
    (.delete temp-file)
    (.mkdirs temp-file)
    temp-file))

(def ^:private file-one-contents "
 (ns com.example.one
   (:require [com.example.two :as two]
             [com.example.three :as three]))

 (defn foo []
   (com.example.a.four/foo))
")

(def ^:private file-two-contents "
 (ns com.example.two
   (:require [com.example.three :as three]
             [com.example.a.four :as four]))
")

(def ^:private file-three-contents "
 (ns com.example.three
   (:use com.example.five))
")

(def ^:private file-four-contents "
 (ns com.example.a.four)
 (defn foo [] \"foo\")
")

(deftest t-move-ns
  (let [temp-dir (create-temp-dir "tools-namespace-t-move-ns")
        src-dir (io/file temp-dir "src")
        example-dir (io/file temp-dir "src" "com" "example")
        file-one (io/file example-dir "one.clj")
        file-two (io/file example-dir "two.clj")
        file-three (io/file example-dir "three.clj")
        old-file-four (io/file example-dir "a" "four.clj")
        new-file-four (io/file example-dir "b" "four.clj")]

    (.mkdirs (io/file example-dir "a"))
    (spit file-one file-one-contents)
    (spit file-two file-two-contents)
    (spit file-three file-three-contents)
    (spit old-file-four file-four-contents)
    (Thread/sleep 1500) ;; ensure file timestamps are different

    (let [file-three-last-modified (.lastModified file-three)]

      (move-ns 'com.example.a.four 'com.example.b.four src-dir [src-dir])

      (is (.exists new-file-four)
          "new file should exist")
      (is (not (.exists old-file-four))
          "old file should not exist")
      (is (not (.exists (.getParentFile old-file-four)))
          "old empty directory should not exist")
      (is (= file-three-last-modified (.lastModified file-three))
          "unaffected file should not have been modified")
      (is (not-any? #(.contains (slurp %) "com.example.a.four")
                    [file-one file-two file-three new-file-four]))
      (is (every? #(.contains (slurp %) "com.example.b.four")
                  [file-one file-two new-file-four])))))
