;; -------------------------------------------------------------------
;; clj-fuzzy Metrics API
;; -------------------------------------------------------------------
;;
;;
;;   Author: PLIQUE Guillaume (Yomguithereal)
;;   Version: 0.1
;;
(ns clj-fuzzy.metrics
  (:require clj-fuzzy.levensthein
            clj-fuzzy.dice
            clj-fuzzy.match-rating
            clj-fuzzy.jaccard
            clj-fuzzy.hamming
            clj-fuzzy.jaro-winkler
            clj-fuzzy.tversky))

(def ^:export levensthein clj-fuzzy.levensthein/distance)
(def ^:export dice clj-fuzzy.dice/coefficient)
(def ^:export sorensen clj-fuzzy.dice/coefficient)
(def ^:export jaccard clj-fuzzy.jaccard/distance)
(def ^:export tanimoto clj-fuzzy.jaccard/distance)
(def ^:export hamming clj-fuzzy.hamming/distance)
(def ^:export jaro clj-fuzzy.jaro-winkler/jaro)
(def ^:export jaro-winkler clj-fuzzy.jaro-winkler/jaro-winkler)
(def ^:export tversky clj-fuzzy.tversky/index)

;; JavaScript Optimizations
(defn ^:export mra-comparison [string1 string2]
  (clj->js (clj-fuzzy.match-rating/mra-comparison string1 string2)))
