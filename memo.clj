(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaMemory"
w(.split(slurp(str"https://floatingboat2013.appspot.com/rawHead/MemoPic"))"\n")
x(map #(.split(.trim %)" ")w)](hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title t" « &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t
; ((:pageEdit v)"/memo"t 8)
" "[:sup#t"&alpha;t2a87c67.4fx2710fc0"]];[:script{:src"/AtJs"}]
[:script"
var ps={
'Q23':'GeorgeWashington',
'Q76':'BarackObama',
'Q937':'AlbertEinstein',
'Q5879':'JohannWolfgangVonGoethe',
'Q8016':'WinstonChurchill',
'Q12823':'SusanPolgar'
}
var more=0;

//match
function m(l,n){
 for(var i=0;i<n.length;i++){var c=n.charAt(i)
  if(l==c&&c.toUpperCase()==c)return true}
 return false}

setInterval(function(){
 if(more==1)
  for(var k in ps)
   s=document.getElementById(k).style.borderColor='#fff'
 if(more>0){
  more--
  document.getElementById('t1').innerHTML='block'
  document.getElementById('moreDiv').style.display='block'}
 else
  document.getElementById('moreDiv').style.display='none'
 document.getElementById('more').innerHTML=more},1000);

function d(i){
 s=document.getElementById(i).style
 s.borderColor=('yellow'==s.borderColor)?'#fff':'yellow'}

function q(){try{for(var k in ps){
  l=document.getElementById('l').innerHTML
  s=document.getElementById(k).style
  s.borderColor=('yellow'==s.borderColor)==m(l,ps[k])?'green':'red'}
 s=document.getElementById('l').innerHTML='ABEGJOSPW'.charAt(Math.floor(Math.random()*6))
 more=5
}catch(e){alert(e)}}

var p=["(apply str(map(fn[q](str"'"(second q)"',\n"))x))"]
function abc(l){for(i=0;i<p.length;i++)
 document.getElementById(p[i]).height=p[i].startsWith(l)?80:1}"]
[:form
[:table
 [:tr[:td"Which "[:i"first name"]" or "[:i"last name"]" starts with..."]
  [:td{:rowspan 2}[:b{:style"font-size:400%"}[:span#l"A"]"?"]]]
 [:tr[:td"Welcher "[:i"Vor-"]" oder "[:i"Nachname"]" faengt an mit..."]]
 [:tr[:td{:style"text-align:right"}"Click the images and then press"]
  [:td{:rowspan 2}[:input#lA{:name"A":type"button":value"Done":onclick"q();return false"}]]]
  [:td"Clicke die richtigen Bilder an und dann druecke"]]]


[:div#moreDiv"More in "[:span#more 0]" seconds..."]

[:div[:span#t1{"z-index:1"}]
[:img#Q23{:width 105 :height 128 :style"border:#fff solid 3px;z-index:0" :onclick"d('Q23')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg"}]]

[:img#Q76{:width 102 :height 128 :style"border:#fff solid 3px" :onclick"d('Q76')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/192px-President_Barack_Obama.jpg"}]

[:img#Q937{:width 96 :height 128 :style"border:#fff solid 3px" :onclick"d('Q937')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Albert_Einstein_Head.jpg/180px-Albert_Einstein_Head.jpg"}]

[:img#Q5879{:width 104 :height 128 :style"border:#fff solid 3px" :onclick"d('Q5879')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Goethe_%28Stieler_1828%29.jpg/195px-Goethe_%28Stieler_1828%29.jpg"}]

[:img#Q8016{:width 102 :height 128 :style"border:#fff solid 3px" :onclick"d('Q8016')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg"}]

[:img#Q12823{:width 102 :height 128 :style"border:#fff solid 3px" :onclick"d('Q12823')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg"}]

;[:br](map(fn[q](let[r(.split q" ")n(.trim(second r))]
; [:img{:id n :alt n :title n :src(str"/WiDaPic?q="(first r)):width 80 :height 80}]))w)

[:br]"Save your HiScore: "[:input{:value"you":size 4}]"@"(.getRemoteHost rq)
 [:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production."]]])))