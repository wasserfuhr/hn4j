(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[f](let[
r(.split f" ");(.getName f)
q(read-string(str"0x"r))
s(slurp(str"q/"r))]
 (str r" "(:value(:datavalue(:mainsnak(first(:P18(:claims
  ((keyword(str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))"\n")))
; (.listFiles(java.io.File."q"))
 (.split(slurp"m330")"\n")
)))