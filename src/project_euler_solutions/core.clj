(ns project-euler-solutions.core
  (:require [clojure.math.numeric-tower :as math]))

(defmacro bench
  "Times the execution of forms, discarding their output and returning
   a long in nanoseconds."
  ([& forms]
     `(let [start# (System/nanoTime)]
        ~@forms
        (- (System/nanoTime) start#))))

(defn partial-sum
  "Returns the partial sum of a sequence.  If start is not provided, 1 is used."
  ([start num-terms end]
     (/ (* num-terms (+ start end)) 2))
  ([num-terms end]
     (partial-sum 1 num-terms end)))

(defn nth-partial-sum
  "Returns the nth partial sum of a sequence.  If start is not provided, 1 is
   used.  If multiple is not provided, 1 is used."
  ([start multiple nth]
     (let [end (+ (* multiple nth) start)
           num-terms (inc nth)]
       (partial-sum start num-terms end)))
  ([start nth]
     (nth-partial-sum start 1 nth))
  ([nth]
     (nth-partial-sum 1 nth)))

(defn sum-multiples
  "Returns the sum of the k multiples up-to and including n."
  [k n]
  (let [n (math/floor (/ n k))]
    (* k (partial-sum 1 n n))))

(def fibonacci-numbers
  "The Fibonacci Numbers as a lazy sequence.  Credit: Christophe Grand as
  mention in 'Programming Clojure', pg. 137."
  (map first (iterate (fn [[a b]] [b (+' a b)]) [0 1])))
