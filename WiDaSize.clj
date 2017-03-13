(doall(map(fn[l](println(str
(get(.split l" ")5)
(get(.split (.trim l)" ")8))))
 (.split(slurp"qls")"\n")))