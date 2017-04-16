(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[f](let[
r(.split f" ")
t(first r)
q(read-string(str"0x"t))
s(slurp(str"q/"t))
es(:entities(json/read-str s :key-fn keyword))]
; (str t" "(:value(:en(:labels
; (str t" "(count(:sitelinks
; (str t" "(:value(:en(:descriptions
 (str t" "(:value(:en(:labels
  ((keyword(str"Q"q))es)
  )))"\n")))
 (.split(.trim(slurp"r0416"))"\n"))))