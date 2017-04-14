(fn[rq rs](apply str(map(fn[f](let[l(.getName f)](format"%s %x\n"
 l(.length f))))
(reverse(sort-by #(.length %)(.listFiles(java.io.File."rq")))))))