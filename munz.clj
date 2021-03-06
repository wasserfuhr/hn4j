(ns x(:require[clojure.data.json :as json]))
(let[
l(count"http://www.wikidata.org/entity/Q")
e(java.net.URLEncoder/encode
 "select?h?i where{?h wdt:P1284 ?i;wdt:P31 wd:Q5}limit20000")
q(str"https://query.wikidata.org/sparql?query="e"&format=json")]
(print(apply str
 (map(fn[i](format"%x %x\n"
  (Long.(subs(:value(:h i))l))
  (Long.(:value(:i i)))))
 (:bindings(:results(json/read-str(slurp q):key-fn keyword)))))))