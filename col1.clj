(apply str(map(fn[l](str(first(.split l" "))" "))(.split(slurp"wfn.txt")"\n")))