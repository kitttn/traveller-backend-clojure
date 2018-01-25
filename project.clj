(defproject traveller-backend "0.1.0-SNAPSHOT"
  :description "This jar works as a prototype for the Traveller backend"
  :url "TODO: write url"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot traveller-backend.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
