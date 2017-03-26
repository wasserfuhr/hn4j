(print(apply str(map(fn[l](let[f(java.io.File l)](format"%x %x %s\n"
(.lastModified f)(.length f)(subs l 2))))(.listFiles(java.io.File."q")))))