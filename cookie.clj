(fn[rq rs](let[
 r(.getParameter rq"c")
 c(javax.servlet.http.Cookie."0"r)]
 (.setMaxAge c(* 60 60 24 30))
 (.addCookie rs c)r))