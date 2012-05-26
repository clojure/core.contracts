(ns clojure.core.contracts
  "The public contracts programming functions and macros for clojure.core.contracts."
  (:use [clojure.core.contracts.impl.transformers :only (build-contract-fn-body)])
  (:require [clojure.core.contracts.impl.utils :as tools]))

(defmacro contract
  [name docstring & constraints]
  (tools/assert-w-message (string? docstring) "Sorry, but contracts require docstrings")
  
  `(with-meta 
     ~(build-contract-fn-body name docstring constraints)
     {:docstring ~docstring
      ::constraints :TBD}))



(comment
  (def doubler-contract
    (contract doubler
      "ensures dublig"
      [x] [number? => (= (* 2 x) %)]

      [x y] [(every? number? [x y])
             =>
             (= (* 2 (+ x y)) %)]))

  (def x2 (fn f
            ([n] (* 2 n))
            ([n x] (+ (f n) (f x)))))
  
  (def doubler (partial doubler-contract x2))

  (doubler 2)
  (doubler 2 3)

  (def bad-doubler (partial doubler-contract (comp dec x2)))

  (bad-doubler 2)
  (bad-doubler 2 3)
)
