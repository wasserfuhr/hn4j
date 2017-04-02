;=/turl
(fn[rq rs](let[v(.getAttribute rq"vars")d(:datastoreService v)
 f(slurp(str"https://"(.getServerName rq)"/head/IdLink")
 p(slurp(str"https://"(.getServerName rq)"/raw/"f))
 s(filter #(=(subs(.getRequestURI rq)6)(first(.split %" ")))(.split p"\n"))
 l(.split(first s)" ")
 u(slurp(second l))
 bb(.getBytes u"UTF-8")
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 hh(fn[m](apply str(map #(format"%02x" %)m)))
 h(hh(hf bb))
 n(java.util.Date.)
 t(com.google.appengine.api.datastore.Entity."turl")
 e(com.google.appengine.api.datastore.Entity."a"h)
 b(com.google.appengine.api.datastore.Blob. bb)]
(do
 (.setProperty t"t"n)
 (.setProperty t"l"(first l))
 (.setProperty t"h"h)
 (.put d t)
 (.setProperty e"c"b)
 (.setProperty e"t"n)
 (.put d e)
 h)))