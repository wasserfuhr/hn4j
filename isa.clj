(print(apply str(map(fn[f](let[l(.getName f)](format"%x %x %s\n"
(.lastModified f)(.length f)(subs l 2))))(.listFiles(java.io.File."q")))))