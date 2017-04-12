(fn[rq rs](let[
 c"";(subs(.getRequestURI rq)5)
 h"";(subs(slurp(str"https://blockchain.info/rawblock/"c"?format=hex"))0 160)
 b(clojure.data.json/read-str(slurp(.getReader rq)):key-fn keyword)
 h(:hash b);(subs(slurp(str"https://blockchain.info/rawblock/"c"?format=hex"))0 160)
 ]
(spit(str"blk/"(:height b))h)))