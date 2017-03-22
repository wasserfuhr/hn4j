(ns x(:require[clojure.data.json :as json]))
(apply str(filter #(.endsWith %"Q5")
(map(fn[r](let[
 s(try(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/Q"r".json"))
 (catch Exception e nil))]
(if s(str" "r" "(:id
(:value(:datavalue(:mainsnak(first(:P31(:claims
 ((keyword(str "Q"r))(:entities
    (json/read-str s :key-fn keyword)))))))))))"")))
; (range 1 0x100))))
 (range 0x3000 0x4000))))
 