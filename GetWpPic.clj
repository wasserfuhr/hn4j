(map(fn[l](let[
s(.indexOf l" ")
s0(subs l 0 s)
s1(subs l s)
e(java.net.URLEncoder/encode (.replaceAll f" ""_"))
s(slurp(str"https://en.wikipedia.org/wiki/File:"e))
i0(.indexOf s "mw-filepage-other-resolutions")
i1(.indexOf(subs s i0)"</span>")
t(subs s i0(+ i0 i1))
r(.split t"class=\"mw-thumbnail-link\">")
u(.split(second r)" ")
l(.indexOf(second r)"/thumb/")
](str(subs(second r)(+ l 9)(+ l 11))" "(first u)" "(get u 2))))
(.split"Q23 Gilbert Stuart Williamstown Portrait of George Washington.jpg
QX Henry Hubchen.jpg"
;Sergey Brin Ted 2010.jpg
"\n"))