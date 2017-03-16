(println(map(fn[l](let[
s(.indexOf l" ")
s0(subs l 0 (+ s 1))
s1(subs l s)
e(java.net.URLEncoder/encode (.replaceAll s1" ""_"))]
(try(let[
s(slurp(str"https://en.wikipedia.org/wiki/File:"e))
i0(.indexOf s "mw-filepage-other-resolutions")
i1(.indexOf(subs s i0)"</span>")
t(subs s i0(+ i0 i1))
r(.split t"class=\"mw-thumbnail-link\">")
u(.split(second r)" ")
l(.indexOf(second r)"/thumb/")
h(subs(second r)(+ l 9)(+ l 11))]
;https://floatingboat2013.appspot.com/WiDaPic?q=Q42 =
;https://upload.wikimedia.org/wikipedia/commons/c/c0/Douglas_adams_portrait_cropped.jpg
;
;https://floatingboat2013.appspot.com/WiDaPic?q=Q19837 =
;https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Steve_Jobs_Headshot_2010-CROP.jpg/245px-Steve_Jobs_Headshot_2010-CROP.jpg
(str s0" "h" "(first u)" "(get u 2)"\n"))
(catch Exception ex (str "*E*"s0" "e"\n")))))
(.split"Q23 Gilbert Stuart Williamstown Portrait of George Washington.jpg
Q76 President Barack Obama.jpg
Q19838 Steve Jobs Headshot 2010-CROP.jpg
Q937 Albert Einstein Head.jpg
Q7200 Portrait of Alexander Pushkin (Orest Kiprensky, 1827).PNG
Q6294 HillaryPA.jpg
Q352 Bundesarchiv Bild 183-S33882, Adolf Hitler retouched.jpg
Q8016 Sir Winston S Churchill.jpg
Q12823 Susan Polgar 6.jpg
QX Henry Hubchen.jpg
QY Sergey Brin Ted 2010.jpg"
"\n")))