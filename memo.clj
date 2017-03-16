(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaMemory"
w(.split(slurp(str"https://floatingboat2013.appspot.com/rawHead/MemoPic"))"\n")
x(map #(.split(.trim %)" ")w)](hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title t" « &alpha;"]
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]
;(:can c)(:css c)(:vp c)


]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t
; ((:pageEdit v)"/memo"t 8)
" "[:sup#t"&alpha;t2a87c67.4fx2710fc0"]];[:script{:src"/AtJs"}]
[:script"
p={
'Q23':'GeorgeWashington',
'Q76':'BarackObama',
}alert(p.keys)

function d(i){
 s=document.getElementById(i).style
 s.borderColor=('red'==s.borderColor)?'#fff':'red'}
function q(){


var p=["(apply str(map(fn[q](str"'"(second q)"',\n"))x))"]
function abc(l){for(i=0;i<p.length;i++)
 document.getElementById(p[i]).height=p[i].startsWith(l)?80:1}"]
[:form
[:table
 [:tr[:td"Which "[:i"first name"]" or "[:i"last name"]" starts with..."]
  [:td{:rowspan 2}[:b{:style"font-size:400%"}"A?"]]]
 [:tr[:td"Welcher "[:i"Vor-"]" oder "[:i"Nachname"]" faengt an mit..."]]]

[:br]"Click the images and then press"
[:br]"Clicke die richtigen Bilder an und dann druecke"
[:input#lA{:name"A":type"button":value"Done":onclick"abc('A');return false"}]]

;(.split""
;Q23 105 :height 128 :onclick"document.getElementById('Q23').style.border='red solid 2px'"
;f('Q23')
;:src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg"}]

[:img#Q23{:width 105 :height 128 :style"border:#fff solid 2px" :onclick"d('Q23')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg"}]

[:img#Q76{:width 102 :height 128 :style"border:#fff solid 2px" :onclick"d('Q76')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/192px-President_Barack_Obama.jpg"}]

[:img#Q937{:width 96 :height 128 :style"border:#fff solid 2px" :onclick"d('Q937')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Albert_Einstein_Head.jpg/180px-Albert_Einstein_Head.jpg"}]

[:img#Q5879{:width 104 :height 128 :style"border:#fff solid 2px" :onclick"d('Q5879')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Goethe_%28Stieler_1828%29.jpg/195px-Goethe_%28Stieler_1828%29.jpg"}]

[:img#Q8016{:width 102 :height 128 :style"border:#fff solid 2px" :onclick"d('Q8016')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg"}]

[:img#Q12823{:width 102 :height 128 :style"border:#fff solid 2px" :onclick"d('Q12823')"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg"}]

;[:br](map(fn[q](let[r(.split q" ")n(.trim(second r))]
; [:img{:id n :alt n :title n :src(str"/WiDaPic?q="(first r)):width 80 :height 80}]))w)
[:br]"Save your HiScore: "[:input{:value"you":size 4}]"@"(.getRemoteHost rq)
 ;(:footer v)
 ]])))