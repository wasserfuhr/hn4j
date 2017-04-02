(fn[rq rs](let[
 c(.getParameter rq"c")
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 hh(fn[m](apply str(map #(format"%02x" %)m)))
 n(java.util.Date.)
 bb(into-array Byte/TYPE
  (map(fn[i](read-string(str"0x"(subs c(* i 2)(*(+ i 1)2)))))
   (range(/(count c)2))))
 h(hh(hf bb))]
 h)))