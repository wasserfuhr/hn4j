(fn[rq rs](let[
 ip(.split(.getRemoteHost rq)"\\.")
 i(apply str(map(fn[i](format"%02x"(Long. i)))ip))
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
  (. h update m)(.digest h)))
 f(fn[h](apply str(map
  #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"&alpha; &raquo; &beta;"]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]][:body
;[:div{:style"overflow:hidden;height:60px;width:750px"}
[:div#rot;{:style"overflow:hidden;height:60px;width:900px;margin-let:-50px"}
(map(fn[i]
 [:img{:style"height:60px;width:45px"}]
 )(range 64))
];]
[:p"Hi "(subs uh 0 6)"@"i]
[:br][:br]"Try "
[:a{:href"https://sl4.eu/age"}"History"]" "
[:a{:href"https://sl4.eu/math"}"Math"]" "
[:a{:href"https://sl4.eu/memo"}"Memory"]" "
[:a{:href"https://sl4.eu/phim"}"Physics"]" "
[:a{:href"https://sl4.eu/tap"}"Tapestry"]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/hilde.js"}]
[:script"
try{
alert(Math.random())
}catch(e){alert(e)}

try{
ct=0;
var now=new Date().getTime()
setInterval(function(){
 ct=(ct+1)%64
 var i=document.getElementById('rot').childNodes[Math.floor(64*Math.random())]
 i.src='https://upload.wikimedia.org/wikipedia/commons/thumb/'+hpic[ct%128]},1000)
}catch(e){alert(e)}
"]]])))