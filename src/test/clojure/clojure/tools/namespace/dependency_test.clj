(ns clojure.tools.namespace.dependency-test
  (:use clojure.test
        clojure.tools.namespace.dependency))

;; building a graph like:
;;
;;       :a
;;      / |
;;    :b  |
;;      \ |
;;       :c
;;        |
;;       :d
;;
(def g1 (-> (graph)
            (depend :b :a)   ; "B depends on A"
            (depend :c :b)   ; "C depends on B"
            (depend :c :a)   ; "C depends on A"
            (depend :d :c))) ; "D depends on C"

;;      'one    'five
;;        |       |
;;      'two      |
;;       / \      |
;;      /   \     |
;;     /     \   /
;; 'three   'four
;;    |      /
;;  'six    /
;;    |    /
;;    |   /
;;    |  /
;;  'seven
;;
(def g2 (-> (graph)
            (depend 'two   'one)
            (depend 'three 'two)
            (depend 'four  'two)
            (depend 'four  'five)
            (depend 'six   'three)
            (depend 'seven 'six)
            (depend 'seven 'four)))

(deftest t-transitive-dependencies
  (is (= #{:a :c :b}
         (transitive-dependencies g1 :d)))
  (is (= '#{two four six one five three}
         (transitive-dependencies g2 'seven))))

(deftest t-transitive-dependents
  (is (= '#{four seven}
         (transitive-dependents g2 'five)))
  (is (= '#{four seven six three}
         (transitive-dependents g2 'two))))

(defn- before?
  "True if x comes before y in an ordered collection."
  [coll x y]
  (loop [[item & more] (seq coll)]
    (cond (nil? item) true  ; end of the seq
          (= x item) true  ; x comes first
          (= y item) false
          :else (recur more))))

(deftest t-before
  (is (true? (before? [:a :b :c :d] :a :b)))
  (is (true? (before? [:a :b :c :d] :b :c)))
  (is (false? (before? [:a :b :c :d] :d :c)))
  (is (false? (before? [:a :b :c :d] :c :a))))

(deftest t-topo-comparator-1
  (let [sorted (sort (topo-comparator g1) [:d :a :b :foo])]
    (are [x y] (before? sorted x y)
         :a :b
         :a :d
         :a :foo
         :b :d
         :b :foo
         :d :foo)))

(deftest t-topo-comparator-2
  (let [sorted (sort (topo-comparator g2) '[three seven nine eight five])]
    (are [x y] (before? sorted x y)
         'three 'seven
         'three 'eight
         'three 'nine
         'five  'eight
         'five  'nine
         'seven 'eight
         'seven 'nine)))

(deftest t-topo-sort
  (let [sorted (topo-sort g2)]
    (are [x y] (before? sorted x y)
         'one   'two
         'one   'three
         'one   'four
         'one   'six
         'one   'seven
         'two   'three
         'two   'four
         'two   'six
         'two   'seven
         'three 'six
         'three 'seven
         'four  'seven
         'five  'four
         'five  'seven
         'six   'seven)))

(deftest t-no-cycles
  (is (thrown? Exception
               (-> (graph)
                   (depend :a :b)
                   (depend :b :c)
                   (depend :c :a)))))

(deftest t-no-self-cycles
  (is (thrown? Exception
               (-> (graph)
                   (depend :a :b)
                   (depend :a :a)))))
