(fn[rq rs](let[c(.getAttribute rq"c")v(.getAttribute rq"vars")t"AlphaHistory"
s(.split(slurp"picSize.txt")"\n")
n(.split(slurp"picName.txt")"\n")]
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
 console.log(q+': '+x+' '+y)}"]
(map(fn[q](if(not(.startsWith q";"))(let[
 d(read-string(str"0x"q))
 p(filter(fn[i](.startsWith i(str d" ")))s)
 s(filter(fn[i](.startsWith i(str"Q"d" ")))n)]
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
 (.split"5f3 5f6 ;5f8 5fc 391 35b 364 605 418 576 27b 57d 7f7 57f 583 806 586 58b 581 589 590 588 585 832 58d 58f 591 871 593 595 596 59c 599 5a0 5a2 6f6 59a 6d8 705 6f1 70d 5a6 70b 726 6e2 719 6e9 714 2d0 161 15a 42b 579 57a 346 6fa 351 2fa 6fc 6ff 577 706 26b 5d8 24e 12d 2b4 133 129 2eb 2af 50a 4a8 2e6 3a7 261 53c 479 53b 1f2 413 22f 1c0 232 17 635 2a8 fe 205 ff 2a3 1f6 428 535 532 534 631 533 104 3ab 531 407 52f 217 47f 28b 21b 40b 5b 530 4f4 5e7 1f5 1d0 3df 4c1 211 52c 52e 52b 50e 1f8 52a 128 2ff 2f3 528 526 512 5e8 527 514 844 1ed 359 5dc 57b 375 74c 41b 350 608 3e9 572 659 39e 4da 49a 243 4dd 5df 357 34d 3a9 3d8 179 389 4d9 110 334 372 160 417 3a2 7fa 4d8 343 37c 240 420 4f7 4d1 869 5be 4d6 32f 52d 278 38d 4fb 6f3 652 662 17b 65c 4f3 7f8 3b5 1b8 7e6 4d3 4f0 5d0 1db 815 889 170 65f 7f6 6e8 5b7 47d 826 4cc 14f 4ec 4eb 3dd 4c8 162 3e5 1c1 4e9 6ef 666 6f9 4c4 84c 2fd 84d 39f 6a2 4ce 7d1 682 838 8cc 70c 64f 355 839 5c8 667 4fc 19a 12f 66e 863 398 524 200 14b 4e6 563 894 233 35e 4b3 188 25f 146 5ea 1bc 4e5 88e 199 279 817 cf 464 22d 565 197 369 4c9 132 2ca 422 7a3 70a 2a 6b4 609 237 9d 149 50 1e9 212 525 3b2 27c 6d0 ce 5b8 6fe 25b 4c 7aa 7c0 7ef 7a6 72f 7c7 b5 c0 79e 573 756 22e b9 757 7d6 168 831 87c 75b 72b 7a4 22b 258 190 ba 6f8 7c9 270 7da 3ff 6d9 791 69a 6e0 851 6cf 799 793 32e 6f0 78e 78f 6f7 782 779 6b5 796 695 78d 77c 786 592 790 6db 78b 674 6f2 6a9 77d 68d 6a8 792 687 77e 798 701 25d 644 69b 684 77f 6c0 6e6 6eb 68f 784 693 789 774 77b 5aa 6a3 794 775 776 6c4 797 4a5 6ce 777 6d1 773 68a 788 685 781 783 267 780 704 6ca 778 787 6fd 6d3 681 691 679 67b 6a6 818 5ad 676 688 673 697 6d7 785 6de 6c8 6d6 6b0 6cb 6ac 677 6fb 347 75d 678 766 67c 67e 439"" "))
[:script"for(var q in wd){
 d=document.getElementById('r'+q)
 if(d){
  d.title=wd[q]//+'n'+q
  d.alt=wd[q]}}"]
[:footer"An "[:a{:href"https://dresdenlabs.appspot.com/"}"AlphaLabs"]" production. Images from "[:a{:href"https://dresdenlabs.appspot.com/iw/WikiPedia/Wikidata"}"WikiData"]"."]]]))))