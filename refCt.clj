(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[f](let[
l(.getName f)
q(read-string(str"0x"l))
s(slurp(str"q/"l))]
 (str l" "(count(keys(:labels
  ((keyword(str"Q"q))(:entities(json/read-str s :key-fn keyword))))))"\n")))
 (.listFiles(java.io.File."q")))))