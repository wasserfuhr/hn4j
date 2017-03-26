(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[f](let[
l(.getName f)
q(read-string(str"0x"l))
s(slurp(str"q/"l))]
q(read-string(str"0x"r))
s(slurp(str"q/"r))]
 (str r" "(count(keys(:labels
  ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword))))))"\n")))
 (.split(slurp"qidT")" ")
 (.listFiles(java.io.File."q"))
)))