(ns x(:require[clojure.data.json :as json]))
(let[m"03"d"22](first(:bindings(:results
 (json/read-str (slurp(str"wd/"m d)) :key-fn keyword))))