(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaMemory"
w(.split(slurp(str"https://floatingboat2013.appspot.com/rawHead/MemoPic"))"\n")
x(map #(.split(.trim %)" ")w)](hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
[:script"
var ps={"
(map(fn[l](let[ll(.split l" ")](str"'"(first ll)"':'"(.trim(second ll))"',\n")))
(.split
"Q23 GeorgeWashington
Q76 BarackObama
Q937 AlbertEinstein
Q5879 JohannWolfgangVonGoethe
Q8016 WinstonChurchill
Q12823 SusanPolgar""\n"))"}
var more=-1;
var hc=0;
var hm=0;
//Q991 FyodorDostoyevsky
//match
function m(l,n){
 for(var i=0;i<n.length;i++){var c=n.charAt(i)
  if(l==c&&c.toUpperCase()==c)return true}
 return false}

setInterval(function(){
 document.getElementById('rot').style.paddingLeft=(40-(new Date().getTime()/500)%40)+'px'

// document.getElementById('Q991').style.backgroundImage='url(https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg/192px-Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg)'

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
 document.getElementById('more').innerHTML=more},1000);

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

var p=["(apply str(map(fn[q](str"'"(second q)"',\n"))x))"]
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
  [:td{:rowspan 2}[:input#lA{:name"A":type"button":value"Done":onclick"q();return false"}]]]
  [:td"Clicke die richtigen Bilder an und dann dr&uuml;cke..."]]]

[:div#moreDiv"More in "[:span#more 0]" seconds..."]

[:div
[:div#Q23{:style"width:105px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:105px 128px;background-repeat:no-repeat;background-image:url(
 https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg
)":onclick"d('Q23')"}[:p#tQ23{:style"background-color:#fff"}]]

[:div#Q76{:style"width:105px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:105px 128px;background-repeat:no-repeat;background-image:url(
 https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/192px-President_Barack_Obama.jpg
)":onclick"d('Q76')"}[:p#tQ76{:style"background-color:#fff"}]]

[:div#Q937{:style"width:96px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:96px 128px;background-repeat:no-repeat;background-image:url(
 https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Albert_Einstein_Head.jpg/180px-Albert_Einstein_Head.jpg
)":onclick"d('Q937')"}[:p#tQ937{:style"background-color:#fff"}]]

[:div#Q5879{:style"width:96px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:96px 128px;background-repeat:no-repeat;background-image:url(
 https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Goethe_%28Stieler_1828%29.jpg/195px-Goethe_%28Stieler_1828%29.jpg
)":onclick"d('Q5879')"}[:p#tQ5879{:style"background-color:#fff"}]]

[:div#Q8016{:style"width:96px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:96px 128px;background-repeat:no-repeat;background-image:url(
 https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg
)":onclick"d('Q8016')"}[:p#tQ8016{:style"background-color:#fff"}]]

[:div#Q12823{:style"width:96px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:96px 128px;background-repeat:no-repeat;background-image:url(
 https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg
)":onclick"d('Q12823')"}[:p#tQ12823{:style"background-color:#fff"}]]

[:div#Q991{:style"width:96px;vertical-align:text-bottom;border:#fff solid 3px;height:128px;float:left;background-size:96px 120px;background-repeat:no-repeat":onclick"d('Q991')"}[:p#tQ8016{:style"background-color:#fff"}]]

][:br{:style"clear:both"}]

[:img#rot{:width 50 :height 60 :src"https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg"}]
[:img{:width 50 :height 60 :src"https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg/192px-Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg"}]
[:img{:width 50 :height 60 :src"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg"}]

[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]])))