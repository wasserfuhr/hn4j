(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[r](let[
q(read-string(str"0x"r))
s(slurp(str"q/"r))]
 (str r" "(count(keys(:labels
  ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword))))))"\n")))
 (.split(slurp"qidT")" "))))