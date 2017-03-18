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

(map(fn[q](let[
 d(read-string(str"0x"q))
 p(filter(fn[i](.startsWith i(str d" ")))s)
 s(filter(fn[i](.startsWith i(str"Q"d" ")))n)]
 (if(and p s)(let[a(.split(first p)" ")
 b(.split(first s)" ")]
[:img{:id(str"i"q)
:alt (second a)
:title (second b)
}]))))
 (.split"5f3 5f6 5f8 5fc 391"" "))
 
 [:img#rQ326{:height 60 :width 42
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0 /Eduardo_Frei_Chiledebate.jpg/166px-Eduardo_Frei_Chiledebate.jpg"}]

[:br{:style"clear:both"}]
[:script"for(var q in wd){
 d=document.getElementById('r'+q)
 if(d){
  d.title=wd[q]//+'n'+q
  d.alt=wd[q]}}"]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]])))