(ns x(:require[clojure.data.json :as json]))
(let[
 ;"http://www.wikidata.org/entity/Q..."
e(java.net.URLEncoder/encode
 "select?h?i where{?h wdt:P166 wd:Q10905380;wdt:P31 wd:Q5;wdt:P18?i}limit2000")
;"select?h?i where{?h wdt:P166 wd:Q10905276;wdt:P31 wd:Q5;wdt:P18?i}limit2000")
;"select?h?i where{?h wdt:P31 wd:Q5;wdt:P166 wd:Q163700;wdt:P18?i}limit 2000")
q(str"https://query.wikidata.org/sparql?query="e"&format=json")]
(print(apply str
 (map(fn[i](format"%x "(Long.(subs(:value(:h i))32))))
 (:bindings(:results(json/read-str (slurp q) :key-fn keyword)))))))