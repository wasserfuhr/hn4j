(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaMemory"
w(.split(slurp(str"https://"(.getServerName rq)"/rawHead/MemoPic"))"\n")
x(map #(.split(.trim %)" ")w)]((:ht c)
[:head[:title t" « α"](:can c)(:css c)(:vp c)]
[:body[:h1[:span#as[:a#aa{:href"/"}"α"]]"» "t
 ((:pageEdit v)"/memo"t 8)
" "[:sup#t"αt2a87c67.4fx2710fc0"]][:script{:src"/AtJs"}]
[:script"var p=["(apply str(map(fn[q](str"'"(second q)"',\n"))x))"]
function abc(l){for(i=0;i<p.length;i++)
 document.getElementById(p[i]).height=p[i].startsWith(l)?80:1}"]
[:form"Who has a "[:i"first name"]" starting with..."
[:input#lA{:name"A":type"button":value"A...":onclick"abc('A');return false"}]
[:input#lG{:name"G":type"button":value"G...":onclick"abc('G');return false"}]
[:input#lP{:name"P":type"button":value"P...":onclick"abc('P');return false"}]" or "
[:input#lV{:name"V":type"button":value"V...":onclick"abc('V');return false"}]"?"]
;[:br]"last name:"[:input{:size 1}]
[:br](map(fn[q](let[r(.split q" ")n(.trim(second r))]
 [:img{:id n :alt n :title n :src(str"/WiDaPic?q="(first r)):width 80 :height 80}]))w)
[:br]"Save your HiScore: "[:input{:value"you":size 4}]"@"(.getRemoteHost rq)
 (:footer v)])))