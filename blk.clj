(fn[rq rs](let[
 c(subs(.getRequestURI rq)5)
 h(subs(slurp(str"https://blockchain.info/rawblock/"c"?format=hex"))0 160)
]h

(clojure.data.json/read-str "{'a':2}" :key-fn keyword)
))