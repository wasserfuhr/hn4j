(fn[rq rs](let[r(.getRequestURI rs)
i(.indexOf"/wiki/"r)]
(.sendRedirect rq(str"https://dresdenlabs.appspot.com/"(subs r i))))