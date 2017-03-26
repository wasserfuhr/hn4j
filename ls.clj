(print(apply str(map(fn[l](let[f(java.io.File l)](format"%x %x %s\n"
(.lastModied f)(.length f)(subs f 2))))(.listFiles(java.io.File."q")))))