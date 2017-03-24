(ns x(:require[clojure.data.json :as json]))
(let[
q"https://query.wikidata.org/sparql?query=select%3Fe%20where%7B%3Fe%20wdt%3AP31%20wd%3AQ5.%3Fe%20wdt%3AP569%20%3Fd.filter%28MONTH%28%3Fd%29%3D"m"%26%26DAY%28%3Fd%29%3D"d"%29%7Dlimit%2020000&format=json"
]
(spit"wf"(.trim(apply str
 (map(fn[i](format"%x %s"(Long.(subs(:value(:e i))32))))
 ;"http://www.wikidata.org/entity/Q..."
  (:bindings(:results(json/read-str (slurp "wfn") :key-fn keyword))))))))