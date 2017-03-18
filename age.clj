(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaHistory"
s(.split(slurp"picSize.txt")"\n")
n(.split(slurp"picName.txt")"\n")
]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
;[:script{:src"https://raw.githubusercontent.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/WiDa.js"}]

(read-string "0xff")
(map(fn[q](let[
 d(read-string(str"0x"q))
 p(filter(fn[i](.startsWith i(str d" ")))s)
 s(filter(fn[i](.startsWith i(str"Q"d" ")))n)]
 (if(and (not-empty p)(not-empty s)(not(.contains (first p)"  ")))
 (let[a(.split(first p)" ")
  bi(.indexOf(first s)" ")
  b(subs(first s)bi)
  h(read-string(str"0x"(get a 2)))
  w(read-string(str"0x"(get a 3)))
  e(java.net.URLEncoder/encode (.replaceAll b" ""_"))]
[:img{:id(str"i"q)
:src(str"https://upload.wikimedia.org/wikipedia/commons/thumb/"(subs (second a)0 1)"/"(second a)"/"
(subs e 1)"/"w"px-"(subs e 1))
:width w
:height h
:title b
}]))))
 (.split"5f3 5f6 5f8 5fc 391 35b 364 605 418 576 27b 57d 7f7 57f 583 806 586 58b 581 589 590 588 585 832 58d 58f 591 871 593 595 596 59c 599 5a0 5a2 6f6 59a 6d8 705 6f1 70d 5a6 70b 726 6e2 719 6e9 714 2d0 161 15a 42b 579 57a 346 6fa 351 2fa 6fc 6ff 577 706 26b 5d8 24e 12d 2b4 133 129 2eb 2af 50a 4a8 2e6 3a7 261 53c 479 53b 1f2 413 22f 1c0 232 17 635 2a8 fe 205 ff 2a3 1f6 428 535"" "))

 [:img#rQ326{:height 60 :width 42
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0 /Eduardo_Frei_Chiledebate.jpg/166px-Eduardo_Frei_Chiledebate.jpg"}]

[:br{:style"clear:both"}]
[:script"for(var q in wd){
 d=document.getElementById('r'+q)
 if(d){
  d.title=wd[q]//+'n'+q
  d.alt=wd[q]}}"]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]]))))