(defproject project-euler-solutions "0.1.0-SNAPSHOT"
  :description "My solutions to Project Euler problems."
  :url "https://github.com/evanspa/project-euler-solutions"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.0.13"]
                 [org.slf4j/slf4j-api "1.7.5"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :profiles {:dev
             {:source-paths ["dev"] ;ensures 'user.clj' gets auto-loaded
              :plugins [[cider/cider-nrepl "0.8.0-SNAPSHOT"]]
              :dependencies [[org.clojure/tools.namespace "0.2.7"]
                             [org.clojure/java.classpath "0.2.2"]]}})
