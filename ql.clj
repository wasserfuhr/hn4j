(ns x(:require[clojure.data.json :as json]))
(let[
e(java.net.URLEncoder/encode"select?h?i where{?h wdt:P31 wd:Q5;wdt:P166 wd:Q163700;wdt:P18?i}limit 2000")
q(str"https://query.wikidata.org/sparql?query="e"&format=json")]
q);(print(apply str
; (map(fn[i](format"%x %s\n"(Long.(subs(:value(:p i))32))(:value(:i i))))
 ;"http://www.wikidata.org/entity/Q..."
 ; (:bindings(:results(json/read-str (slurp q) :key-fn keyword)))))))