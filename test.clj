(fn[rq rs](let[
 t(-(.getTime(java.util.Date.))1443408427000)
  d(long(/ t 1000.0))
   r(- t(* d 1000))]
    (spit "event.log" "test 1\n" :append true))
    (format"%02x.%02x"d(quot(* 256 r)1000))))