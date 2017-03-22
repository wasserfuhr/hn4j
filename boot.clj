(fn[rq rs](let[
 ip(.split(.getRemoteHost rq)"\\.")
 i(apply str(map(fn[i](format"%02x"(Long. i)))ip))
 t(-(.getTime(java.util.Date.))1443408427000)
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 f(fn[h](apply str(map
  #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))
 uf(java.io.File.(str"ua/"uh))
 d(long(/ t 1000.0))
 r(- t(* d 1000));mod?
 a(format"%02x.%02x"d(quot(* 256 r)1000))]
;(.println *err*"\007")
(println a i(subs uh 0 6)(if(=(.getScheme rq)"http")"h""s")(.getRequestURI rq))
(if(not(.exists uf))(spit uf ua))
 (if(.startsWith(.getRequestURI rq)"/favicon.ico")
  (.sendRedirect rs
   "https://upload.wikimedia.org/wikipedia/commons/a/a5/Greek_lc_alpha.png")
 (if(.startsWith(.getRequestURI rq)"/age")
 ((eval(read-string(slurp"age.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/area")
 ((eval(read-string(slurp"area.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/char")
 ((eval(read-string(slurp"char.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/cookie")
 ((eval(read-string(slurp"cookie.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/math")
 ((eval(read-string(slurp"math.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/memoDev")
 ((eval(read-string(slurp"memoDev.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/memo")
 ((eval(read-string(slurp"memo.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/nobel")
 ((eval(read-string(slurp"nobel.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/nob")
 ((eval(read-string(slurp"nob.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/phim")
 ((eval(read-string(slurp"phim.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/tap")
 ((eval(read-string(slurp"tap.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/test")
 ((eval(read-string(slurp"test.clj")))rq rs)
 (if(.startsWith(.getRequestURI rq)"/a9e")
  (.sendRedirect rs
   "https://upload.wikimedia.org/wikipedia/commons/6/6b/Gordon_Moore.jpg")
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]]
[:body
[:p"Hi "(subs uh 0 6)"@"i]
"&alpha;t"a": we are "[:a{:href"https://dresdenlabs.appspot.com/"}"&alpha;"]" approaching &beta;."
[:br][:br]"Try "
[:a{:href"https://i.sl4.eu/age"}"History"]" "
[:a{:href"https://i.sl4.eu/math"}"Math"]" "
[:a{:href"https://i.sl4.eu/memo"}"Memory"]" "
[:a{:href"https://i.sl4.eu/phim"}"Physics"]" "
[:a{:href"https://i.sl4.eu/tap"}"Tapestry"]
]])))))))))))))))))