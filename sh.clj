(fn[rq rs](let[
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 bh(slurp"https://sl4.eu/bcHead")
 hh(fn[m](apply str(map #(format"%02x"%)m)))]
(hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title"/sh « α"]]
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
 c=document.getElementById('c').value
 d=unescape(encodeURIComponent(c))
 s=''
 for(i=0;i<d.length;i++){
  h=d.charCodeAt(i).toString(16)
  s+=h.length==2?h:'0'+h}
 xhr=new XMLHttpRequest()
 try{
  xhr.open('get','/exec/'+d)
  xhr.onreadystatechange=function(){
   if(xhr.readyState===4)
    if(xhr.status===200){
     document.getElementsByTagName('body')[0].style.backgroundColor='#fff'
     document.getElementById('out').value=xhr.responseText}
    else
     console.log('Error: '+xhr.status)}
  xhr.send(null)}
 catch(e){console.log('Error: '+xhr.status)
  document.getElementsByTagName('body')[0].style.backgroundColor='red'
}}"]
 [:a{:href"/edit"}"edit"];((:pageEdit v)"/ad""ad"8)
 [:sup#t"αt2d9062c.d126e8x7056e.163e6139"]][:script{:src"/AtJs"}]
 "="[:input#c]
 [:input{:type"submit":value"!":onclick"t()"}]
 [:input{:type"submit":value"now":onclick"n()"}]
 [:input{:type"submit":value"ok":onclick"o()"}]
 [:br]
  [:textarea#out{:name"content":cols 80 :rows 40}
   (slurp(.getInputStream(.exec(Runtime/getRuntime)"echo `date;ls -l`")))]
 ;(:footer v)
 ]])))