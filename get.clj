(fn[rq rs](let[
 c(subs(.getRequestURI rq)5)
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 hh(fn[m](apply str(map #(format"%02x" %)m)))]
 (hh(.getBytes(slurp(str"a/"c))))))
 
