(ns example
  (:require [clojure.data.json :as json]))

;(apply str

(map(fn[r]
(let[
q r;(.getParameter rq"q")
Q(if q q"Q107006")
s(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/Q"Q".json"))]
(if(.startsWith s"<!DOCTYPE")""
(:id
(:value(:datavalue
(:mainsnak
(first
(:P31
(:claims
 ((keyword Q)
   (:entities
     (json/read-str s)))))))))))))
         ; (clojure.data.json/read-str s))))))))))))
	 (range 1 5))