(ns project-euler-solutions.problem-1
  (:require [project-euler-solutions.core :refer :all]))

(defn brute-force-solution
  "O(n) solution to Project Euler problem 1.  If no argument is supplied, 1000 is used."
  ([] (brute-force-solution 1000))
  ([below] (reduce +
                   0
                   (filter #(or (= 0 (mod % 3))
                                (= 0 (mod % 5))) (take below (iterate inc 0))))))

(defn incl-excl-solution
  "O(1) solution to Project Euler problem 1.  If no argument is supplied, 1000
   is used.  Leverages the inclusion-exclusion principal as well as a formula
   for computing the partial sum of a sequence."
  ([]
     (incl-excl-solution 1000))
  ([below]
     (let [one-less-below (dec below)]
       (- (+ (sum-multiples 3 one-less-below)
             (sum-multiples 5 one-less-below))
          (sum-multiples (* 3 5) one-less-below)))))
