(ns clojure.core.constraints-tests
  (:use [clojure.test :only (deftest is)]
        [clojure.core.contracts.constraints :only (defconstrainedrecord)]))

(defconstrainedrecord Foo [a]
  "My doc"
  [])

(deftest instance-predicate-test
  (is (Foo? (->Foo 'a)))
  (is (not (Foo? nil))))

;(let [a (->Foo 'a)]
;  (time
;    (dotimes [_ 1e6]
;      (Foo? a))))
; 17ms (instance?)
; 185ms (type)
