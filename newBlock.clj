(fn[rq rs](let[
 b(clojure.data.json/read-str(slurp(.getReader rq)):key-fn keyword)
 h(:hash b)
 bh(subs(slurp(str"https://blockchain.info/rawblock/"h"?format=hex"))0 160)]
(spit(str"blk/"(format"%x"(:height b)))bh)))