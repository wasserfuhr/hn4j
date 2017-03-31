(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"HildeMemory"
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
    [:img{:id(str"i"q):width 64 :heigt h :onclick(str"cl(event,'i"q"')")
     :src(str"https://upload.wikimedia.org/wikipedia/commons/thumb/"
     (subs (second a)0 1)"/"(second a)"/"(subs e 1)"/"64"px-"(subs e 1))}]])))))

 (.split"a71 9e2 4c 16b1 a7d 3a9 25e0 15c9 464 a2f 334d 3e9 1208 2365 2df2 237 16f7 438d af8 a27 26e8 8d7 85a3 572 23ff 7f6 248e 6d0 1b39 1cf8 c0 12f 90a6 817 5b 15ce 327f 9d 198a 1887 1f50 1169 3ab7 1cce 2896 15d4 4a5 11fc 7753 4e6 3261 2557 3fa9 15d9 7fa 116e 2552 1c53 1023b 4e5 2359 b5 876e 282f 592 3df 2cc3 22ad 1346 fe 234c 9ee a819 25f 94a1 5c8 3e5 10a5 326c 1209 652 14948 3217 4f0 b9 4f3 11abe 350 1dd5 2529 25875 76de2 16a43 375"" "))
;      (.split(slurp"qref")" "))
[:br{:style"clear:both"}]
[:script"for(var q in wd){
 d=document.getElementById('r'+q)
 if(d){
  d.title=wd[q]//+'n'+q
  d.alt=wd[q]}}"]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]])))