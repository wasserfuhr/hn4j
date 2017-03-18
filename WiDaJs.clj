(print(apply str(map(fn[l](let[i(.indexOf l" ")](str"'"(subs l 0 i)"':'"(.trim(subs l(+ i 1)))"',\n")))
 (.split(slurp"https://floatingboat2013.appspot.com/rawHead/WiDaMan")"\n"))))