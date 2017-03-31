(apply str(map(fn[l](.split l"/"))
 (.split(slurp"urPic.txt")"\n")))