(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[f](let[
r(.split f" ");(.getName f)
t(first r)
q(read-string(str"0x"t))
s(slurp(str"q/"t))]
 (str t" "
 ;(:value(:datavalue(:mainsnak(first(:P18(:claims
  (:en(:labels
  ((keyword(str"Q"q))(:entities(json/read-str s :key-fn keyword))
  ;))))))
  )))"\n")))
; (.listFiles(java.io.File."q"))
 (.split(slurp"m33")"\n")
)))