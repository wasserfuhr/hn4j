(fn[rq rs](let[
 l(.split"a71 9e2 4c 16b1 a7d 3a9 25e0 15c9 464 a2f 334d 3e9 1208 2365 2df2 237 16f7 438d af8 a27 26e8 8d7 85a3 572 23ff 7f6 248e 6d0 1b39 1cf8 c0 12f 90a6 817 5b 15ce 327f 9d 198a 1887 1f50 1169 3ab7 1cce 2896 15d4 4a5 11fc 7753 4e6 3261 2557 3fa9 15d9 7fa 116e 2552 1c53 1023b 4e5 2359 b5 876e 282f 592 3df 2cc3 22ad 1346 fe 234c 9ee a819 25f 94a1 5c8 3e5 10a5 326c 1209 652 14948 3217 4f0 b9 4f3 11abe 350 1dd5 2529 25875 76de2 16a43 375"" ")
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
  (. h update m)(.digest h)))
 f(fn[h](apply str(map
  #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]][:body
[:div#rot(map(fn[i][:img{:id(str"i"i):alt i}])l)]
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
'f/fc/Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg/195px-Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg']

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
 ii.src='https://upload.wikimedia.org/wikipedia/commons/thumb/'+im[ct%4]
 ii.width='25%'
 ii.height='25%'
 document.getElementById('rot').appendChild(ii);
 i.remove()
},1000)"]]])))