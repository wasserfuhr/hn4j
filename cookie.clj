(fn[rq rs](let[
 r(.getParameter rq"c")
 c(javax.servlet.http.Cookie."1"r)]
 (.setMaxAge c(* 60 60 24 30))
 (.addCookie rs c)
 (apply str(map(fn[c](str"\n"(.getName c)"="(subs(str(.getValue c)"       ")0 8)" "))
  (.getCookies rq)))))