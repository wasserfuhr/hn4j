(doall(map(fn[l](println(str
;(get(.split l" ")4)
(get(.split l" ")6))))
 (.split(slurp *in*)"\n")))