(defproject clj-fuzzy "0.2.1"
  :description "A handy collection of algorithms dealing with fuzzy strings and phonetics."
  :url "http://yomguithereal.github.io/clj-fuzzy/"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0-beta1"]
                 [org.clojure/clojurescript "0.0-3196"]]
  :plugins [[lein-kibit "0.0.8"]
            [lein-cljsbuild "1.0.5"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src"],
     :compiler
     {:pretty-print false,
      :output-to "src-js/clj-fuzzy.temp.js",
      :optimizations :advanced}}]})
