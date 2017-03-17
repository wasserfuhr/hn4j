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
;(str s0" "k" "h" "w"\n"))
;(str s0" "k" "(Math/round h)"\n"))
;(str"<img id='"s0"'
;width="(Math/round(Math/min(*(/ h w)128)128.0))"
;height="(Math/round(Math/min(*(/ w h)128)128.0))"
;src='https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs k 0 1)"/"k"/"e"/"(first u)"px-"e"'/>\n"))
(str"[:img#r"s0"{:height 60 :width "(Math/round(*(/ h w)60))"
:src\"https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs k 0 1)"/"k"/"e"/"(first u)"px-"e"\"}]\n"))
(catch Exception ex(str";"s0"e\n")))))
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
Q160305 Henry Hubchen.jpg
Q80 Sir Tim Berners-Lee.jpg
Q91 Abraham Lincoln November 1863.jpg
Q157 Francois Hollande 2015.jpeg
Q181 Jimmy Wales Fundraiser Appeal.JPG
Q185 L Sanger.jpg
Q186 KenJenningsByPhilKonstantin.jpg
Q192 David Cameron official.jpg
Q206 Stephen Harper by Remy Steinegger.jpg
Q207 George-W-Bush.jpeg
Q254 Barbara Krafft - Porträt Wolfgang Amadeus Mozart (1819).jpg
Q255 Beethovensmall.jpg
Q260 Jean-François Champollion, by Léon Cogniet.jpg
Q272 Paul Morand.jpg
Q296 Claude Monet 1899 Nadar.jpg
Q297 Diego Velázquez Autorretrato 45 x 38 cm - Colección Real Academia de Bellas Artes de San Carlos - Museo de Bellas Artes de Valencia.jpg
Q301 El Greco - Portrait of a Man - WGA10554.jpg
Q303 Elvis Presley 1970.jpg
Q306 Sebastian Pinera.JPG
Q307 Galileo.arp.300pix.jpg
Q326 Eduardo Frei Chiledebate.jpg
Q329 Nicolas Sarkozy (2015-10-29) 03 (cropped).jpg
Q331 Ricardo Lagos despedida (cropped).jpg
Q335 Patricio Aylwin (1990).jpg
Q346 Louis IX.jpg
Q352 Bundesarchiv Bild 183-S33882, Adolf Hitler retouched.jpg
Q353 Blancheofcastile.jpg
Q354 Anefo 911-0177 Piet Kraak.jpg
Q360 Julian Assange cropped (Norway, March 2010).jpg
Q368 Pinochet de Civil.jpg
Q377 Yanka Kupala.jpg
Q379 Frantisek planicka x gianpiero combi.jpg
Q392 Joan Baez Bob Dylan crop.jpg
Q400 Jenna Jameson 2008.jpg
Q407 Deep Throat poster 2.jpg
Q409 Bob-Marley-in-Concert Zurich 05-30-80.jpg
Q410 Carl Sagan Planetary Society.JPG
Q440 Salvador Allende 2.jpg
Q444 Lech Walesa - 2009.jpg
Q448 Denis Diderot - Alix - Vanloo.png
Q449 Brassens TNP 1966.jpg
Q464 Seidel philip ludvig.jpg
Q475 FreiMontalva.jpg
Q489 Bill Maher by David Shankbone cropped.jpg
Q493 Carjat Arthur Rimbaud 1872 n2.jpg
Q498 Lowendal.jpg
Q501 Baudelaire crop.jpg
Q502 Stendhal.jpg
Q504 ZOLA 1902B.jpg
Q512 Vladimir Vysotsky.jpg"
"\n")))