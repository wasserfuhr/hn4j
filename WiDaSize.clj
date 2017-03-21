(apply str(map(fn[l](str(first(.split(subs l 42)"\\."))))
 (.split(slurp"qls")"\n")))