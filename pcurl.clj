(print(apply str(map(fn[l](let[
 n(first(.split(subs l 6)"/"))]
 (str"curl https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs l 1 5)"/"n"/64px-"n"|$c\n")))
 (.split(slurp"urPic.txt")"\n"))))