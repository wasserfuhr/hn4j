(ns example
  (:require [clojure.data.json :as json]))

;(apply str

(map(fn[r]
(let[
s(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/Q"r".json"))]
(if(.startsWith s"<!DOCTYPE")""
(:id
(:value(:datavalue
(:mainsnak
(first
(:P31
(:claims
 ((keyword (str "Q"r))
   (:entities
     (json/read-str s)))))))))))))
         ; (clojure.data.json/read-str s))))))))))))
	 (range 1 5))