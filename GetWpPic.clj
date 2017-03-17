(println(map(fn[l](let[
s(.indexOf l" ")
s0(subs l 0 s)
s1(subs l (+ s 1))
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
(str s0" "k" "h" "w"\n"))
;(str"<img id='"s0"'
;width="(Math/round(Math/min(*(/ h w)128)128.0))"
;height="(Math/round(Math/min(*(/ w h)128)128.0))"
;src='https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs k 0 1)"/"k"/"e"/"(first u)"px-"e"'/>\n"))
(catch Exception ex (str "*E*"s0"e\n")))))
(.split
"Q23 Gilbert Stuart Williamstown Portrait of George Washington.jpg
Q42 douglas adams portrait cropped.jpg
Q76 President Barack Obama.jpg
Q352 Bundesarchiv Bild 183-S33882, Adolf Hitler retouched.jpg
Q937 Albert Einstein Head.jpg
Q991 Vasily Perov - Портрет Ф.М.Достоевского - Google Art Project.jpg
Q12823 Susan Polgar 6.jpg
Q5879 Goethe (Stieler 1828).jpg
Q8016 Sir Winston S Churchill.jpg
Q8023 Nelson Mandela-2008 (edit).jpg
Q8704 Walt Disney 1946.JPG
Q7243 L.N.Tolstoy Prokudin-Gorsky.jpg
Q5152 Atatürk.jpg
Q255 Beethovensmall.jpg
Q692 Hw-shakespeare.png
Q254 Barbara Krafft - Porträt Wolfgang Amadeus Mozart (1819).jpg
Q1339 Johann Sebastian Bach.jpg
Q9682 Elizabeth II greets NASA GSFC employees, May 8, 2007 edit.jpg
Q855 CroppedStalin1943.jpg
Q5383 David-Bowie Chicago 2002-08-08 photoby Adam-Bielawski-cropped.jpg
Q762 Leonardo self.jpg
Q11571 Shahter-Reak M 2015 (18).jpg
Q5592 Miguel Ángel, por Daniele da Volterra (detalle).jpg
Q567 Angela Merkel Juli 2010 - 3zu4.jpg
Q23 Gilbert Stuart Williamstown Portrait of George Washington.jpg
Q882 Charlie Chaplin portrait.jpg
Q6294 HillaryPA.jpg
Q7200 Portrait of Alexander Pushkin (Orest Kiprensky, 1827).PNG
Q8016 Sir Winston S Churchill.jpg
Q12823 Susan Polgar 6.jpg
Q19838 Steve Jobs Headshot 2010-CROP.jpg
Q92764 Sergey Brin Ted 2010.jpg
Q160305 Henry Hubchen.jpg"
"\n")))