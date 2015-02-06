(ns project-euler-solutions.problem-2
  (:require [project-euler-solutions.core :refer :all]))

(defn sum-even-fibo
  "Sums the even Fibonacci numbers for those terms less than or equal to
   ceiling.  If ceiling is not provided, 4000000 is used."
  ([] (sum-even-fibo 4000000))
  ([ceiling]
     (reduce + 0 (for [x (filter even? fibonacci-numbers) :while (<= x ceiling)] x))))

(defn sum-even-fibo-v1
  "Sums the even Fibonacci numbers for those terms less than or equal to
   ceiling.  If ceiling is not provided, 4000000 is used.
   Note: This implementation is more verbose than sum-even-fibo."
  ([] (sum-even-fibo-v1 4000000))
  ([ceiling]
     (let [even-fibo (filter even? fibonacci-numbers)]
       (loop [term 0
              running-total 0]
         (let [addend (nth even-fibo term)]
           (if (> addend ceiling)
             running-total
             (recur (inc term) (+ running-total addend))))))))
