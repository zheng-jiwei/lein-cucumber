(defproject com.siili/lein-cucumber "1.0.5"
  :description "Run cucumber-jvm specifications with leiningen"
  :url https://github.com/siilisolutions/lein-cucumber
  :dependencies [[info.cukes/cucumber-clojure "1.2.4"]
                 [leiningen-core "2.0.0"]
                 [org.clojure/clojure "1.6.0"]]
  :profiles {:cucumber {:dependencies [[commons-io "2.4"]]
                        :plugins [[com.siili/lein-cucumber "1.0.5"]]}}
  :eval-in :leiningen
  :license {:name "Unlicense"
            :url "http://unlicense.org/"
            :distribution :repo})
