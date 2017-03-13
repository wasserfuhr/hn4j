(doall(map(fn[l](println(str
(get(.split l" ")4)" "
(first(.split(get(.split l" ")8)"\\.")))))
 (.split(slurp"qls")"\n")))