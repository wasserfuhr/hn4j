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
ce=document.getElementById('c')
function t(){
 document.getElementsByTagName('body')[0].style.backgroundColor='yellow'
 c=ce.value
 d=unescape(encodeURIComponent(c))
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
 [:br]
 [:select#s{:multiple true}
  [:option{:value 2 :onclick"ce.value=this.innerHTML"}"gs"]
  [:option{:value 1}"ls -l"]]
 [:br]
  [:textarea#out{:name"content":cols 80 :rows 40}
   (slurp(.getInputStream(.exec(Runtime/getRuntime)"echo `date;ls -l`")))]
 ;(:footer v)
 ]])))