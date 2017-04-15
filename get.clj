(fn[rq rs](let[
 c(subs(.getRequestURI rq)5)
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 hh(fn[m](apply str(map #(format"%02x" %)m)))
 f(java.io.File.(str"a/"c))]
 ;http://stackoverflow.com/questions/23018870/how-to-read-a-whole-binary-file-nippy-into-byte-array-in-clojure
 (hh(let[r(byte-array(.length f))]
  (with-open[in(java.io.DataInputStream.(clojure.java.io/input-stream f))]
   (.readFully in r))r))))