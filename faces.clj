(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"WikiFaces"
s(.split(slurp"picSize.txt")"\n")
n(.split(slurp"qpic")"\n")]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script"function cl(e,q){
 var t=document.getElementById(q)
 var x=e.pageX-t.offsetLeft
 xhr=new XMLHttpRequest()
 try{
  xhr.open('get',
   '/pred/RaWa/HiPo/'+
   Math.round(256*x/t.width).toString(16)+'/'+
   q.substr(1))
  xhr.onreadystatechange=function(){
   if(xhr.readyState===4)
    if(xhr.status===200)
     h=xhr.responseText.split('.')
    else
     console.log('Error: '+xhr.status)}
  xhr.send(null)}
 catch(e){console.log('Error: '+xhr.status)}}"]
(map(fn[q](if(not(.startsWith q";"))(let[
 d(read-string(str"0x"q))
 p(filter(fn[i](.startsWith i(str q" ")))s)
 s(filter(fn[i](.startsWith i(str q" ")))n)]
(if(and (not-empty p)(not-empty s)(not(.contains(first p)"  ")))
 (let[a(.split(first p)" ")
   bi(.indexOf(first s)" ")
   b(subs(first s)bi)
   h(read-string(str"0x"(get a 2)))
   w(read-string(str"0x"(get a 3)))
   e(java.net.URLEncoder/encode(.replaceAll b" ""_"))]
   [:div{:style"width:200px;height:240px;overflow:hidden;float:left;text-align:center"}
    [:img{:id(str"i"q):width w :height h :onclick(str"cl(event,'i"q"')")
     :src(str"https://upload.wikimedia.org/wikipedia/commons/thumb/"
     (subs (second a)0 1)"/"(second a)"/"(subs e 1)"/"w"px-"(subs e 1))}]
    [:br][:input{:onclick"alert('+"e"+')']])))))
      (.split"17 42"" "))
   ;    (.split(slurp"qref")" "))
[:br{:style"clear:both"}]
[:script"for(var q in wd){
 d=document.getElementById('r'+q)
 if(d){
  d.title=wd[q]//+'n'+q
  d.alt=wd[q]}}"]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]])))