(fn[rq rs](let[
 ip(.split(.getRemoteHost rq)"\\.")
 i(apply str(map(fn[i](format"%02x"(Long. i)))ip))
 t(-(.getTime(java.util.Date.))1443408427000)
 d(long(/ t 1000.0))
 r(- t(* d 1000));mod?
 a(format"%02x.%02x"d(quot(* 256 r)1000))]
;(.println *err*"\007")
(println a i(.getRequestURI rq))
(if(.startsWith(.getRequestURI rq)"/a9e")
 (.sendRedirect rs
  "https://upload.wikimedia.org/wikipedia/commons/6/6b/Gordon_Moore.jpg")
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]]
[:body"αt"a": we are "[:a{:href"https://dresdenlabs.appspot.com/"}"α"]" approaching β."
[:br]"try "[:a{:href"/memo"}"AlphaMemory"]]]))))