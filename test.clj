(fn[rq rs]
;(spit "event.log" "test 1\n" :append true)
(let[
 r(str(rand))
  c(javax.servlet.http.Cookie."AlphaCookie"r)]
   (.setMaxAge c(* 60 60 24 30))
    (.addCookie rs c)
     r))