(defproject kitten-wars "0.1.0-SNAPSHOT"
  :description "Kitten wars client"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot kitten-wars.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
