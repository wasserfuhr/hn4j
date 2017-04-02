(fn[rq rs](let[
 c(.getParameter rq"h")
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 hh(fn[m](apply str(map #(format"%02x" %)m)))
 n(java.util.Date.)
 bb(into-array Byte/TYPE
  (map(fn[i](let[b(read-string(str"0x"(subs c(* i 2)(*(+ i 1)2))))]
  (if(< b 128)b(- b 256))))
   (range(/(count c)2))))
 h(hh(hf bb))
 f(java.io.File.(str"a/"h))]
 (if(not(.exists f))
  (clojure.java.io/copy bb f))
 (format"%x %05x %s\n"
  (-(/(.lastModified f)1000)0x5608aa2b)(.length f)h)))