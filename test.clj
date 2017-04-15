(fn[rq rs](let[
 t(-(.getTime(java.util.Date.))(* 0x5608aa2b 1000))
 d(long(/ t 1000.0))
 r(- t(* d 1000))]
 ;(spit(str"ad"(subs(format"%x" d)0 3)".log")
;  (format"%x.%02x %s\n"d(quot(* 256 r)1000) "test")
  ;:append true)
  ;(> 0(.compareTo lh"70b4e"))
  ;c(subs(.getRequestURI rq)5)
 (apply str
  (map(fn[t](str(:hash t)"\n"))
   (:tx(clojure.data.json/read-str(slurp"bb/70c25"):key-fn keyword))))))