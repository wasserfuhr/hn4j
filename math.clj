(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaHistory"
s(.split(slurp"picSize.txt")"\n")
n(.split(slurp"qpic")"\n")]
(hiccup.core/html"<!DOCTYPE html>"[:html[:head[:title t" &laquo; &alpha;"];(:can c)(:css c)(:vp c)
[:link{:rel"stylesheet":type"text/css":href"https://dresdenlabs.appspot.com/css"}]
[:meta{:name"viewport":content"width=device-width,initial-scale=1.0"}]]
[:body[:h1[:span#as[:a#aa{:href"/"}"&alpha;"]]"&raquo; "t]
;[:script{:src"https://raw.githubusercontent.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script{:src"https://rawgit.com/wasserfuhr/hn4j/master/WiDa.js"}]
[:script"function cl(e,q){
 var t=document.getElementById(q)
 var x=e.pageX-t.offsetLeft
 var y=e.pageY-t.offsetTop
 if(y>200)
  if(x>100){
   t.width=t.width*1.2
   t.height=t.height*1.2}
  else{
   t.width=t.width/1.2
   t.height=t.height/1.2}
 else
  t.style.margin=(120-y)*t.width+'px 0 0'+(t.width/2-x)*t.width+'px'
 console.log(q+': '+x+' '+y)}"]
(map(fn[q](if(not(.startsWith q";"))(let[
 d(read-string(str"0x"q))
 p(filter(fn[i](.startsWith i(str d" ")))s)
 s(filter(fn[i](.startsWith i(str d" ")))n)]
 (if(and (not-empty p)(not-empty s)(not(.contains(first p)"  ")))
 (let[a(.split(first p)" ")
  bi(.indexOf(first s)" ")
  b(subs(first s)bi)
  h(read-string(str"0x"(get a 2)))
  w(read-string(str"0x"(get a 3)))
  e(java.net.URLEncoder/encode(.replaceAll b" ""_"))]
[:div{:style"width:200px;height:240px;overflow:hidden;float:left;text-align:center"}
 [:img{:id(str"i"q):width w :height h :title b :onclick(str"cl(event,'i"q"')")
  :src(str"https://upload.wikimedia.org/wikipedia/commons/thumb/"
   (subs (second a)0 1)"/"(second a)"/"(subs e 1)"/"w"px-"(subs e 1))}]])))))
 (.split"8dcf a5da 13ae4 14461 a3fc 364 2223 a326 a8ae 887f 7a2e 2e7f 2c5f 191c3 2c6d 2b47 2b43 2b60 2e32 1f4b 10b8a 2b7d 8c3c 7acf 10c7 2c62 2c5c 9b9d 13edb 223b ee74 1346b 16be 14941 12a4d 15644 2fa 11686 12e2a 12df0 eb12 178dc 12981 15cc 26b f532 12789 e9f4 12db2 190f0 16169 f12c 15d7a e526 6ac9 1695a 1308a 18d1 16d94 1310a 1639c fea8 1a064 1aa22 10bab 6abb 1660d 12bb8 1aca2 15819 1653d 11d0f 5c90 165ff 12815 10e1f ff4c 17618 123d5 12ed0 1632a fea3 133 150ea 2303 1a9f4 12b8c e07a 16d62 11ab1 11d35 198f0 12ec5 1aa23 edb6 11572 92f5 17d3c 117a8 e03b 23e7 16616 1035a 1a9d3 12787 12bc2 12a4b 163ce 16619 1905a fa10 15c26 187fa 50a 37c7 11d36 19475 9aaf 1277a 115c1 189aa 3a7 11d20 128db 2357 19ee0 12de8 b94a 1836f 165fe 12ade 1a086 17905 fec3 1a5ef 11422 118af 1a3f0 16609 164f4 18e82 2233 2b39 6839 165b2 13cea 12ffa 2e6c 1013d 1c76 1db4 fb77 176ee feba e560 fd05 7109 16605 19ad3 f175 ebf6 ef28 1885d 19803 139ed 184df e04c 13115 ef86 2351 1395e f669 19d35 eca6 100b8 37c8 18c57 adc1 179a8 12c94 167ac 17d0e 1645d 16d50 19906 11b5a 149fd 16904 13255 17b7f fe9f 12e31 2244 114a2 fec7 12e7c f144 e3d8 11680 2a3 1a32b 17630 1bbf 1a42 103fc 11761 12845 11d23 631 16320 226e dff7 b629 15784 37c6 153fe 1310f f135 4e2c 15166 15472 1594e 12ebe 118fe 12e04 19a75 f14e 11d25 114e4 e0d9 4e32 1063b 421c 165b1 1493c 12b14 7209 2e6f fb60 15d62 12224 1abdb 102ec 12ec6 f369 106b7 12da3 feb7 df9d 867e 16502 11b7d 196da ebed 1bb3 1a49b 19bc1 a20d df0f 1c5b 10748 feb5 17b79 1a32f 16602 4e2f 1629c 12df5 1d0 11d1b 1850c 77e5 9452 fe9a ee77 12a7a 12a5a 14c3d 17cf9 ea94 164fe 1a17e f60e 17d19 1827a a53b 163b9 161cc f137 1a03f e5ab 6aee 10ba9 2387 12b0c 12ebf 94c2 13112 12e01 12e0a f129 f13e 149b6 fc58 34c5 40c5 17f03 189d5 150cc f169 10bc3 10bb3 1251a ee6e 15bbf 6beb 18944 17f1f 11d19 155e3 14b52 15bda fead 1a6f4 1347c 62e6 12df1 11d1c 14992 f133 12ec8 134b8 164fa 7831 1894e ef27 b069 f13f 161cf 14948 188ae 1a084 12ebc 1158c 714a 12a84 1895d 184dc 1661a 12df8 17999 10c3e 10bc9 13507 10b08 ea7c 156b9 12b61 14b26 df8c fe98 1639b febe 12df7 12d93 17840 14b12 1775e f134 a2d8 13cba 4472 feaa 1569b 69c1 19ba8 11fd5 13138 134de 13002 19334 e0dc fe9c b8b5 15d37 13119 18e92 1aa09 1931b 19c61 176d7 1a445 19976 e5b9 130d9 e4da 132d3 eddf 133ea 1aa0a 15042 11ef5 16610 17b82 19335 15bce 114f9 f13c 11d0c a271 10ba7 10bc7 11fc3 11691 18cc2 df9e 119a8 ed05 1339f 16082 1942c 1353b 130aa f149 50f4 33b5 17f84 12850 12d16 df07 da24 10ba2 1986c 10bb5 f184 11d27 dfa0 159d3 1a848 83e0 17760 175b1 ff34 df39 1aa0c 10bc1 10495 1326d 19827 18d38 11b97 f33f 14d14 12a3a 168a9 f146 14b31 10bbe e57e 17985 188af 11d29 12ed3 12ec0 155fe 5886 e5c0 f124 19319 11870 15bde 14a48 14903 fea5 df18 14a4a 1930d 11d37 f143 15bef 15e61 160ca 119b5 19ba7 1bbb fe9d 11d16 1305e 16d0a e662 1507d 1931f 14944 2465 1660f 19316 13549 11d2d 14a80 1660e 4a73 10baf 16747 1690a 1980d 17ef8 16210 15b9e 134e6 1bad 11575 ff42 11747 15747 154f4 11d32 b02b feb2 19a2d 155cb 11d13 23aa 132f4 144db ee76 16618 129bc 19330 17ee9 15445 18958 24af 1a08b b039 1198a 168d9 14e9c 15100 12aba 1310c ee73 13365 f952 10bca 17ebd 17ef6 14583 15253 170c4 fdcf fec5 11d14 165f5 b2dd 1744c 1aa06 32c6 6aed 13270 10e4b 18d75 12ecf 19745 16e82 ee6d fec0 f119 16f3e dfc3 12ecd 19338 f148 16604 106f5 fea1 1ab4b 110e0 165f3 169c3 10bc6 1505d feb1 16f55 168ff 15bf3 11d12 7e8f 9fc8 16dfa 16f4c 15036 165fa 16b16 17ffc 10bad 13105 b978 1a07e f141 164f1 19cad 162b0 13072 16a45 1661b 16b4a 442f 18e83 18f19 16aa7 157e9 11d24 fbff 10b99 f1bd 16601 869a 1aa15 12ec2 106dd 160c8 115f3 16600 160a9 feaf 12ecb a1ae e534 13116 1931e 1288f 2d79 17eef 11d34 15571 1281f 16669 14b1a 13107 1310d 17d67 18f1f 168f6 19bd7 1a09d 1198e ec56 c7a5 b0f9 1770d f162 4a77 16a65 16bce 18302 126a3 1a6db 10ba0 10bcf 14b25 1a3b1 13108 16b95 1c53 16607 10bb8 10b9b f589 16b4d 117d1 1aa10 f2d4 169cb 1764d 11d26 11d22 16b00 16a58 16b57 1a39e 26e6 16a26 2ddc 15c2d f59d 164e3 19bc2 169d5 9d61 16a5f 4470 10bbb 19d6c 16b0b 16b46 1acd0 c05d 16b28 15602 ca39 f58d 193c9 16617 11ff1 133a 169b4 16b67 16ac4 15f17 cd4f 15a2c 174c0 16a00 16ae7 16ac5 406c 15c03 10bfc 16a73 18d6c 16a4a 2ca4 15d0a 169d8 63ee 16ad2 15bf7 1a734 70e4 f12f 16a48 1a085 12139 164ee 17989 17ef4 130d7 19320 15bdf 16a43 164f9 f139 17e20 1799a 3798 19307 10682 12d55 fe3a feb9 169d4 1ad1e 19bb2 18075 16b25 2d4c 1240d 11d31 16b17 1310b 216c 321e 16b36 13aa9 18420 16b97 169c1 159a5 17bbd 12a14 131a3 161f2 16ad1 16b93 16b7f c29f 326a 2d42 a93b 16a6e 15047 18990 1311a 2d46 16ac2 69fe 7e52 1995b 169c4 1aa35 1a08a 16613 1644c 154cb febc 165f8 14d9c 2d6c 6b23 10bbd feac 16ac3 14e0a 16614 11d2e 16aee 17de6 4431 16a19 1a7ab 19b49 1a88f 18517 161ec 16a1f 17f01 69e9 16612 17a35 19bd6 11e2e 16ac7 f596 162de 16880 16b22 984b 18947 1a07f 6af0 205f 169c5 1554b 194f5 16b6c 14eef 161d0 4532 151b9 63fb 16b1f 96ec 15190 e038 1ab3b 13482 159e3 16b4c 153db 169f0 16a44 19a7e 16adb 403d 1a348 10239 406e 15e21 15ae0 165f6 15d13 18ded 11fde 16ab1 16b72 16aab 16b35 16add 16a9e 64d9 13117 176f5 1a07c 16ae2 169de 1323f 1ab40 16a4f 16086 193b8 15587 16b26 16a17 1324e 13246 17d7b 1a838 18164 15a0b 169df 16b9f 1a7a3 16a12 1687c 15586 164f8 169fe 16aad 125be 1a34f 2dea 17556 15d01 7ea0 16aeb 16b85 16ad4 e12b 1653c 11f71 16bd0 2d6a 16b6a 3712 196ed 19539 16a20 15ce8 16b81 197e1 ae66 2df6 12d51 16bb0 16b98 1a0df 16a90 ea8b 15a32 69c0 16aff 16575 1a797 12ec3 16b1d 2cdf 16514 73e0 179a0 16ac8 16a1e 3ab6 169fd 165f7 2d59 5ebb 15bc1 16a38 16aa3 16a91 16ac6 16aa8 16a54 19463 1886e 16b23 11d28 165fb 16766 16b5b 11abe 169f7 175d9 16aa9 16461 1559b 1660b 16b65 16a79 1aaf1 9de2 257a 16b96 15583 16aba 15640 16ac1 16b55 13fdf 155b0 16b71 15cf4 1a078 3239 17fc4 17ef2 168ca"" "))
[:script"for(var q in wd){
 d=document.getElementById('r'+q)
 if(d){
  d.title=wd[q]//+'n'+q
  d.alt=wd[q]}}"]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]]))))