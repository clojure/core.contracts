(ns clojure.core.with-constraints-tests
  (:use [clojure.core.contracts :only (contract with-constraints provide)]
        [clojure.test :only [deftest is]]
        clojure.core.contracts.impl.transformers))

(defn sqr [n]
  (* n n))

(def sqr-contract
  (contract sqr-constraints
    "Defines the constraints for squaring"
    [n] [number? (not= 0 n) => pos? number?]))

(def constrained-sqr
  (with-constraints
    sqr
    sqr-contract))

(deftest test-with-constraints
  (is (= 4  (constrained-sqr 2)))
  (is (thrown? AssertionError (constrained-sqr 0))))

