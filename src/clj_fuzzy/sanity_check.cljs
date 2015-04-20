(ns clj-fuzzy.sanity-check
  (:require [clj-fuzzy.jaro-winkler :as jw]
            [clj-fuzzy.stemmers :refer [lovins]]))

(enable-console-print!)

(defn main []
  (println  "hey"
            (jw/jaro-winkler "please" "please")))
