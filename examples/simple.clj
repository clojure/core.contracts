
(defn sqr [n] (* n n))

(sqr 10)
;=> 100

(sqr 0)
;=> 0

(contracts/provide 
  (sqr "Constraints for squaring" 
    [x] [number? (not= 0 x) => number? pos?]))
