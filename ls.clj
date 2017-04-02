(fn[rq rs]
(str"[\n"(apply str(map(fn[f](let[l(.getName f)](format"\"%x %05x %s\",\n"
(-(/(.lastModified f)1000)0x5608aa2b)
(.length f)l)))(.listFiles(java.io.File."a"))))"]")