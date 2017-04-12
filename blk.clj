(fn[rq rs](let[
 c"";(subs(.getRequestURI rq)5)
 h"";(subs(slurp(str"https://blockchain.info/rawblock/"c"?format=hex"))0 160)
]
(:a (clojure.data.json/read-str "{\"a\":16}" :key-fn keyword))))