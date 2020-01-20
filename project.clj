(defproject cljc.java-time "0.18.0"
  :dependencies [[cljs.java-time "0.1.13"]
                 [org.clojure/clojure "1.10.1"]]
  :source-paths ["src" "dev"]
  :profiles {:dev {:dependencies [[medley "0.8.4"]
                                  [camel-snake-kebab "0.4.0"]
                                  [org.clojure/tools.namespace "0.2.11"]
                                  [org.clojure/clojurescript "1.10.516"]
                                  [org.clojure/clojure "1.10.1"]
                                  [thheller/shadow-cljs "2.8.41"]
                                  [vvvvalvalval/scope-capture "0.2.1"]
                                  [com.bhauman/figwheel-main "0.2.0"]
                                  [nrepl/nrepl "0.6.0"]
                                  [cider/piggieback "0.4.0"]]}})
