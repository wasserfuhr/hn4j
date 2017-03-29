(fn[rq rs](let[
 l(.split"a71 9e2 4c 16b1 a7d 3a9 25e0 15c9 464 a2f 334d 3e9 1208 2365 2df2 237 16f7 438d af8 a27 26e8 8d7 85a3 572 23ff 7f6 248e 6d0 1b39 1cf8 c0 12f 90a6 817 5b 15ce 327f 9d 198a 1887 1f50 1169 3ab7 1cce 2896 15d4 4a5 11fc 7753 4e6 3261 2557 3fa9 15d9 7fa 116e 2552 1c53 1023b 4e5 2359 b5 876e 282f 592 3df 2cc3 22ad 1346 fe 234c 9ee a819 25f 94a1 5c8 3e5 10a5 326c 1209 652 14948 3217 4f0 b9 4f3 11abe 350 1dd5 2529 25875 76de2 16a43 375"" ")
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
  (. h update m)(.digest h)))
 f(fn[h](apply str(map
  #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]][:body
[:div{:style"overflow:hidden;height:60px;width:750px"}
[:div#rot{:style"overflow:hidden;height:60px;width:900px;margin-left:-50px"}
 [:img{:style"height:60px"
 :src"https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg"}]
;(map(fn[i][:img{:id(str"i"i):alt i}])l)
]]
[:p"Hi "(subs uh 0 6)"@i"]
"&alpha;ta: we are "[:a{:href"https://dresdenlabs.appspot.com/"}"&alpha;"]" approaching &beta;."
[:br][:br]"Try "
[:a{:href"https://sl4.eu/age"}"History"]" "
[:a{:href"https://sl4.eu/math"}"Math"]" "
[:a{:href"https://sl4.eu/memo"}"Memory"]" "
[:a{:href"https://sl4.eu/phim"}"Physics"]" "
[:a{:href"https://sl4.eu/tap"}"Tapestry"]
[:script"
im=[
'4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg',
'0/0e/Goethe_%28Stieler_1828%29.jpg/195px-Goethe_%28Stieler_1828%29.jpg',
'9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg',
'f/fc/Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg/195px-Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg',
'5/5f/Elizabeth_II_greets_NASA_GSFC_employees%2C_May_8%2C_2007_edit.jpg/173px-Elizabeth_II_greets_NASA_GSFC_employees%2C_May_8%2C_2007_edit.jpg',
'5/5e/Miguel_%C3%81ngel%2C_por_Daniele_da_Volterra_%28detalle%29.jpg/207px-Miguel_%C3%81ngel%2C_por_Daniele_da_Volterra_%28detalle%29.jpg',
'2/2d/Angela_Merkel_Juli_2010_-_3zu4.jpg/197px-Angela_Merkel_Juli_2010_-_3zu4.jpg',
'b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg'
]

ct=0;
var now=new Date().getTime()
setInterval(function(){
// document.getElementById('rot').style.marginLeft=(now-new Date().getTime())/500+'px'
// document.getElementById('rot').style.marginLeft=(now-new Date().getTime())/500+'px'
document.bi=document.createElement('img');
 ct=(ct+1)%"(count l)"
 var i=document.getElementById('rot').childNodes[0]
 var ii=document.createElement('img')
 ii.alt=ct
 ii.src='https://upload.wikimedia.org/wikipedia/commons/thumb/'+im[ct%8]
 ii.style.width='25%'
 ii.style.height='25%'
 ii.style.width='12%'
 ii.style.height='12%'
 document.getElementById('rot').appendChild(ii);
 i.remove()
},1000)"]]])))