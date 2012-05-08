(ns clojure.core.contracts.impl.transformers
  (:use [clojure.core.contracts.impl.funcify :only (funcify)])
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

(defn- build-constraints-map
  [args cnstr]
  (let [cnstr (vec (tag-hocs cnstr))]
    [args
     (->> (build-pre-post-map cnstr)
          (utils/manip-map (partial funcify '[%]) [:post])
          (utils/manip-map (partial funcify args) [:pre]))]))


(defn build-contract-body
  [args cnstr descr]
  (let [c (build-constraints-map args cnstr)]
    (unify/subst
     {'?ARGS       args
      '?F          'f
      '?PARMS      (vec (list* 'f args))
      '?PRE        (:pre c)
      '?POST       (:post c)
      '?MSG        descr
      '?PRE-CHECK  (build-condition-body :pre  '(apply ?F ?ARGS) "Pre-condition failure: ")
      '?POST-CHECK (build-condition-body :post 'ret "Post-condition failure: ")}
     
     '(?PARMS
       (let [ret ?PRE-CHECK]
         ?POST-CHECK)))))

