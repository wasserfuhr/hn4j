(map(fn[l](try(let[
s(.indexOf l" ")
s0(subs l 0 s)
s1(subs l s)
e(java.net.URLEncoder/encode (.replaceAll s1" ""_"))
s(slurp(str"https://en.wikipedia.org/wiki/File:"e))
i0(.indexOf s "mw-filepage-other-resolutions")
i1(.indexOf(subs s i0)"</span>")
t(subs s i0(+ i0 i1))
r(.split t"class=\"mw-thumbnail-link\">")
u(.split(second r)" ")
l(.indexOf(second r)"/thumb/")
](str s0" "(subs(second r)(+ l 9)(+ l 11))" "(first u)" "(get u 2)))
(catch Exception e nil)))
(.split"Q23 Gilbert Stuart Williamstown Portrait of George Washington.jpg
QQ76 President Barack Obama.jpg
Q937 Albert Einstein Head.jpg
Q7200 Portrait of Alexander Pushkin (Orest Kiprensky, 1827).PNG
Q6294 HillaryPA.jpg
Q352 Bundesarchiv Bild 183-S33882, Adolf Hitler retouched.jpg
Q8016 Sir Winston S Churchill.jpg
Q12823 Susan Polgar 6.jpg
QX Henry Hubchen.jpg
QY Sergey Brin Ted 2010.jpg"
"\n"))