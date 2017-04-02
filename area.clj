(fn[rq rs]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]]
[:body
[:p"Hi "(subs uh 0 6)"@i"]
"&alpha;ta: we are "[:a{:href"https://dresdenlabs.appspot.com/"}"&alpha;"]" approaching &beta;."
"create our future yourself:"[:br]
[:textarea#t{:cols 32 :rows 32}"This TextArea is stored in a BlockChain!
*TopSecret*: VraagTeken verboten - please use »¿«

where is DiebesGott¿¿

hi DiebesGott!!! ;)

:060435 z 9? AmSims
InBox (3):
 AmHaus: SchnarchKarte?
 CatChen: EarlForest soon
 HiPo: HautAnHaut!
 JoKo: AlphaNet¿"]
[:script"
 var last='This TextArea is stored in a BlockChain'
 setInterval(function(){
  if(last!=document.getElementById('t').value){
   last=document.getElementById('t').value
   xhr=new XMLHttpRequest()
   xhr.open('get','/text/'+document.getElementById('t').value)
   xhr.onreadystatechange=function(){
    if(xhr.readyState===4)
     if(xhr.status===200)
      h=xhr.responseText.split('.')
     else
      console.log('Error: '+xhr.status)}
   xhr.send(null)}},1000)"]
]]))