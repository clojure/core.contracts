(ns clojure.core.contracts-tests
  (:use [clojure.core.contracts :only (contract)]
        [clojure.test :only [deftest is]]
        clojure.core.contracts.impl.transformers))

(defn defer []
  (is (nil? (println "DEFERING TEST!!!"))))

(deftest contracts
  (defer))

(deftest regressions
  (defer))