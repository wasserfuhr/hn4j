(ns x(:require[clojure.data.json :as json]))

(map(fn[f](let[
l(.getName f)
q(read-string(str"0x"l))
s(slurp(str"q/"l))]
 (print(format"%s %s\n"l(:value(:datavalue(:mainsnak(first(:P31(:claims
   ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))))))
   (.listFiles(java.io.File."q")))