(ns clojure.core.contracts-tests
  (:use [clojure.core.contracts :only (contract)])
  (:use [clojure.test :only [deftest is]]))

(defn defer []
  (is (nil? (println "DEFERING TEST!!!"))))

(deftest contracts
  (defer))
