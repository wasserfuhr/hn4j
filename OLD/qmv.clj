(print(apply str(map(fn[i](let[
j(first(.split(subs i 44)"\\."))]
(str"mv Q"j".json "(format"%x"(Long. j))"\n")))
 (.split(slurp"qls")"\n"))))