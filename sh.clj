(fn[rq rs](let[v(.getAttribute rq"vars")c(.getAttribute rq"c")
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 bh(slurp"https://sl4.eu/bcHead")
 hh(fn[m](apply str(map #(format"%02x"%)m)))
 rd #(.sendRedirect rs%)]
  ((:ht c)[:head[:title"/ad « α"](:can c)(:css c)(:vp c)]
[:body[:h1[:span#as[:a#aa{:href"/"}"α"]]"» "
[:script"
function n(){
 a=document.getElementById('a')
 b=((new Date().getTime()/1000)-0x5608aa2b).toString(16)
 a.value=b.substr(0,10)+
  'x"(subs bh 2)".18610067 \\n'+a.value
 a.focus()
 a.setSelectionRange(20,20)}
function t(){
 document.getElementsByTagName('body')[0].style.backgroundColor='yellow'
 c=document.getElementById('a').value
 d=unescape(encodeURIComponent(c))
 s=''
 for(i=0;i<d.length;i++){
  h=d.charCodeAt(i).toString(16)
  s+=h.length==2?h:'0'+h}
 xhr=new XMLHttpRequest()
 try{
  xhr.open('get','/put/'+s)
  xhr.onreadystatechange=function(){
   if(xhr.readyState===4)
    if(xhr.status===200){
     document.getElementsByTagName('body')[0].style.backgroundColor='#fff'
     h=''}//xhr.responseText.split('.')
    else
     console.log('Error: '+xhr.status)}
  xhr.send(null)}
 catch(e){console.log('Error: '+xhr.status)
  document.getElementsByTagName('body')[0].style.backgroundColor='red'
}}"]
 [:a{:href"/edit"}"edit"]((:pageEdit v)"/ad""ad"8)
 [:sup#t"αt2d9062c.d126e8x7056e.163e6139"]][:script{:src"/AtJs"}]
 "="[:input{:name"n"}]
 [:input{:type"submit":value"try":onclick"t()"}]
 [:input{:type"submit":value"now":onclick"n()"}]
 [:input{:type"submit":value"ok":onclick"o()"}]
 [:br][:textarea#a{:name"content":cols 80 :rows 40 :autofocus true}]
  [:textarea#out{:name"content":cols 80 :rows 40}
   (slurp(.getOutputStream(.exec Runtime/getRuntime()"ls")))]
 (:footer v)])))