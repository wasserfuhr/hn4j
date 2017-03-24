(apply str(map(fn[l](let[m(.split(subs l 45)"/")](format"%s %s\n"
 (read-string(str"0x"(first m)))(second m))))(.split(slurp"hHiPo")"\n")))