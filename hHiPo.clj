(print(apply str(map(fn[l](let[m(.split(subs l 45)"/")](format"%s %s\n"
 (second m)(read-string(str"0x"(first m))))))(.split(slurp"hHiPo")"\n"))))