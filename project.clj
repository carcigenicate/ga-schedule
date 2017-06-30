(defproject ga-schedule "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [helpers "1"]
                 [ai-retry "1"]]

  :main ga-schedule.main

  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
