(ns x(:require[clojure.data.json :as json]))
(let[m"04"d"01"
l(count"http://www.wikidata.org/entity/Q")
e(java.net.URLEncoder/encode
 "select?e where{?e wdt:P31 wd:Q5.?e wdt:P569 ?d.filter(MONTH(?d)="m"&&DAY(?d)="d")}limit 20000")
q(str"https://query.wikidata.org/sparql?query="e"&format=json")]
(spit(str"wd/"m d)(.trim(apply str
 (map(fn[i](format"%x "(Long.(subs(:value(:e i))l))))
  (:bindings(:results(json/read-str (slurp q) :key-fn keyword))))))))