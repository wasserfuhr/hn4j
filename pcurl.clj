(spit"pcurl.sh"(apply str(map(fn[l](let[
 d(.lastIndexOf l".")
 m(subs l d)
 n(first(.split(subs l 5)"/"))]
 (str"curl https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs l 0 4)"/"n"/64px-"n" > tpic;a=`sha256sum tpic`;b=${a:0:64};mv tpic p/$b"m"\n")))
 (.split(slurp"urPic.txt")"\n"))))