(fn[rq rs](let[
 ip(.split(.getRemoteHost rq)"\\.")
 i(apply str(map(fn[i](format"%02x"(Long. i)))ip))
 t(-(.getTime(java.util.Date.))1443408427000)
 h(fn[m] ; https://gist.github.com/kisom/1698245
   (let[h(java.security.MessageDigest/getInstance"SHA-256")]
      (. h update m)(.digest h)))
 f(fn[h]
   (apply str
       (map #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))
 uf(File.(str"ua/"uh))
 d(long(/ t 1000.0))
 r(- t(* d 1000));mod?
 a(format"%02x.%02x"d(quot(* 256 r)1000))]
;(.println *err*"\007")
(println a i(.getRequestURI rq))
;(if(not(.exists uf))(spit uf ua))
(if(.startsWith(.getRequestURI rq)"/cookie")
 ((eval(read-string(slurp"cookie.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/memoDev")
 ((eval(read-string(slurp"memoDev.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/memo")
 ((eval(read-string(slurp"memo.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/rq")
  (slurp"/root/rq.zip")
  (if(.startsWith(.getRequestURI rq)"/tap")
 ((eval(read-string(slurp"tapestry.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/char")
 ((eval(read-string(slurp"char.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/a9e")
  (.sendRedirect rs
   "https://upload.wikimedia.org/wikipedia/commons/6/6b/Gordon_Moore.jpg")
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]]
[:body"&alpha;t"a": we are "[:a{:href"https://dresdenlabs.appspot.com/"}"&alpha;"]" approaching &beta;."
[:br]"try "[:a{:href"https://i.sl4.eu/memo"}"AlphaMemory"]
[:p(subs uh 6)]]]))))))))))