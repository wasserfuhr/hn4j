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
" "[:sup#t"&alpha;t2a87c67.4fx2710fc0"]][:script{:src"/AtJs"}]
[:script"var p=["(apply str(map(fn[q](str"'"(second q)"',\n"))x))"]
function abc(l){for(i=0;i<p.length;i++)
 document.getElementById(p[i]).height=p[i].startsWith(l)?80:1}"]
[:form"Who has a "[:i"first name"]" or "[:i"last name"]" starting with..."[:b "A"]"?"
[:input#lA{:name"A":type"button":value"A...":onclick"abc('A');return false"}]
[:input#lG{:name"G":type"button":value"G...":onclick"abc('G');return false"}]
[:input#lP{:name"P":type"button":value"P...":onclick"abc('P');return false"}]" or "
[:input#lV{:name"V":type"button":value"V...":onclick"abc('V');return false"}]"?"]
[:img#i{:width 105 :height 128 :onclick"document.getElementById('i').style.border='red solid 2px'"
:src"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg"}]


;[:br]"last name:"[:input{:size 1}]
[:br](map(fn[q](let[r(.split q" ")n(.trim(second r))]
 [:img{:id n :alt n :title n :src(str"/WiDaPic?q="(first r)):width 80 :height 80}]))w)
[:br]"Save your HiScore: "[:input{:value"you":size 4}]"@"(.getRemoteHost rq)
 ;(:footer v)
 ]])))