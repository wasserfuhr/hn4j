(spit"pcurl.sh"(apply str(map(fn[l](let[
 m(reverse(first(.split(reverse l)"\\.")))
 n(first(.split(subs l 6)"/"))]
 (str"curl https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs l 1 5)"/"n"/64px-"n" > tpic;a=`sha256sum tpic`;b=${a:0:64};mv tpic p/$b."m"\n")))
 (.split(slurp"urPic.txt")"\n"))))