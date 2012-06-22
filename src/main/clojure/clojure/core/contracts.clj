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

(defn with-constraints
  "A contract combinator.

   Takes a target function and a number of contracts and returns a function with the contracts
   applied to the original.  This is the preferred way to apply a contract previously created
   using `contract` as the use of `partial` may not work as implementation details change.
  "
  ([f] f)
  ([f c] (partial c f))
  ([f c & more]
     (apply with-constraints (with-constraints f c) more)))

(defmacro provide
  "Provides the Var manipulation macro offering ex post facto application of contracts
   to existing functions."
  [& kontracts]
  (let [fn-names  (map first kontracts)
        kontracts (for [[n ds & more] kontracts]
                    (if (list? (first more))
                      (list* `contract n ds more)
                      (first more)))]
    `(do
       ~@(for [[n# c#] (zipmap fn-names kontracts)]
           (list `alter-var-root (list `var n#)
                 (list `fn '[f c] (list `with-constraints 'f 'c)) c#))
       nil)))

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
