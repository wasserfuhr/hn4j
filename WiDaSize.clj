(apply str(map(fn[l](str
(first(.split(subs l 42)"\\."))
))
;(line-seq (java.io.BufferedReader. *in*)))))
 (.split *in* "\n")))