(fn[rq rs](let[r(.getRequestURI rq)
i(.indexOf r"/wiki/")]
(.sendRedirect rq(str"https://dresdenlabs.appspot.com/"(subs r i))))