(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaMemory"
w(.split(slurp(str"https://floatingboat2013.appspot.com/rawHead/MemoPic"))"\n")
x(map #(.split(.trim %)" ")w)](hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
[:div{:style"overflow:hidden;height:60px;width:750px"}
[:div#rot{:style"overflow:hidden;height:60px;width:900px;margin-left:-50px"}
 [:img#rQ23{:height 60 :width 49
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg"}]
 [:img#rQ76{:height 60 :width 48
  :src"https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/192px-President_Barack_Obama.jpg"}]
 [:img#rQ937{:height 60 :width 45
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Albert_Einstein_Head.jpg/180px-Albert_Einstein_Head.jpg"}]
 [:img#rQ991{:height 60 :width 48
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg/192px-Vasily_Perov_-_%D0%9F%D0%BE%D1%80%D1%82%D1%80%D0%B5%D1%82_%D0%A4.%D0%9C.%D0%94%D0%BE%D1%81%D1%82%D0%BE%D0%B5%D0%B2%D1%81%D0%BA%D0%BE%D0%B3%D0%BE_-_Google_Art_Project.jpg"}]
 [:img#rQ12823{:height 60 :width 48
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg"}]
 [:img#rQ5879{:height 60 :width 49
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Goethe_%28Stieler_1828%29.jpg/195px-Goethe_%28Stieler_1828%29.jpg"}]
 [:img#rQ8016{:height 60 :width 48
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg"}]
 [:img#rQ254{:height 60 :width 49
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg/195px-Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg"}]
 [:img#rQ9682{:height 60 :width 43
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Elizabeth_II_greets_NASA_GSFC_employees%2C_May_8%2C_2007_edit.jpg/173px-Elizabeth_II_greets_NASA_GSFC_employees%2C_May_8%2C_2007_edit.jpg"}]
 [:img#rQ5592{:height 60 :width 52
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Miguel_%C3%81ngel%2C_por_Daniele_da_Volterra_%28detalle%29.jpg/207px-Miguel_%C3%81ngel%2C_por_Daniele_da_Volterra_%28detalle%29.jpg"}]
 [:img#rQ567{:height 60 :width 49
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Angela_Merkel_Juli_2010_-_3zu4.jpg/197px-Angela_Merkel_Juli_2010_-_3zu4.jpg"}]
 [:img#rQ23{:height 60 :width 49
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg"}]
 [:img#rQ7200{:height 60 :width 52
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/Portrait_of_Alexander_Pushkin_%28Orest_Kiprensky%2C_1827%29.PNG/206px-Portrait_of_Alexander_Pushkin_%28Orest_Kiprensky%2C_1827%29.PNG"}]
 [:img#rQ19838{:height 60 :width 61
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Steve_Jobs_Headshot_2010-CROP.jpg/245px-Steve_Jobs_Headshot_2010-CROP.jpg"}]
 [:img#rQ92764{:height 60 :width 63
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Sergey_Brin_Ted_2010.jpg/253px-Sergey_Brin_Ted_2010.jpg"}]
 [:img#rQ160305{:height 60 :width 80
   :src"https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Henry_Hubchen.jpg/318px-Henry_Hubchen.jpg"}]]]

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

var now=new Date().getTime()

setInterval(function(){
 document.getElementById('rot').style.marginLeft=(now-new Date().getTime())/500+'px'},50)

setInterval(function(){
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
   
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]])))