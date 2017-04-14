(fn[rq rs](let[
 c(filter(fn[c](="0"(.getName c)))(.getCookies rq))
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 f(fn[h](apply str(map #(format"%02x"(bit-and % 0xff))h)))
 u(if(>(count c)0)
   (if(="693c599b0e27c7ad6dd3564ec14d5336b9b9c2b2183c0ec32ddb0d6565d55ca9"
    (f(h(.getBytes(.getValue(first c))))))"RaWa"))]
 (str"Hi "(if u u"Visitor"))))
; (.getName(first c))))
; lh(slurp"bcHead")
;(spit(str"blk/"hb)bh)]
;(> 0(.compareTo lh"70b4e"))
;c(subs(.getRequestURI rq)5)
; (slurp"https://blockchain.info/block/00000000000000000068985802eae0a68a0f3739a94df93cf1496d67ac84ffd7?format=json")
;map(fn[t](str(:hash t)"\n"))
;(:tx(clojure.data.json/read-str h :key-fn keyword)))))
;(format"%x"(:a (clojure.data.json/read-str "{\"a\":16}" :key-fn keyword)))))