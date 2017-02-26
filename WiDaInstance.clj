(ns example
 (:require [clojure.data.json :as json]))

(map(fn[r](let[
 s(try(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/Q"r".json"))
 (catch Exception e nil))]
(if s(str(:id
(:value(:datavalue
(:mainsnak
(first
(:P31
(:claims
 ((keyword(str "Q"r))
   (:entities
    (json/read-str s :key-fn keyword)))))))))))))
         ; (clojure.data.json/read-str s))))))))))))
	 (range 1 0xa)))