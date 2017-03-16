(ns x(:require[clojure.data.json :as json]))
(let[Q"Q42"
s(slurp(str"q/"Q".json"))]
(:value(:datavalue(:mainsnak(first(:P18 (:claims
 ((keyword Q)(:entities(json/read-str s :key-fn keyword))))))))))