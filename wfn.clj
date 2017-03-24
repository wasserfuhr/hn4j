(ns x(:require[clojure.data.json :as json]))
(let[q"https://query.wikidata.org/sparql?query=select%3Fp%3Fi%20where%7B%3Fp%20wdt%3AP2020%3Fi%7Dlimit30000&format=json"]
(spit"wf"(.trim(apply str
 (map(fn[i](format"%x %s"(Long.(subs(:value(:p i))32))(:value(:i i))))
 ;"http://www.wikidata.org/entity/Q..."
  (:bindings(:results(json/read-str (slurp "wfn") :key-fn keyword))))))))