
(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"&Phi;Memory"
s(.split(slurp"picSize.txt")"\n")
n(.split(slurp"qpic")"\n")]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1{:style"background-color:#c0dd00"}[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
;[:script{:src"https://raw.githubusercontent.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/WiDa.js"}]
(map(fn[q](if(not(.startsWith q";"))(let[
 d(read-string(str"0x"q))
 p(filter(fn[i](.startsWith i(str d" ")))s)
 s(filter(fn[i](.startsWith i(str"Q"d" ")))n)]
 (if(and (not-empty p)(not-empty s)(not(.contains(first p)"  ")))
 (let[a(.split(first p)" ")
  bi(.indexOf(first s)" ")
  b(subs(first s)bi)
  h(read-string(str"0x"(get a 2)))
  w(read-string(str"0x"(get a 3)))
  e(java.net.URLEncoder/encode(.replaceAll b" ""_"))]
[:div{:style"width:200px;height:240px;overflow:hidden;float:left;text-align:center"}
 [:img{:id(str"i"q):width w :height h
  :src(str"https://upload.wikimedia.org/wikipedia/commons/thumb/"
   (subs (second a)0 1)"/"(second a)"/"(subs e 1)"/"w"px-"(subs e 1))}]])))))
 (.split(slurp"https://floatingboat2013.appspot.com/eval/55905038")" "))
[:br{:style"clear:both"}]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]]))))