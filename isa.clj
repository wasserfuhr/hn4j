(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[r](let[
q(read-string(str"0x"r))
s(slurp(str"q/"r))]
 (str r" "(:value(:datavalue(:mainsnak(first(:P18 (:claims
   ((keyword (str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))"\n")))
    (.split(slurp"q163700.txt")" "))))

(print(apply str(map(fn[f](let[l(.getName f)](format"%x %x %s\n"
(.lastModified f)(.length f)(subs l 2))))(.listFiles(java.io.File."q")))))