(fn[rq rs](let[
 t(-(.getTime(java.util.Date.))1443408427000)
 d(long(/ t 1000.0))
 r(- t(* d 1000));mod?
 a(format"%02x.%02x"d(quot(* 256 r)1000))]
(println *err*"\007")
(println a(.getRemoteHost rq)(.getRequestURI rq))
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]]
[:body"αt"a": we are "[:a{:href"https://dresdenlabs.appspot.com/"}"α"]" approaching β."]])))