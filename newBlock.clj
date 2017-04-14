(fn[rq rs](let[
 b(clojure.data.json/read-str(slurp(.getReader rq)):key-fn keyword)
 h(:hash b)
 hb(format"%x"(:height b))
 lh(slurp"bcHead")
 bh(subs(slurp(str"https://blockchain.info/rawblock/"h"?format=hex"))0 160)]
(spit(str"bh/"hb)bh)
(spit"bcHead"hb)
;(if(<(.compareToLong/parseLong(:height b)16)
))