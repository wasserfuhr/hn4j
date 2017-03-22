(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[r](let[
q(read-string(str"0x"r))
s(slurp(str"wd/""0322"))]
 (str r" "(:value(:datavalue(:mainsnak(first(:P18 (:claims
  ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))"\n")))
 (.split(slurp"qid")" "))))