(ns clojure.core.contracts.impl.transformers
  (:require [clojure.core.unify :as unify]
            [clojure.core.contracts.impl.utils :as utils]))


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
  "(build-pre-post-map '[(odd? n) (pos? n) => (int? %)])
   ;=> {:pre [...] :post [...]}
  "
  [cnstr]
  (if (vector? cnstr)
    (let [[L M R] (partition-by #{'=>} cnstr)]
      {:pre  (vec (when (not= L '(=>)) L))
       :post (vec (if (= L '(=>)) M R))})
    cnstr))


(defn- tag-hocs
  [cnstr]
  (map (fn [form]
         (if (and (seq? form) (= '_ (first form)))
           (list 'fn? (second form))
           form))
       cnstr))

