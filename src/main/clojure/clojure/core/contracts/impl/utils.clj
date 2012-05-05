(ns clojure.core.contracts.impl.utils
  (:require [clojure.core.unify :as unify]))


(defn build-condition-body
  [p body prefix-msg]
  (unify/subst
   {'?P      p
    '?PREFIX prefix-msg
    '?BODY   body}
   
   '(try
      ((fn [] {?P ?PRE}
         ?BODY))
      (catch AssertionError ae
        (throw (AssertionError. (str ?PREFIX ?MSG \newline (.getMessage ae))))))))


(defn- build-pre-post-map
  [cnstr]
  (if (vector? cnstr)
    (let [[L M R] (partition-by #{'=>} cnstr)]
      {:pre  (vec (when (not= L '(=>)) L))
       :post (vec (if (= L '(=>)) M R))})
    cnstr))

(comment

  (build-pre-post-map '[(odd? n) (pos? n) => (int? %)])
  
)

(defmacro ^:private assert-w-message
  [check message]
  `(when-not ~check
     (throw (new AssertionError (str "Trammel assertion failed: " ~message "\n"
                                     (pr-str '~check))))))

(defn check-args!
  [name slots inv-description invariants]
  (assert-w-message (and inv-description (string? inv-description))
                    (str "Expecting an invariant description for " name))
  (assert-w-message (and invariants (or (map? invariants) (vector? invariants)))
                    (str "Expecting invariants of the form "
                         "[pre-conditions => post-conditions] or "
                         "{:pre [pre-conditions]}"
                         "for record type " name)))
