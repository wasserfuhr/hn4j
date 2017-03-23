(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"&Phi;Memory"
s(.split(slurp"picSize.txt")"\n")
n(.split(slurp"qpic")"\n")
w(.split(slurp(str"https://floatingboat2013.appspot.com/rawHead/MemoPic"))"\n")
x(map #(.split(.trim %)" ")w)]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1{:style"background-color:#c0dd00"}[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script"
 document.getElementById('moreDiv').style.display=(more>0)?'block':'none'
 more--
 if(more==0){
  var c='ABEGJOSPW'
  document.getElementById('l').innerHTML=c.charAt(Math.floor(Math.random()*c.length))}

 for(var k in ps){
  document.getElementById('t'+k).innerHTML=ps[k]
  document.getElementById('t'+k).style.display=(more>0)?'block':'none'
  if(more==0)
   document.getElementById(k).style.borderColor='#fff'}
  document.getElementById('more').innerHTML=more},1000)

function d(i){
 l=document.getElementById('l').innerHTML
 s=document.getElementById(i).style
 s.borderColor=('yellow'==s.borderColor)?'#fff':'yellow'
 xhr=new XMLHttpRequest()
 try{
  xhr.open('get','/char/'+l+'/'+i)
  xhr.onreadystatechange=function(){
  if(xhr.readyState===4)
   if(xhr.status===200)
    h=xhr.responseText.split('.')
   else
    console.log('Error: '+xhr.status)}
   xhr.send(null)}
 catch(e){console.log('Error: '+xhr.status)}}

function q(){try{for(var k in ps){
 var l=document.getElementById('l').innerHTML
 var s=document.getElementById(k).style
 s.borderColor=('yellow'==s.borderColor)==m(l,ps[k])?'green':'red'
  if('green'==s.borderColor)hc++}
  hm+=6;
  document.getElementById('hc').innerHTML=hc;
  document.getElementById('hm').innerHTML=hm;
  more=5
  }catch(e){alert(e)}}

var p=[";(apply str(map(fn[q](str"'"(second q)"',\n"))x))
"]
function abc(l){for(i=0;i<p.length;i++)
 document.getElementById(p[i]).height=p[i].startsWith(l)?80:1}"]
[:table
 [:tr
  [:td{:rowspan 4}[:b{:style"font-size:200%"}"HiScore:"[:br][:span#hc 0]"/"[:span#hm 0]]]
  [:td{:style"text-align:right"}"Which "[:i"first name"]" or "[:i"last name"]" starts with..."]
  [:td{:rowspan 2}[:b{:style"font-size:400%"}[:span#l"A"]"?"]]]
 [:tr
  [:td{:style"text-align:right"}"Welcher "[:i"Vor-"]" oder "[:i"Nachname"]" f&auml;ngt an mit..."]]
 [:tr
  [:td{:style"text-align:right"}"Click the images and then press..."]
  [:td{:rowspan 2}[:input#lA{:name"A":type"button":value"Done":onclick"q();return false"}]]
  [:td"Clicke die richtigen Bilder an und dann dr&uuml;cke..."]]]

[:div#moreDiv"More in "[:span#more 0]" seconds..."]

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
 [:img{:id(str"i"q):width w :height h
  :src(str"https://upload.wikimedia.org/wikipedia/commons/thumb/"
   (subs (second a)0 1)"/"(second a)"/"(subs e 1)"/"w"px-"(subs e 1))}]])))))
 (.split(slurp"https://floatingboat2013.appspot.com/eval/55905038")" "))
[:br{:style"clear:both"}]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]])))))