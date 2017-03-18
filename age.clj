(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaHistory"
s(.split(slurp"picSize.txt")"\")
]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
;[:script{:src"https://raw.githubusercontent.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/WiDa.js"}]

(map(fn[q][:img{:id(str"i"q)}]
;(read-string(str"0x"q)
;(filter s(fn[i](.startsWith(str
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