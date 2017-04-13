(fn[rq rs](let[
 c"";(subs(.getRequestURI rq)5)
 h;"";(subs(slurp(str"https://blockchain.info/rawblock/"c"?format=hex"))0 160)
  (slurp"https://blockchain.info/block/00000000000000000068985802eae0a68a0f3739a94df93cf1496d67ac84ffd7?format=json")
 lh(slurp"bcHead")
;  (spit(str"blk/"hb)bh)
  ;(if(<
]
(> 0(.compareTo lh"70b4e"))
(apply str
(map(fn[t](:hash t))
 (:tx(clojure.data.json/read-str h :key-fn keyword)))))

))
;(format"%x"(:a (clojure.data.json/read-str "{\"a\":16}" :key-fn keyword)))))