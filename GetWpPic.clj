(print(apply str(map(fn[l](let[
s(.indexOf l" ")
s0(subs l 0 s)
s1(.trim(subs l (+ s 1)))
e(java.net.URLEncoder/encode (.replaceAll s1" ""_"))]
(try(let[
s(slurp(str"https://en.wikipedia.org/wiki/File:"e))
i0(.indexOf s "mw-filepage-other-resolutions")
i1(.indexOf(subs s i0)"</span>")
t(subs s i0(+ i0 i1))
r(.split t"class=\"mw-thumbnail-link\">")
u(.split(second r)" ")
l(.indexOf(second r)"/thumb/")
k(subs(second r)(+ l 9)(+ l 11))
h(Double.(first u))
w(Double.(get u 2))]
;https://floatingboat2013.appspot.com/WiDaPic?q=Q42 =
;https://upload.wikimedia.org/wikipedia/commons/c/c0/Douglas_adams_portrait_cropped.jpg
;
;https://floatingboat2013.appspot.com/WiDaPic?q=Q19837 =
;https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Steve_Jobs_Headshot_2010-CROP.jpg/245px-Steve_Jobs_Headshot_2010-CROP.jpg
(str(format"%x %s %x %x"(Long.(subs s0 1)) k (Math/round w) (Math/round h))"\n"))
;(str s0" "k" "(Math/round h)"\n"))
;(str"<img id='"s0"'
;width="(Math/round(Math/min(*(/ h w)128)128.0))"
;height="(Math/round(Math/min(*(/ w h)128)128.0))"
;src='https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs k 0 1)"/"k"/"e"/"(first u)"px-"e"'/>\n"))
;(str"[:img#r"s0"{:height 60 :width "(Math/round(*(/ h w)60))"
;:src\"https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs k 0 1)"/"k"/"e"/"(first u)"px-"e"\"}]\n"))
(catch Exception ex(str";"s0"e\n")))))
(.split
"Q23 Gilbert Stuart Williamstown Portrait of George Washington.jpg
Q42 douglas adams portrait cropped.jpg
Q1001 Portrait Gandhi.jpg
Q1031 France Prešeren - lithograph (1866, Preširnove poezije) 01.jpg
Q1035 Charles Darwin 1880.jpg
Q1043 Carl von Linné.jpg
Q1047 Bundesarchiv Bild 183-61849-0001, Indien, Otto Grotewohl bei Ministerpräsident Nehru cropped.jpg
Q1048 Gaius Julius Caesar (100-44 BC).JPG"
;(slurp"picName.txt")
"\n"))))