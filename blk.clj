(fn[rq rs](let[
 c"";(subs(.getRequestURI rq)5)
 h"";(subs(slurp(str"https://blockchain.info/rawblock/"c"?format=hex"))0 160)
 lh(slurp"bcHead")
;  (spit(str"blk/"hb)bh)
  ;(if(<
]
(.compareTo lh"70b4e")))
;(format"%x"(:a (clojure.data.json/read-str "{\"a\":16}" :key-fn keyword)))))