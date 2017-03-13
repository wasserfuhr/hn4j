(doall(map(fn[l](println(str
;(get(.split l" ")4)
(get(.split (.trim l)" ")6))))
 (.split(slurp"qls")"\n")))