(ns x(:require[clojure.data.json :as json]))

(map(fn[f](let[
l(.getName f)
n(subs l 2)
q(read-string(str"0x"n))
s(slurp(str"q/"l))]
 (print(format"%s %s\n"n(:value(:datavalue(:mainsnak(first(:P18(:claims
   ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))))))
   (.listFiles(java.io.File."q")))