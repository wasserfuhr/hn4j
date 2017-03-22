(ns x(:require[clojure.data.json :as json]))
(let[m"03"d"22"](map(fn[i](subs(:value(:e i))28))
;"http://www.wikidata.org/entity/Q..."
(:bindings(:results
 (json/read-str (slurp(str"wd/"m d)) :key-fn keyword)))))