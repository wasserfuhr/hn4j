(fn[rq rs]
(str"[\n"(apply str(map(fn[f](let[l(.getName f)](format"\"%x %s %x\",\n"
 (-(/(.lastModified f)1000)0x5608aa2b)
 l(.length f))))
(reverse(sort-by #(.length %)(.listFiles(java.io.File."a"))))))"]"))