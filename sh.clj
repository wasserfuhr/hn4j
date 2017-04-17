(fn[rq rs](let[
 hf(fn[m];https://gist.github.com/kisom/1698245
  (let[h(java.security.MessageDigest/getInstance"SHA-256")]
   (. h update m)(.digest h)))
 bh(slurp"https://sl4.eu/bcHead")
 hh(fn[m](apply str(map #(format"%02x"%)m)))]
(hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title"/sh &laquo; &alpha;"]
 [:link {:href"https://dresdenlabs.appspot.com/css"
 :rel"stylesheet":type"text/css"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"» "
[:script"
ce=document.getElementById('c')
function cl(t){ce.value=t.innerHTML}
function t(){
 document.getElementsByTagName('body')[0].style.backgroundColor='yellow'
 c=ce.value
 d=unescape(encodeURIComponent(c))
 for(var i=0;i<8;i++)
  document.getElementById('o'+i).innerHTML=
   document.getElementById('o'+(i+1)).innerHTML
 document.getElementById('o8').innerHTML=c
 xhr=new XMLHttpRequest()
 try{
  xhr.open('get','/exec/'+d)
  xhr.onreadystatechange=function(){
   if(xhr.readyState===4)
    if(xhr.status===200){
     document.getElementsByTagName('body')[0].style.backgroundColor='#fff'
     document.getElementById('out').value=xhr.responseText}
    else{
     document.getElementsByTagName('body')[0].style.backgroundColor='#red'
     document.getElementById('out').value=xhr.responseText}}
  xhr.send(null)}
 catch(e){console.log('Error: '+xhr.status)
  document.getElementsByTagName('body')[0].style.backgroundColor='red'
}}"]
 [:a{:href"/edit"}"edit"];((:pageEdit v)"/ad""ad"8)
 [:sup#t"αt2d9062c.d126e8x7056e.163e6139"]][:script{:src"/AtJs"}]
 [:form{:onsubmit"t();return false"}
 "="[:input#c]
  [:input{:type"submit":value"!"}]]
 [:br]
 [:select#s{:multiple true}
  [:option#o8{:onclick"cl(this)"}"gs"]
  [:option#o7{:onclick"cl(this)"}"ls -l"]
  [:option#o6{:onclick"cl(this)"}""]
  [:option#o5{:onclick"cl(this)"}""]
  [:option#o4{:onclick"cl(this)"}""]
  [:option#o3{:onclick"cl(this)"}""]
  [:option#o2{:onclick"cl(this)"}""]
  [:option#o1{:onclick"cl(this)"}""]
  [:option#o0{:onclick"cl(this)"}""]]
 [:br]
  [:textarea#out{:name"content":cols 80 :rows 40}
   (slurp(.getInputStream(.exec(Runtime/getRuntime)"echo `date;ls -l`")))]
[:script"ce=document.getElementById('c')"]
 ;(:footer v)
 ]])))