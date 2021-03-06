(ns clojure.core.provide-tests
  (:use [clojure.test :only (deftest is)]
        [clojure.core.contracts :as contract]))

;; # Inline contract syntax

(defn sqr [n]
  (* n n))

(contract/provide
 (sqr "The constraining of sqr" [n]
      [number? (not= 0 n)
       =>
       pos? number?]))

(deftest test-basic-provide-syntax
  (is (= 25 (sqr 5)))
  (is (= 25 (sqr -5)))
  (is (thrown? AssertionError (sqr 0))))

;; # Contract name use

(defn sqr2 [n]
  (* n n))

(def sqr-c
  (contract sqr-contract
    "Defines the constraints on squaring."
    [n] [number? (not= 0 n) => pos? number?]))

(contract/provide
 (sqr2 "Apply the contract for squaring" sqr-c))

(deftest test-apply-existing-contract-by-name
  (is (= 25 (sqr2 5)))
  (is (= 25 (sqr2 -5)))
  (is (thrown? AssertionError (sqr2 0))))

;; Multi-arity

(defn times2
  ([x] (* 2 x))
  ([x y] (* y x 2)))

(contract/provide
 (times2 "The constraining of times2"
   [n]   [number? => number? (== % (* 2 n))]
   [x y] [(every? number? [x y]) => number? (== % (* x y 2))]))

(deftest test-apply-provide-contract-arity2-syntax
  (is (= 10 (times2 5)))
  (is (= -10 (times2 -5)))
  (is (thrown? AssertionError (times2 :a)))
  (is (= 20 (times2 2 5)))
  (is (= -20 (times2 -5 2)))
  (is (thrown? AssertionError (times2 5 :a))))
