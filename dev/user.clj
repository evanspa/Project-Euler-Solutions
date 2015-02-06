(ns user
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [clojure.pprint :refer (pprint)]
            [clojure.repl :refer :all]
            [clojure.test :as test]
            [clojure.stacktrace :refer (e)]
            [clojure.tools.namespace.repl :refer (refresh refresh-all)]
            [project-euler-solutions.core :refer :all]
            [project-euler-solutions.problem-1 :as p1]
            [project-euler-solutions.problem-2 :as p2]))
