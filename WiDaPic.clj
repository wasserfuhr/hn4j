(ns x(:require[clojure.data.json :as json]))
(println(apply str(map(fn[r](let[
q(read-string(str"0x"r))
s(slurp(str"q/"r))]
 (str r" "(:value(:datavalue(:mainsnak(first(:P18 (:claims
  ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))"\n")))
 (.split(slurp"https://floatingboat2013.appspot.com/eval/55905038")"" "))))