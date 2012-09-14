(ns clojure.core.contracts-tests
  (:require [clojure.core.contracts :as c :refer (contract)])
  (:use [clojure.test :only [deftest is]]
        clojure.core.contracts.impl.transformers))

(defn defer [desc]
  (is (nil? (println (str "DEFERING TEST: " desc)))))


(deftest test-simple-contract
  (let [doubler-contract (contract doubler
                           "ensures dublig"
                           [x] [number? => (= (* 2 x) %)]
                           [x y] [(every? number? [x y])
                                  =>
                                  (= (* 2 (+ x y)) %)])

        x2 (fn f
            ([n] (* 2 n))
            ([n x] (+ (f n) (f x))))

        good-doubler (partial doubler-contract x2)
        bad-doubler (partial doubler-contract (comp dec x2))]

    (is (= 4  (good-doubler 2)))
    (is (= 10 (good-doubler 2 3)))
    (is (thrown? AssertionError (bad-doubler 2)))
    (is (thrown? AssertionError (bad-doubler 2 3)))))

(deftest test-regressions
  (defer "regression testing"))
