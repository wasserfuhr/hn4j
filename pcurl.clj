(fn[rq rs](let[
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
  (. h update m)(.digest h)))
 f(fn[h](apply str(map
  #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))]











try{
var ct=0;
var now=new Date().gesetInterval(function(){
try{
 ct++
 //if(ct<2)alert(1)
(slurp'https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/President_Barack_Obama.jpg/192px-President_Barack_Obama.jpg")