(ns example
 (:require [clojure.data.json :as json]))

(apply str
(map(fn[r](let[
 s(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/"r".json"))]
(:value(:en(:labels
 ((keyword r)
   (:entities
    (json/read-str s :key-fn keyword)))))))
   (.split "Q76 Q80 Q91 Q157 Q181 Q185 Q186 Q192 Q206 Q207 Q254 Q255" " ")
 ))