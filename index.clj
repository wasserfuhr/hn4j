(fn[rq rs](let[t"&alpha;"](hiccup.core/html"<!DOCTYPE html>"[:html
[:head[:title#ti t" « &alpha;0"][:style{:type"text/css"}"
body{
 background:#000;
 color:#0f0;
 font-family:monospace}
a{color:#0f1}"]]
[:body
 [:canvas#ac{:width 256 :height 16}][:br]
 [:div#say]
 [:hr]
 "&alpha; "
 [:small"pro: "
  [:a{:href"https://floatingboat2013.appspot.com/ad"}"ad"]" "
  [:a{:href"https://floatingboat2013.appspot.com/"}"fl"]" "
  [:a{:href"https://sl4.eu/hls"}"hl"]" "
  [:a{:href"https://sl4.eu/ls"}"ls"]" "
  [:a{:href"https://floatingboat2013.appspot.com/UrPic"}"ur"]]
[:script"try{
var start=new Date().getTime()
var bt='(subs bt 13)'
var c=document.getElementById('ac').getContext('2d')
var ti=document.getElementById('ti')
var s=document.getElementById('say')
function bits(v,x,y){
 for(var i=0;i<4;i++)
  if(v&(1<<i))
   c.fillRect(x*64+i*16,y*16,16,16)}
function t(){try{
 var t0=Math.floor((new Date().getTime()-start)/1000)
 if(([2,4,8].indexOf(t0)>0)||((t0&15)==0)){
 var l=0
 xhr=new XMLHttpRequest()
 try{
  var n=document.getElementById('n')
  xhr.open('get','https://sl4.eu/alive/'+t0.toString(16)+(n?('/'+n.value):''))
  xhr.onreadystatechange=function(){
   if(xhr.readyState===4)
    if(xhr.status===200){
     h=''}//xhr.responseText.split('.')
    else
     console.log('Error: '+xhr.status)}
  xhr.send(null)}
 catch(e){console.log('Error: '+xhr.status)}}
 c.fillStyle='#000'
 c.fillRect(0,0,256,16)
 c.fillStyle='#0f0'
 try{
  ti.innerHTML='&alpha; « &alpha;t'+t0.toString(16)
 }catch(e){}
 say={2:'...',
6:'WelCome!',
8:'What you see on top is called a BinaryCounter.',
12:'It was invented many years ago by this man:',
14:'<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg/64px-Gottfried_Wilhelm_Leibniz%2C_Bernhard_Christoph_Francke.jpg\"/>',
16:'His name is <a href=\"/wiki/GottfriedWilhelmLeibniz\" target=\"_\">GottfriedWilhelmLeibniz</a>',
18:'The left most cube changes every second,',
20:'the next one to the right every 2 seconds,',
24:'the next one every 4 seconds,',
28:'the next one every 8 seconds,',
32:'the next one every 16 seconds,',
36:'and so on.',
40:'On your SmartPhone or LapTop, a BinaryCounter works at least 1000 times per second.',
42:'What is your name? <input id=\"n\"/>.',
56:'Many, many years later, this guy was born:',
60:'<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Alan_Turing_Aged_16.jpg/64px-Alan_Turing_Aged_16.jpg\"/>',
64:'His name is <a href=\"/wiki/AlanTuring\" target=\"_\">AlanTuring</a>',
68:'He predicted that computers could become intelligent and indistinguishable from a human chat partner during our lifetime',
72:'How do you feel? <input id=\"f\"/>.',
80:'This is the HomePage of &laquo;AlphaLabs&raquo;',
84:'We love IntelligentArt.',
88:'AreYouReady?',
128:'?',
256:'??'}
 if(say[t0])
  s.innerHTML=say[t0]+'<br/>'+s.innerHTML;
 for(var i=0;i<7;i++){
  var v=(t0>>(4*i))&15
  bits(v,i,0)}
}catch(e){alert(e)}}
setInterval(t,1000)
}catch(e){alert(e)}"]
]])))