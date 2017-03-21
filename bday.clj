(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[r](try(let[
q(read-string(str"0x"r))
s(slurp
 ;(str"https://www.wikidata.org/wiki/Special:EntityData/"q".json")
 (str"q/"r))
v(try(:value(:datavalue(:mainsnak(first(:P569(:claims
  ((keyword(str"Q"q))(:entities(json/read-str s :key-fn keyword)))))))))
  (catch Exception e {:time "+????-??-??___":precision "0"}))]
 (str r" "(format"%x"(Long.(:precision v)))" "(subs(:time v)0 11)"\n"))
 (catch Exception e (str"NoBday "r"\n"))))
  (.split(slurp"https://floatingboat2013.appspot.com/eval/58295043")" "))))