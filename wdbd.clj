(ns x(:require[clojure.data.json :as json]))
(let[m"04"d"16"
l(count"http://www.wikidata.org/entity/Q")
e(java.net.URLEncoder/encode
 (str"select?e where{?e wdt:P31 wd:Q5;wdt:P569 ?d.filter(month(?d)="m"&&day(?d)="d")}limit 50000"))
q(str"https://query.wikidata.org/sparql?query="e"&format=json")]
(spit(str"wd/"m d)(.trim(apply str
 (map(fn[i](format"%x "(Long.(subs(:value(:e i))l))))
  (:bindings(:results(json/read-str (slurp q) :key-fn keyword))))))))