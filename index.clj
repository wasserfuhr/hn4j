(fn[rq rs](let[
 l(.split"a71 9e2 4c 16b1 a7d 3a9 25e0 15c9 464 a2f 334d 3e9 1208 2365 2df2 237 16f7 438d af8 a27 26e8 8d7 85a3 572 23ff 7f6 248e 6d0 1b39 1cf8 c0 12f 90a6 817 5b 15ce 327f 9d 198a 1887 1f50 1169 3ab7 1cce 2896 15d4 4a5 11fc 7753 4e6 3261 2557 3fa9 15d9 7fa 116e 2552 1c53 1023b 4e5 2359 b5 876e 282f 592 3df 2cc3 22ad 1346 fe 234c 9ee a819 25f 94a1 5c8 3e5 10a5 326c 1209 652 14948 3217 4f0 b9 4f3 11abe 350 1dd5 2529 25875 76de2 16a43 375"" ")
 ip(.split(.getRemoteHost rq)"\\.")
 i(apply str(map(fn[i](format"%02x"(Long. i)))ip))
 h(fn[m](let[h(java.security.MessageDigest/getInstance"SHA-256")]
  (. h update m)(.digest h)))
 f(fn[h](apply str(map
  #(format "%02x"(bit-and % 0xff))h)))
 ua(.getHeader rq"User-Agent")
 uh(f(h(.getBytes ua)))]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title"α β"]
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
[:script"
im=[
'4/48/Susan_Polgar_6.jpg/192px-Susan_Polgar_6.jpg',
'0/0e/Goethe_%28Stieler_1828%29.jpg/195px-Goethe_%28Stieler_1828%29.jpg',
'9/9c/Sir_Winston_S_Churchill.jpg/192px-Sir_Winston_S_Churchill.jpg',
'f/fc/Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg/195px-Barbara_Krafft_-_Portr%C3%A4t_Wolfgang_Amadeus_Mozart_%281819%29.jpg',
'5/5f/Elizabeth_II_greets_NASA_GSFC_employees%2C_May_8%2C_2007_edit.jpg/173px-Elizabeth_II_greets_NASA_GSFC_employees%2C_May_8%2C_2007_edit.jpg',
'5/5e/Miguel_%C3%81ngel%2C_por_Daniele_da_Volterra_%28detalle%29.jpg/207px-Miguel_%C3%81ngel%2C_por_Daniele_da_Volterra_%28detalle%29.jpg',
'2/2d/Angela_Merkel_Juli_2010_-_3zu4.jpg/197px-Angela_Merkel_Juli_2010_-_3zu4.jpg',
'b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/197px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg',
'7/72/Xi_Jinping_October_2013_%28cropped%29.jpg/167px-Xi_Jinping_October_2013_%28cropped%29.jpg',
'9/94/Hitchcock%2C_Alfred_02.jpg/216px-Hitchcock%2C_Alfred_02.jpg',
'e/e1/John_McCain_official_portrait_2009.jpg/189px-John_McCain_official_portrait_2009.jpg',
'0/06/Frida_Kahlo%2C_by_Guillermo_Kahlo.jpg/160px-Frida_Kahlo%2C_by_Guillermo_Kahlo.jpg',
'f/f3/Usain_Bolt_Rio_100m_final_2016k.jpg/139px-Usain_Bolt_Rio_100m_final_2016k.jpg',
'4/4f/Konfuzius-1770.jpg/170px-Konfuzius-1770.jpg',
'7/77/MotherTeresa_094.jpg/231px-MotherTeresa_094.jpg',
'7/72/Kofi_Annan_2012_%28cropped%29.jpg/191px-Kofi_Annan_2012_%28cropped%29.jpg',
'4/4a/Pele200802FabioRodriguesPozzebomAgenciaBrasil.jpg/155px-Pele200802FabioRodriguesPozzebomAgenciaBrasil.jpg',
'1/16/John_Major_2014.jpg/166px-John_Major_2014.jpg',
'6/6c/William_Shatner_at_Comic-Con_2012_cropped.jpg/214px-William_Shatner_at_Comic-Con_2012_cropped.jpg',
'8/88/Paolo_Monti_-_Servizio_fotografico_%28Milano%2C_1953%29_-_BEIC_6356204.jpg/190px-Paolo_Monti_-_Servizio_fotografico_%28Milano%2C_1953%29_-_BEIC_6356204.jpg',
'e/ea/General_Charles_de_Gaulle_in_1945.jpg/181px-General_Charles_de_Gaulle_in_1945.jpg',
'a/a6/Joachim_L%C3%B6w%2C_Germany_national_football_team_%2805%29.jpg/160px-Joachim_L%C3%B6w%2C_Germany_national_football_team_%2805%29.jpg',
'b/b0/MartinLuther-workshopCranachElder.jpg/320px-MartinLuther-workshopCranachElder.jpg',
'a/a1/Alan_Turing_Aged_16.jpg/185px-Alan_Turing_Aged_16.jpg',
'e/e3/Henry_Kissinger.jpg/158px-Henry_Kissinger.jpg',
'f/f6/Ban_Ki-moon_1-2.jpg/192px-Ban_Ki-moon_1-2.jpg',
'7/76/Noam_Chomsky_portrait_2015.jpg/180px-Noam_Chomsky_portrait_2015.jpg',
'e/e2/Jimmy_Wales_Fundraiser_Appeal.JPG/191px-Jimmy_Wales_Fundraiser_Appeal.JPG',
'0/08/Albert_Camus%2C_gagnant_de_prix_Nobel%2C_portrait_en_buste%2C_pos%C3%A9_au_bureau%2C_faisant_face_%C3%A0_gauche%2C_cigarette_de_tabagisme.jpg/200px-Albert_Camus%2C_gagnant_de_prix_Nobel%2C_portrait_en_buste%2C_pos%C3%A9_au_bureau%2C_faisant_face_%C3%A0_gauche%2C_cigarette_de_tabagisme.jpg',
'1/1c/Valls_Toulouse_2012.JPG/160px-Valls_Toulouse_2012.JPG',
]

ct=0;
var now=new Date().getTime()
setInterval(function(){
// document.getElementById('rot').style.marginLeft=(now-new Date().getTime())/500+'px'
// document.getElementById('rot').style.marginLeft=(now-new Date().getTime())/500+'px'
document.bi=document.createElement('img');
 ct=(ct+1)%"(count l)"
 var i=document.getElementById('rot').childNodes[Math.floor(64*Math.random())]
// var ii=document.createElement('img')
 //ii.alt=ct
 i.src='https://upload.wikimedia.org/wikipedia/commons/thumb/'+im[ct%24]
 //ii.style.width='45px'
 //ii.style.height='60px'
 //document.getElementById('rot').appendChild(ii);
 //i.remove()
},1000)"]]])))