(ns wd(:require[clojure.data.json :as json]))
(apply str(map(fn[r](let[
 s(slurp(str"q/"r".json"))]
;  s(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/"r".json"))]
(str " "r" "(.replaceAll(:value(:en(:labels((keyword r)(:entities
 (json/read-str s :key-fn keyword)))))) " """))))
 (.split"Q7747 Q76 Q937 Q7200 Q6294 Q352 Q8016 Q12823 Q5879 Q8704 Q8023 Q7243 Q991 Q5152 Q255 Q692 Q254 Q1339 Q9682 Q855 Q5383 Q762 Q11571 Q5592 Q567 Q23 Q882 Q517 Q1035 Q1394 Q1001 Q5582 Q935 Q7416 Q2831 Q13909 Q42 Q535 Q9047 Q8877 Q8873 Q9215 Q5685 Q9696 Q307 Q3044 Q989 Q9358 Q5593 Q7186 Q91 Q9960"" ")))
;(.split "Q12149 Q12154 Q12160 Q12304 Q12306 Q12310 Q12312 Q12320 Q12325 Q12332 Q12341 Q12349 Q12382 Q12456 Q12473 Q12476 Q12484 Q12488 Q12492 Q12498 Q12499 Q12500 Q12504 Q12509 Q12571 Q12591 Q12608 Q12610 Q12614 Q12622 Q12628 Q12637 Q12658 Q12665 Q12674 Q12680 Q12688 Q12696 Q12702 Q12706 Q12712 Q12718 Q12735 Q12737 Q12742 Q12744 Q12747 Q12749 Q12750 Q12754 Q12756 Q12759 Q12763 Q12764 Q12769 Q12773 Q12777 Q12780 Q12785 Q12795 Q12801 Q12807 Q12811 Q12817 Q12819 Q12823 Q12827 Q12830 Q12833 Q12836 Q12839 Q12844 Q12847 Q12849 Q12854 Q12857 Q12860 Q12862 Q12865 Q12869 Q12871 Q12878 Q12881 Q12883 Q12889 Q12890 Q12897 Q12898 Q12903 Q12904 Q12905 Q12906 Q12907 Q12908 Q12909 Q12911 Q12912 Q12913 Q12914 Q12915 Q12917 Q12921 Q12922 Q12923 Q12924 Q12925 Q12926 Q12927 Q12928 Q12929 Q12930 Q12931 Q12932 Q12934 Q12935 Q12936 Q12937 Q12938 Q12939 Q12940 Q12941 Q12942 Q12943 Q12944 Q12945 Q12946 Q12947 Q12948 Q12949 Q12950 Q12951 Q12952 Q12953 Q12954 Q12955 Q12956 Q12957 Q12959 Q12960 Q12961 Q12963 Q12964 Q12967 Q12969 Q12971 Q12972 Q12973 Q12974 Q12976 Q12978 Q12981 Q12983 Q12984 Q12998 Q12999 Q13000 Q13001 Q13002 Q13003 Q13005 Q13007 Q13009 Q13012 Q13014 Q13017 Q13019 Q13020 Q13021 Q13054 Q13055 Q13057 Q13132 Q13133 Q13183 Q13185 Q13230 Q13234 Q13236 Q13237 Q13240 Q13242 Q13245 Q13247 Q13304 Q13306 Q13308 Q13309 Q13374 Q13382 Q13384 Q13387 Q13388 Q13390 Q13407 Q13478 Q13479 Q13480 Q13481 Q13482 Q13483 Q13484 Q13485 Q13487 Q13488 Q13494 Q13501 Q13509 Q13513 Q13515 Q13524 Q13526 Q13529 Q13530 Q13531 Q13532 Q13533 Q13534 Q13535 Q13536 Q13538 Q13539 Q13540 Q13541 Q13542 Q13543 Q13544 Q13545 Q13546 Q13547 Q13548 Q13549 Q13550 Q13551 Q13552 Q13553 Q13554 Q13555 Q13556 Q13557 Q13558 Q13559 Q13560 Q13561 Q13562 Q13563 Q13575 Q13651 Q13702 Q13842 Q13888 Q13894 Q13898 Q13909 Q13914 Q13938 Q13982 Q14010 Q14027 Q14039 Q14042 Q14043 Q14045 Q14049 Q14051 Q14060 Q14063 Q14073 Q14077 Q14078 Q14086 Q14089 Q14095 Q14096 Q14097 Q14098 Q14099 Q14100 Q14101 Q14102 Q14104 Q14105 Q14106 Q14107 Q14108 Q14109 Q14110 Q14111 Q14113 Q14120 Q14135 Q14210 Q14218 Q14220 Q14223 Q14227 Q14232 Q14234 Q14237 Q14239 Q14241 Q14243 Q14250 Q14252 Q14254 Q14257 Q14260 Q14261 Q14263 Q14264 Q14277 Q14278 Q14279 Q14280 Q14281 Q14282 Q14283 Q14286 Q14292 Q14304 Q14306 Q14307 Q14313 Q14321 Q14341 Q14342 Q14345 Q14356 Q14362 Q14421 Q14430 Q14439 Q14441 Q14446 Q14450 Q14451 Q14517 Q14524 Q14535 Q14536 Q14537 Q14538 Q14539 Q14540 Q14541 Q14542 Q14655 Q14678 Q14691 Q14692 Q14693 Q14694 Q14695 Q14696 Q14697 Q14698 Q14699 Q14700 Q14701 Q14702 Q14703 Q14704 Q14705 Q14706 Q14707 Q14708 Q14711 Q14715 Q14718 Q14719 Q14720 Q14721 Q14722 Q14723 Q14724 Q14725 Q14726 Q14727 Q14728 Q14729 Q14730 Q14731 Q14732 Q14733 Q14734 Q14735 Q14736 Q14737 Q14738 Q14739 Q14740 Q14741 Q14742 Q14743 Q14744 Q14747 Q14837 Q14962 Q14972 Q14974 Q14980 Q14989 Q14990 Q14991 Q14992 Q14993 Q14994 Q14995 Q14996 Q14997 Q14998 Q14999 Q15001 Q15002 Q15020 Q15023 Q15024 Q15025 Q15027 Q15029 Q15030 Q15031 Q15036 Q15048 Q15056 Q15077 Q15079 Q15145 Q15147 Q15149 Q15153 Q15156 Q15189 Q15193 Q15199 Q15208 Q15223 Q15253 Q15257 Q15269 Q15280 Q15313 Q15387 Q15396 Q15405 Q15410 Q15414 Q15417 Q15426 Q15435 Q15443 Q15451 Q15462 Q15466 Q15467 Q15469 Q15472 Q15474 Q15480 Q15482 Q15505 Q15510 Q15512 Q15516 Q15526 Q15530 Q15532 Q15542 Q15546 Q15547 Q15563 Q15567 Q15571 Q15572 Q15573 Q15615 Q15717 Q15723 Q15737 Q15738 Q15739 Q15740 Q15741 Q15742 Q15743 Q15744 Q15745 Q15746 Q15747 Q15748 Q15749 Q15750 Q15751 Q15752 Q15753 Q15756 Q15769 Q15772 Q15773 Q15780 Q15784 Q15790 Q15792 Q15794 Q15795 Q15796 Q15798 Q15800 Q15802 Q15803 Q15806 Q15809 Q15849 Q15850 Q15852 Q15859 Q15866 Q15869 Q15873 Q15880 Q15897 Q15902 Q15904 Q15909 Q15935 Q15944 Q15948 Q15953 Q15956 Q15969 Q15975 Q15981 Q15983 Q15985 Q15988 Q15990 Q15991 Q15992 Q15993 Q15994 Q15995 Q15996 Q15997 Q15998 Q15999 Q16001 Q16002 Q16004 Q16009 Q16019 Q16053 Q16057 Q16118 Q16182 Q16285 Q16296 Q16297 Q16319 Q16345 Q16349 Q16371 Q16372 Q16376 Q16378 Q16379 Q16381 Q16382 Q16383" " ")))

;  (.split "Q4061 Q4064 Q4070 Q4109 Q4119 Q4124 Q4128 Q4137 Q4142 Q4145 Q4153 Q4189 Q4199 Q4203 Q4212 Q4214 Q4223 Q4227 Q4232 Q4235 Q4237 Q4240 Q4245 Q4247 Q4261 Q4267 Q4270 Q4271 Q4273 Q4276 Q4279 Q4281 Q4285 Q4288 Q4289 Q4291 Q4293 Q4295 Q4298 Q4302 Q4313 Q4318 Q4323 Q4328 Q4330 Q4332 Q4337 Q4340 Q4344 Q4349 Q4350 Q4381 Q4395 Q4408 Q4413 Q4414 Q4440 Q4441 Q4443 Q4448 Q4452 Q4457 Q4461 Q4462 Q4465 Q4473 Q4487 Q4488 Q4489 Q4490 Q4491 Q4496 Q4498 Q4500 Q4501 Q4505 Q4506 Q4509 Q4510 Q4517 Q4518 Q4538 Q4547 Q4573 Q4578 Q4581 Q4583 Q4586 Q4590 Q4593 Q4599 Q4604 Q4605 Q4612 Q4616 Q4617 Q4622 Q4631 Q4636 Q4652 Q4671 Q4673 Q4689 Q4690 Q4691 Q4695 Q4700 Q4701 Q4715 Q4723 Q4724 Q4725 Q4731 Q4732 Q4735 Q4737 Q4738 Q4740 Q4742 Q4749 Q4752 Q4757 Q4761 Q4762 Q4768 Q4769 Q4770 Q4774 Q4783 Q4786 Q4790 Q4805 Q4806 Q4807 Q4813 Q4826 Q4832 Q4833 Q4835 Q4836 Q4837 Q4864 Q4866 Q4876 Q4881 Q4883 Q4889 Q4891 Q4896 Q4899 Q4914 Q4922 Q4924 Q4926 Q4931 Q4933 Q4934 Q4960 Q4985 Q4989 Q4991 Q4992 Q4993 Q4997 Q5000 Q5005 Q5007 Q5009 Q5015 Q5024 Q5028 Q5031 Q5040 Q5060 Q5069 Q5070 Q5071 Q5072 Q5073 Q5074 Q5076 Q5080 Q5081 Q5104 Q5105 Q5117 Q5152 Q5167 Q5169 Q5170 Q5172 Q5197 Q5198 Q5199 Q5201 Q5208 Q5220 Q5233 Q5236 Q5252 Q5254 Q5258 Q5260 Q5264 Q5269 Q5271 Q5280 Q5284 Q5327 Q5331 Q5333 Q5335 Q5336 Q5344 Q5345 Q5346 Q5347 Q5348 Q5349 Q5350 Q5351 Q5352 Q5353 Q5354 Q5355 Q5356 Q5359 Q5360 Q5361 Q5362 Q5363 Q5364 Q5365 Q5368 Q5370 Q5371 Q5376 Q5380 Q5382 Q5383 Q5391 Q5396 Q5404 Q5409 Q5432 Q5442 Q5443 Q5444 Q5447 Q5450 Q5454 Q5458 Q5479 Q5547 Q5553 Q5558 Q5571 Q5577 Q5580 Q5581 Q5582 Q5585 Q5586 Q5587 Q5588 Q5589 Q5591 Q5592 Q5593 Q5594 Q5597 Q5598 Q5599 Q5600 Q5603 Q5604 Q5608 Q5617 Q5618 Q5621 Q5623 Q5626 Q5630 Q5631 Q5648 Q5649 Q5650 Q5651 Q5652 Q5656 Q5658 Q5659 Q5661 Q5664 Q5669 Q5670 Q5673 Q5676 Q5679 Q5681 Q5682 Q5683 Q5685 Q5686 Q5721 Q5738 Q5749 Q5752 Q5793 Q5795 Q5796 Q5799 Q5803 Q5805 Q5807 Q5809 Q5811 Q5812 Q5816 Q5819 Q5820 Q5821 Q5822 Q5827 Q5829 Q5834 Q5844 Q5865 Q5877 Q5878 Q5879 Q5912 Q5921 Q5928 Q5950 Q5959 Q5969 Q5977 Q5998 Q6003 Q6008 Q6013 Q6017 Q6021 Q6026 Q6030 Q6033 Q6050 Q6060 Q6078 Q6079 Q6086 Q6091 Q6096 Q6100 Q6101 Q6105 Q6107 Q6184 Q6195 Q6197 Q6198 Q6215 Q6240 Q6242 Q6260 Q6270 Q6279 Q6281 Q6294 Q6297 Q6300 Q6304 Q6310 Q6312 Q6319 Q6324 Q6332 Q6338 Q6348 Q6351 Q6353 Q6357 Q6363 Q6367 Q6370 Q6379 Q6386 Q6391 Q6395 Q6399 Q6404 Q6419 Q6427 Q6432 Q6473 Q6512 Q6515 Q6519 Q6527 Q6530 Q6538 Q6541 Q6682 Q6691 Q6694 Q6701 Q6711 Q6714 Q6722 Q6733 Q6817 Q6882 Q6950 Q6969 Q7011 Q7013 Q7031 Q7060 Q7068 Q7071 Q7085 Q7091 Q7099 Q7103 Q7104 Q7122 Q7129 Q7161 Q7170 Q7176 Q7177 Q7186 Q7192 Q7195 Q7196 Q7197 Q7198 Q7199 Q7200 Q7201 Q7203 Q7207 Q7210 Q7212 Q7214 Q7217 Q7220 Q7221 Q7222 Q7223 Q7224 Q7225 Q7226 Q7227 Q7228 Q7229 Q7230 Q7231 Q7232 Q7234 Q7235 Q7236 Q7237 Q7241 Q7243 Q7244 Q7245 Q7247 Q7249 Q7250 Q7251 Q7255 Q7259 Q7262 Q7265 Q7267 Q7268 Q7271 Q7273 Q7276 Q7277 Q7280 Q7282 Q7285 Q7286 Q7287 Q7288 Q7289 Q7290 Q7292 Q7293 Q7294 Q7297 Q7298 Q7299 Q7300 Q7301 Q7302 Q7304 Q7306 Q7309 Q7311 Q7312 Q7314 Q7315 Q7316 Q7317 Q7321 Q7322 Q7324 Q7326 Q7327 Q7328 Q7331 Q7333 Q7335 Q7336 Q7337 Q7339 Q7345 Q7346 Q7349 Q7351 Q7356 Q7357 Q7360 Q7361 Q7371 Q7374 Q7382 Q7392 Q7393 Q7394 Q7395 Q7396 Q7398 Q7399 Q7400 Q7402 Q7403 Q7404 Q7406 Q7407 Q7409 Q7410 Q7412 Q7415 Q7416 Q7417 Q7418 Q7419 Q7420 Q7421 Q7422 Q7423 Q7424 Q7426 Q7429 Q7431 Q7433 Q7435 Q7437 Q7438 Q7439 Q7440 Q7441 Q7442 Q7443 Q7444 Q7445 Q7446 Q7447 Q7448 Q7449 Q7450 Q7451 Q7452 Q7453 Q7454 Q7456 Q7457 Q7458 Q7459 Q7460 Q7463 Q7465 Q7468 Q7470 Q7471 Q7472 Q7473 Q7474 Q7475 Q7476 Q7477 Q7478 Q7479 Q7480 Q7481 Q7482 Q7483 Q7484 Q7485 Q7486 Q7487 Q7488 Q7489 Q7490 Q7491 Q7492 Q7493 Q7494 Q7496 Q7497 Q7498 Q7499 Q7500 Q7501 Q7503 Q7504 Q7506 Q7508 Q7509 Q7510 Q7511 Q7513 Q7514 Q7515 Q7516 Q7517 Q7518 Q7519 Q7520 Q7521 Q7522 Q7523 Q7524 Q7526 Q7531 Q7532 Q7534 Q7536 Q7538 Q7539 Q7541 Q7542 Q7543 Q7545 Q7546 Q7549 Q7552 Q7554 Q7555 Q7557 Q7558 Q7562 Q7563 Q7567 Q7571 Q7604 Q7637 Q7658 Q7667 Q7711 Q7721 Q7723 Q7724 Q7726 Q7728 Q7729 Q7731 Q7732 Q7738 Q7742 Q7747 Q7750 Q7751 Q7758 Q7767 Q7770 Q7771 Q7780 Q7789 Q7793 Q7799 Q7803 Q7814 Q7824 Q7833 Q7836 Q7841 Q7855 Q7934 Q7981 Q7995 Q7996 Q7999 Q8003 Q8005 Q8006 Q8007 Q8011 Q8015 Q8016 Q8018 Q8023 Q8027 Q8045 Q8048 Q8053 Q8056 Q8058 Q8159 Q8160 Q8219 Q8237 Q8262 Q8270 Q8284 Q8286 Q8287 Q8289 Q8293 Q8296 Q8298 Q8301 Q8312 Q8318 Q8339 Q8342 Q8346 Q8349 Q8351 Q8354 Q8367 Q8372 Q8384 Q8404 Q8409 Q8413 Q8423 Q8433 Q8440 Q8442 Q8446 Q8453 Q8457 Q8459 Q8462 Q8467 Q8468 Q8474 Q8479 Q8506 Q8511 Q8512 Q8516 Q8521 Q8532 Q8537 Q8540 Q8549 Q8556 Q8560 Q8570 Q8573 Q8581 Q8586 Q8589 Q8597 Q8599 Q8605 Q8612 Q8619 Q8620 Q8644 Q8651 Q8653 Q8655 Q8659 Q8662 Q8664 Q8666 Q8677 Q8704 Q8728 Q8739 Q8741 Q8743 Q8747 Q8750 Q8753 Q8755 Q8763 Q8768 Q8772 Q8776 Q8778 Q8781 Q8796 Q8797 Q8800 Q8808 Q8809 Q8814 Q8816 Q8817 Q8820 Q8824 Q8825 Q8827 Q8833 Q8863 Q8867 Q8873 Q8876 Q8877 Q8884 Q8902 Q8916 Q8927 Q8937 Q8948 Q8958 Q8962 Q8963 Q8985 Q8998 Q9021 Q9036 Q9038 Q9041 Q9045 Q9047 Q9049 Q9061 Q9066 Q9068 Q9075 Q9079 Q9082 Q9086 Q9090 Q9094 Q9095 Q9096 Q9099 Q9100 Q9104 Q9106 Q9107 Q9112 Q9115 Q9119 Q9123 Q9124 Q9126 Q9130 Q9132 Q9138 Q9140 Q9146 Q9150 Q9154 Q9157 Q9161 Q9162 Q9171 Q9191 Q9200 Q9204 Q9215 Q9218 Q9222 Q9226 Q9235 Q9236 Q9243 Q9247 Q9250 Q9257 Q9263 Q9281 Q9293 Q9294 Q9295 Q9304 Q9308 Q9312 Q9317 Q9319 Q9324 Q9327 Q9329 Q9333 Q9335 Q9339 Q9341 Q9342 Q9345 Q9348 Q9353 Q9354 Q9358 Q9364 Q9379 Q9381 Q9387 Q9391 Q9397 Q9399 Q9424 Q9434 Q9438 Q9439 Q9440 Q9441 Q9446 Q9455 Q9457 Q9458 Q9475 Q9486 Q9488 Q9509 Q9513 Q9535 Q9537 Q9543 Q9545 Q9546 Q9550 Q9554 Q9557 Q9559 Q9570 Q9575 Q9576 Q9577 Q9582 Q9586 Q9588 Q9594 Q9599 Q9602 Q9605 Q9608 Q9640 Q9670 Q9671 Q9673 Q9675 Q9682 Q9685 Q9695 Q9696 Q9700 Q9701 Q9703 Q9711 Q9717 Q9722 Q9726 Q9738 Q9743 Q9746 Q9749 Q9753 Q9755 Q9760 Q9761 Q9763 Q9776 Q9790 Q9801 Q9825 Q9886 Q9889 Q9891 Q9892 Q9895 Q9912 Q9916 Q9931 Q9957 Q9958 Q9960 Q9961 Q9965 Q9972 Q9977 Q9983 Q9988 Q9991 Q9994 Q10004 Q10007 Q10011 Q10058 Q10059 Q10061 Q10062 Q10065 Q10066 Q10068 Q10069 Q10070 Q10085 Q10088 Q10089 Q10091 Q10092 Q10093 Q10095 Q10101 Q10105 Q10106 Q10108 Q10110 Q10112 Q10115 Q10117 Q10118 Q10120 Q10125 Q10129 Q10131 Q10132 Q10133 Q10218 Q10233 Q10240 Q10261 Q10270 Q10287 Q10390 Q10411 Q10479 Q10490 Q10494 Q10501 Q10505 Q10510 Q10514 Q10520 Q10524 Q10531 Q10536 Q10543 Q10548 Q10552 Q10556 Q10560 Q10569 Q10572 Q10577 Q10581 Q10585 Q10588 Q10590 Q10592 Q10594 Q10598 Q10599 Q10600 Q10601 Q10602 Q10603 Q10606 Q10611 Q10628 Q10633 Q10645 Q10648 Q10652 Q10664 Q10665 Q10666 Q10667 Q10668 Q10678 Q10679 Q10681 Q10685 Q10689 Q10694 Q10695 Q10696 Q10701 Q10707 Q10709 Q10711 Q10715 Q10716 Q10718 Q10720 Q10721 Q10723 Q10724 Q10725 Q10726 Q10727 Q10729 Q10730 Q10731 Q10732 Q10733 Q10735 Q10736 Q10738 Q10754 Q10758 Q10761 Q10764 Q10767 Q10772 Q10781 Q10785 Q10788 Q10792 Q10796 Q10819 Q10837 Q10845 Q10857 Q10860 Q10861 Q10864 Q10865 Q10868 Q10869 Q10871 Q10873 Q10875 Q10878 Q10879 Q10881 Q10883 Q10885 Q10889 Q10896 Q10902 Q10905 Q10911 Q10914 Q10916 Q10917 Q10918 Q10937 Q10942 Q10947 Q10953 Q10955 Q10959 Q10993 Q10994 Q11031 Q11065 Q11075 Q11079 Q11093 Q11100 Q11104 Q11105 Q11107 Q11109 Q11116 Q11124 Q11132 Q11133 Q11138 Q11142 Q11153 Q11156 Q11171 Q11172 Q11187 Q11192 Q11237 Q11239 Q11256 Q11270 Q11284 Q11300 Q11305 Q11313 Q11318 Q11319 Q11321 Q11322 Q11328 Q11330 Q11333 Q11335 Q11338 Q11356 Q11359 Q11362 Q11373 Q11428 Q11431 Q11433 Q11440 Q11458 Q11459 Q11470 Q11481 Q11483 Q11484 Q11485 Q11486 Q11487 Q11488 Q11489 Q11490 Q11493 Q11497 Q11504 Q11509 Q11512 Q11513 Q11515 Q11522 Q11529 Q11542 Q11569 Q11571 Q11576 Q11578 Q11580 Q11581 Q11583 Q11584 Q11586 Q11588 Q11589 Q11590 Q11594 Q11595 Q11596 Q11600 Q11603 Q11604 Q11605 Q11607 Q11608 Q11609 Q11612 Q11613 Q11614 Q11615 Q11617 Q11619 Q11620 Q11623 Q11624 Q11625 Q11626 Q11627 Q11628 Q11630 Q11636 Q11637 Q11638 Q11641 Q11644 Q11645 Q11648 Q11657 Q11659 Q11662 Q11664 Q11665 Q11666 Q11667 Q11668 Q11669 Q11670 Q11671 Q11672 Q11673 Q11674 Q11675 Q11676 Q11677 Q11680 Q11682 Q11685 Q11688 Q11689 Q11697 Q11702 Q11715 Q11722 Q11726 Q11730 Q11732 Q11734 Q11735 Q11740 Q11742 Q11743 Q11745 Q11748 Q11749 Q11752 Q11753 Q11754 Q11755 Q11757 Q11758 Q11760 Q11762 Q11763 Q11766 Q11770 Q11771 Q11773 Q11775 Q11777 Q11778 Q11779 Q11782 Q11793 Q11806 Q11812 Q11813 Q11815 Q11816 Q11817 Q11820 Q11821 Q11823 Q11826 Q11828 Q11830 Q11833 Q11835 Q11840 Q11842 Q11847 Q11860 Q11863 Q11869 Q11873 Q11875 Q11877 Q11878 Q11879 Q11881 Q11884 Q11885 Q11887 Q11891 Q11893 Q11896 Q11900 Q11901 Q11903 Q11907 Q11924 Q11926 Q11930 Q11931 Q11941 Q11944 Q11946 Q11948 Q11949 Q11950 Q11951 Q11952 Q11954 Q11956 Q11957 Q11958 Q11960 Q11964 Q11966 Q11970 Q11973 Q11975 Q11976 Q11987 Q11992 Q11996 Q11998 Q12000 Q12002 Q12003 Q12005 Q12006 Q12007 Q12010 Q12012 Q12015 Q12054 Q12060 Q12065 Q12070 Q12073 Q12074 Q12077 Q12082 Q12085 Q12086 Q12087 Q12089 Q12091 Q12092 Q12096 Q12105 Q12109 Q12113 Q12149 Q12154 Q12160" " ")))
  ;  (.split "Q23 Q42 Q76 Q80 Q91 Q157 Q181 Q185 Q186 Q192 Q206 Q207 Q254 Q255 Q260 Q272 Q296 Q297 Q301 Q303 Q306 Q307 Q326 Q329 Q331 Q335 Q346 Q352 Q353 Q354 Q360 Q368 Q377 Q379 Q392 Q400 Q407 Q409 Q410 Q440 Q444 Q448 Q449 Q464 Q475 Q489 Q493 Q498 Q501 Q502 Q504 Q512 Q517 Q529 Q530 Q535 Q539 Q555 Q557 Q558 Q559 Q562 Q563 Q567 Q576 Q579 Q590 Q600 Q603 Q605 Q607 Q609 Q615 Q619 Q624 Q632 Q633 Q635 Q636 Q651 Q675 Q680 Q687 Q692 Q714 Q720 Q742 Q747 Q755 Q762 Q765 Q767 Q814 Q815 Q820 Q835 Q838 Q839 Q845 Q848 Q849 Q853 Q855 Q857 Q859 Q862 Q868 Q873 Q882 Q885 Q892 Q905 Q909 Q913 Q920 Q926 Q927 Q930 Q935 Q937 Q939 Q946 Q949 Q984 Q989 Q991 Q997 Q1001 Q1023 Q1031 Q1035 Q1043 Q1047 Q1048 Q1051 Q1056 Q1058 Q1064 Q1067 Q1081 Q1124 Q1145 Q1149 Q1151 Q1178 Q1189 Q1192 Q1203 Q1217 Q1220 Q1224 Q1225 Q1228 Q1230 Q1233 Q1235 Q1238 Q1240 Q1241 Q1242 Q1245 Q1253 Q1254 Q1257 Q1259 Q1260 Q1264 Q1267 Q1268 Q1271 Q1275 Q1276 Q1290 Q1294 Q1298 Q1300 Q1316 Q1317 Q1318 Q1319 Q1320 Q1322 Q1323 Q1324 Q1325 Q1326 Q1327 Q1328 Q1329 Q1330 Q1331 Q1332 Q1333 Q1339 Q1340 Q1379 Q1381 Q1394 Q1395 Q1398 Q1399 Q1401 Q1402 Q1403 Q1405 Q1407 Q1409 Q1411 Q1413 Q1414 Q1416 Q1417 Q1419 Q1421 Q1423 Q1424 Q1425 Q1426 Q1427 Q1429 Q1430 Q1433 Q1434 Q1436 Q1440 Q1442 Q1446 Q1450 Q1453 Q1463 Q1464 Q1470 Q1480 Q1488 Q1496 Q1500 Q1503 Q1511 Q1512 Q1514 Q1523 Q1526 Q1528 Q1532 Q1541 Q1544 Q1545 Q1585 Q1589 Q1604 Q1615 Q1618 Q1625 Q1628 Q1631 Q1634 Q1638 Q1639 Q1646 Q1651 Q1652 Q1654 Q1655 Q1656 Q1657 Q1659 Q1660 Q1662 Q1665 Q1666 Q1668 Q1669 Q1671 Q1672 Q1674 Q1677 Q1679 Q1681 Q1683 Q1685 Q1687 Q1690 Q1691 Q1698 Q1699 Q1702 Q1704 Q1705 Q1708 Q1712 Q1716 Q1717 Q1728 Q1732 Q1736 Q1738 Q1739 Q1742 Q1743 Q1744 Q1745 Q1747 Q1750 Q1751 Q1752 Q1753 Q1755 Q1758 Q1760 Q1762 Q1766 Q1768 Q1769 Q1771 Q1775 Q1776 Q1777 Q1778 Q1779 Q1782 Q1783 Q1784 Q1785 Q1786 Q1787 Q1788 Q1789 Q1790 Q1791 Q1793 Q1796 Q1797 Q1798 Q1802 Q1803 Q1804 Q1805 Q1812 Q1817 Q1830 Q1835 Q1839 Q1868 Q1878 Q1879 Q1883 Q1885 Q1894 Q1907 Q1908 Q1909 Q1910 Q1911 Q1912 Q1913 Q1915 Q1916 Q1917 Q1918 Q1919 Q1920 Q1921 Q1922 Q1923 Q1924 Q1925 Q1926 Q1927 Q1928 Q1929 Q1931 Q1933 Q1934 Q1935 Q1936 Q1937 Q1938 Q1939 Q1940 Q1942 Q1943 Q1944 Q1945 Q1950 Q1955 Q1956 Q1958 Q1962 Q1984 Q1991 Q1993 Q2001 Q2006 Q2010 Q2022 Q2031 Q2038 Q2039 Q2040 Q2042 Q2054 Q2069 Q2071 Q2072 Q2086 Q2097 Q2098 Q2104 Q2105 Q2116 Q2124 Q2125 Q2129 Q2147 Q2153 Q2161 Q2172 Q2185 Q2190 Q2196 Q2252 Q2253 Q2259 Q2263 Q2274 Q2291 Q2307 Q2327 Q2330 Q2339 Q2492 Q2494 Q2496 Q2512 Q2514 Q2516 Q2518 Q2530 Q2538 Q2540 Q2542 Q2543 Q2551 Q2563 Q2566 Q2567 Q2569 Q2570 Q2571 Q2573 Q2582 Q2593 Q2594 Q2597 Q2599 Q2601 Q2602 Q2604 Q2607 Q2610 Q2628 Q2632 Q2643 Q2646 Q2655 Q2667 Q2673 Q2677 Q2680 Q2685 Q2709 Q2732 Q2737 Q2750 Q2754 Q2757 Q2767 Q2791 Q2808 Q2831 Q2866 Q2908 Q2972 Q2998 Q3008 Q3034 Q3036 Q3044 Q3048 Q3090 Q3095 Q3098 Q3099 Q3101 Q3102 Q3112 Q3121 Q3128 Q3137 Q3153 Q3165 Q3166 Q3188 Q3195 Q3197 Q3205 Q3234 Q3239 Q3247 Q3250 Q3251 Q3253 Q3260 Q3271 Q3275 Q3281 Q3285 Q3288 Q3291 Q3295 Q3300 Q3301 Q3319 Q3321 Q3324 Q3335 Q3340 Q3345 Q3350 Q3355 Q3356 Q3362 Q3365 Q3371 Q3373 Q3374 Q3378 Q3547 Q3603 Q3606 Q3610 Q3611 Q3622 Q3647 Q3648 Q3671 Q3677 Q3722 Q3745 Q3772 Q3773 Q3794 Q3816 Q3824 Q3835 Q3867 Q3910 Q3911 Q3924 Q3925 Q3990 Q3993 Q3996 Q4009 Q4012 Q4014 Q4025 Q4026 Q4028 Q4029 Q4030 Q4036 Q4038 Q4039 Q4042 Q4058 Q4061 Q4064 Q4070" " ")))