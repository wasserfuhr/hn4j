(ns x(:require[clojure.data.json :as json]))

(print(apply str(map(fn[f](let[
l(.getName f)
q(read-string(str"0x"l))
s(slurp(str"q/"l))]
 (format"%s %s\n"
  (:id(:value(:datavalue(:mainsnak(first(:P31(:claims
   ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword))))))))))
  l)))
 (.listFiles(java.io.File."q")))))