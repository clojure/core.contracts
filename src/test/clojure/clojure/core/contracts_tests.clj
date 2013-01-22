(ns clojure.core.contracts-tests
  (:use [clojure.test :only [deftest is]]
        clojure.core.contracts.impl.transformers
        clojure.core.contracts))

(defn defer [desc]
  (is (nil? (println (str "DEFERING TEST: " desc)))))


(deftest test-simple-contract
  (let [doubler-contract (contract doubler
                           "ensures dublig"
                           [x] [number? => (= (* 2 x) %)]
                           [x y] [(every? number? [x y])
                                  =>
                                  (= (* 2 (+ x y)) %)])

        x2 (fn f
            ([n] (* 2 n))
            ([n x] (+ (f n) (f x))))

        good-doubler (partial doubler-contract x2)
        bad-doubler (partial doubler-contract (comp dec x2))]

    (is (= 4  (good-doubler 2)))
    (is (= 10 (good-doubler 2 3)))
    (is (thrown? AssertionError (bad-doubler 2)))
    (is (thrown? AssertionError (bad-doubler 2 3)))))

(deftest test-full-contract-on-isolated-fn
  (let [doubler-contract-full-and-isolated-fn
        (contract doubler
          "Test"
          [x] [pos? => (= (* 2 x) %)]
          [x y] [(pos? x) (pos? y) => (= (* 2 (+ x y)) %)])]

    (is (= 10 ((partial doubler-contract-full-and-isolated-fn #(* 2 (+ %1 %2))) 2 3)))
    (is (= 10 ((partial doubler-contract-full-and-isolated-fn #(+ %1 %1 %2 %2)) 2 3)))
    (is (= 10 ((partial doubler-contract-full-and-isolated-fn #(* 2 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-full-and-isolated-fn #(* 3 (+ %1 %2))) 2 3)))))

(deftest test-contract-arity1
  (let [doubler-contract-arity1
        (contract doubler
          "Test"
          [x] [(pos? x) => (= (* 2 x) %)])]

    (is (= 10 ((partial doubler-contract-arity1 #(* 2 %)) 5)))
    (is (= 10 ((partial doubler-contract-arity1 #(* 2 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-arity1 #(* 3 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-arity1 #(* 2 %)) -5)))))

(deftest test-contract-arity1-and-isolated-fn
  (let [doubler-contract-arity1-and-isolated-fn
        (contract doubler
          "Test"
          [x] [pos? => (= (* 2 x) %)])]

    (is (= 10 ((partial doubler-contract-arity1-and-isolated-fn #(* 2 %)) 5)))
    (is (= 10 ((partial doubler-contract-arity1-and-isolated-fn #(* 2 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-arity1-and-isolated-fn #(* 3 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-arity1-and-isolated-fn #(* 2 %)) -5)))))

(deftest test-partial-contract-no-requires
  (let [doubler-contract-no-requires
        (contract doubler
          "Test"
          [x] [=> (= (* 2 x) %)])]

    (is (= 10 ((partial doubler-contract-no-requires #(* 2 %)) 5)))
    (is (= -10 ((partial doubler-contract-no-requires #(* 2 %)) -5)))
    (is (thrown? Error ((partial doubler-contract-no-requires #(* 3 %)) 5)))))

(deftest test-partial-contract-no-requires-and-isolated-fn
  (let [doubler-contract-no-requires-and-isolated-fn
        (contract doubler
          "Test"
          [x] [=> pos? (= (* 2 x) %)])]

    (is (= 10 ((partial doubler-contract-no-requires-and-isolated-fn #(* 2 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-no-requires-and-isolated-fn #(* 2 %)) -5)))
    (is (thrown? Error ((partial doubler-contract-no-requires-and-isolated-fn #(* 3 %)) 5)))))

(deftest test-partial-contract-no-ensures
  (let [doubler-contract-no-ensures
        (contract doubler
          "Test"
          [x] [(pos? x)])]

    (is (= 10 ((partial doubler-contract-no-ensures #(* 2 %)) 5)))
    (is (= 15 ((partial doubler-contract-no-ensures #(* 3 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-no-ensures #(* 2 %)) -5)))))

(deftest test-partial-contract-no-ensures-and-isolated-fn
  (let [doubler-contract-no-ensures-and-isolated-fn
        (contract doubler
          "Test"
          [x] [pos?])]

    (is (= 10 ((partial doubler-contract-no-ensures-and-isolated-fn #(* 2 %)) 5)))
    (is (= 15 ((partial doubler-contract-no-ensures-and-isolated-fn #(* 3 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-no-ensures-and-isolated-fn #(* 2 %)) -5)))))

#_(deftest test-map-version-of-contract
  (let [doubler-contract-full-mappy
        (contract doubler
          "Test"
          [x] {:pre  [(pos? x)]
               :post [(= (* 2 x) %)]}
          [x y] {:pre [(pos? x) (pos? y)]
                 :post [(= (* 2 (+ x y)) %)]})]

    (is (= 10 ((partial doubler-contract-full-mappy #(* 2 (+ %1 %2))) 2 3)))
    (is (= 10 ((partial doubler-contract-full-mappy #(+ %1 %1 %2 %2)) 2 3)))
    (is (= 10 ((partial doubler-contract-full-mappy #(* 2 %)) 5)))
    (is (thrown? Error ((partial doubler-contract-full-mappy #(* 3 (+ %1 %2))) 2 3)))))

(deftest test-regressions
  (defer "regression testing"))
