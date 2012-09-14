(ns clojure.core.provide-tests
  (:require [clojure.core.contracts :as contracts :refer (contract)])
  (:use [clojure.test :only (deftest is)]))

;; # Inline contract syntax

(defn sqr [n]
  (* n n))

(contracts/provide
 (sqr "The constraining of sqr" [n]
      [number? (not= 0 n)
       =>
       pos? number?]))

(deftest test-provide
  (is (= 25 (sqr 5)))
  (is (= 25 (sqr -5)))
  (is (thrown? AssertionError (sqr 0))))

(comment

  (sqr 0)

)


;; # Contract name use

(defn sqr2 [n]
  (* n n))

(def sqr-c
  (contract sqr-contract
    "Defines the constraints on squaring."
    [n] [number? (not= 0 n) => pos? number?]))

(contracts/provide
 (sqr2 "Apply the contract for squaring" sqr-c))

(deftest apply-existing-contract-test
  (is (= 25 (sqr2 5)))
  (is (= 25 (sqr2 -5)))
  (is (thrown? AssertionError (sqr2 0))))

;; Multi-arity

(defn times2
  ([x] (* 2 x))
  ([x y] (* y x 2)))

(contracts/provide
 (times2 "The constraining of times2"
   [n]   [number? => number? (== % (* 2 n))]
   [x y] [(every? number? [x y]) => number? (== % (* x y 2))]))

(deftest apply-contract-arity2-test
  (is (= 10 (times2 5)))
  (is (= -10 (times2 -5)))
  (is (thrown? AssertionError (times2 :a)))
  (is (= 20 (times2 2 5)))
  (is (= -20 (times2 -5 2)))
  (is (thrown? AssertionError (times2 5 :a))))
