(ns clojure.tools.namespace.parse-test
  (:use [clojure.test :only (deftest is)]
        [clojure.tools.namespace.parse :only (deps-from-ns-decl)]))

(def ns-decl-prefix-list
  '(ns com.example.one
     (:require (com.example two
                            [three :as three]
                            [four :refer (a b)])
               (com.example.sub [five :as five]
                                six))
     (:use (com.example seven
                        [eight :as eight]
                        [nine :only (c d)]))))

;; Some people like to write prefix lists as vectors, not lists. The
;; use/require functions accept this form.
(def ns-decl-prefix-list-as-vector
  '(ns com.example.one
     (:require [com.example
                two
                [three :as three]
                [four :refer (a b)]]
               [com.example.sub
                [five :as five]
                six])
     (:use [com.example
            seven
            [eight :as eight]
            [nine :only (c d)]])))

(def deps-from-prefix-list
  '#{com.example.two
     com.example.three
     com.example.four
     com.example.sub.five
     com.example.sub.six
     com.example.seven
     com.example.eight
     com.example.nine})

(deftest t-prefix-list
  (is (= deps-from-prefix-list
         (deps-from-ns-decl ns-decl-prefix-list))))

(deftest t-prefix-list-as-vector
  (is (= deps-from-prefix-list
         (deps-from-ns-decl ns-decl-prefix-list-as-vector))))
