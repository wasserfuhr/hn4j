(ns x(:require[clojure.data.json :as json]))
(print(apply str(map(fn[r](let[
q(read-string(str"0x"r))
s(slurp
 ;(str"https://www.wikidata.org/wiki/Special:EntityData/"q".json")
 (str"q/"r))
v(try(:value(:datavalue(:mainsnak(first(:P569(:claims
  ((keyword(str"Q"q))(:entities(json/read-str s :key-fn keyword))))))))))(catch Exception e{:time "+????-??-??___":precision "0"}))]
 (str q" "(format"%x"(Long.(:precision v)))" "(subs(:time v)0 11)"\n")))
  (.split"133 1d0 26b 2a3 2fa 364 3a7 50a 631 10c7 133a 15cc 16be 18d1 1a42 1bad 1bb3 1bbb 1bbf 1c53 1c5b 1c76 1db4 1f4b 205f 216c 2223 222b 2233 223b 2244 226e 2303 234e 2351 2357 2387 23aa 23e7 2465 24af 257a 26e6 2815 2b39 2b43 2b47 2b60 2b7d 2c5c 2c5f 2c62 2c6d 2ca4 2cdf 2d42 2d46 2d4a 2d4c 2d59 2d6a 2d6c 2d79 2ddc 2dea 2df6 2e32 2e6c 2e6f 2e7f 321e 3239 326a 32c6 33b5 34c5 3712 3798 37ac 37b7 37c6 37c7 37c8 3ab6 403d 4061 406c 406e 40c5 421c 442f 4431 4470 4472 4532 4a73 4a77 4e2c 4e2f 4e32 50f4 5886 5c90 5ebb 62e6 63ee 63fb 64d9 6839 69c0 69c1 69e9 69f6 69fe 6abb 6ac9 6aed 6aee 6af0 6b23 6beb 70e4 7109 714a 7209 73e0 77e5 7831 7a2e 7acf 7e52 7e8f 7ea0 83e0 867e 869a 887f 8c3c 8dcf 92f5 9452 94c2 96ec 984b 9aaf 9b9d 9d61 9de2 9fc8 a1ae a20d a271 a2d8 a326 a3fc a53b a5da a8ae a93b adc1 ae66 b02b b039 b069 b0f9 b2dd b629 b8b5 b94a b978 c05d c29f c7a5 ca39 ca45 cd4f da24 df07 df0f df18 df39 df8c df9d df9e dfa0 dfc3 dff7 e038 e03b e04c e07a e0d9 e0dc e12b e3d8 e4da e526 e534 e560 e57e e5ab e5b9 e5c0 e662 e9f4 ea7c ea8b ea94 eb12 ebed ebf6 ec56 eca6 ed05 edb6 eddf ee6d ee6e ee73 ee74 ee76 ee77 ef27 ef28 ef86 f119 f124 f129 f12c f12f f133 f134 f135 f137 f139 f13c f13e f13f f141 f143 f144 f146 f148 f149 f14e f162 f169 f175 f184 f1bd f2d4 f33f f369 f532 f589 f58d f596 f59d f60e f669 f952 fa10 fb60 fb77 fbff fc58 fd05 fdcf fe3a fe98 fe9a fe9c fe9d fe9f fea1 fea3 fea5 fea8 feaa feac fead feaf feb1 feb2 feb5 feb7 feb9 feba febc febe fec0 fec3 fec5 fec7 ff34 ff42 ff4c 100b8 1013d 10239 102ec 1035a 103fc 10495 1063b 10682 106b7 106dd 106f5 10748 10b08 10b8a 10b99 10b9b 10ba0 10ba2 10ba7 10ba9 10bab 10bad 10baf 10bb3 10bb5 10bb8 10bbb 10bbd 10bbe 10bc1 10bc3 10bc6 10bc7 10bc9 10bca 10bcf 10bfc 10c3e 10e1f 10e4b 110e0 11422 114a2 114e4 114f9 11572 11575 1158c 115c1 115f3 11680 11686 11691 11747 11761 117a8 117d1 11870 118af 118fe 1198a 1198e 119a8 119b5 11ab1 11abe 11b5a 11b7d 11b97 11d0c 11d0f 11d12 11d13 11d14 11d16 11d19 11d1b 11d1c 11d20 11d22 11d23 11d24 11d25 11d26 11d27 11d28 11d29 11d2d 11d2e 11d31 11d32 11d34 11d35 11d36 11d37 11e2e 11ef5 11f71 11fc3 11fd5 11fde 11ff1 12139 12224 123d5 1240d 1251a 125be 126a3 1277a 12787 12789 12815 1281f 12845 12850 1288f 128db 12981 129bc 12a14 12a3a 12a4b 12a4d 12a5a 12a7a 12a84 12aba 12ade 12b0c 12b14 12b61 12b8c 12bb8 12bc2 12c94 12d16 12d51 12d55 12d93 12da3 12db2 12de8 12df0 12df1 12df5 12df7 12df8 12e01 12e04 12e0a 12e2a 12e31 12e7c 12ebc 12ebe 12ebf 12ec0 12ec2 12ec3 12ec5 12ec6 12ec8 12ecb 12ecd 12ecf 12ed0 12ed3 12ffa 13002 1305e 13072 1308a 130aa 130d7 130d9 13105 13107 13108 1310a 1310b 1310c 1310d 1310f 13112 13115 13116 13117 13119 1311a 13138 131a3 1323f 13246 1324e 13255 1326d 13270 132d3 132f4 13365 1339f 133ea 1346b 1347c 13482 134b8 134de 134e6 13507 1353b 13549 1395e 139ed 13aa9 13ae4 13cba 13cea 13edb 13fdf 14461 144db 14583 14903 1493c 14941 14944 14948 14992 149b6 149fd 14a48 14a4a 14a80 14b12 14b1a 14b25 14b26 14b31 14b52 14c3d 14d14 14d9c 14e0a 14e9c 14eef 15036 15042 15047 1505d 1507d 150cc 150ea 15100 15166 15190 151b9 15253 153db 153fe 15445 15472 154cb 154f4 1554b 15571 15583 15586 15587 1559b 155b0 155cb 155e3 155fe 15602 15640 15644 1569b 156b9 15747 15784 157e9 15819 1594e 159a5 159d3 159e3 15a0b 15a2c 15a32 15ae0 15b9e 15bbf 15bc1 15bce 15bda 15bde 15bdf 15bef 15bf3 15bf7 15c03 15c26 15c2d 15ce8 15cf4 15d01 15d0a 15d13 15d37 15d62 15d7a 15e21 15e61 15f17 16082 16086 160a9 160c8 160ca 16169 161cc 161cf 161d0 161ec 161f2 16210 1629c 162b0 162de 16320 1632a 1639b 1639c 163b9 163ce 1644c 1645d 16461 164e3 164ee 164f1 164f4 164f8 164f9 164fa 164fe 16502 16514 1653c 1653d 16575 165b1 165b2 165f3 165f5 165f6 165f7 165f8 165fa 165fb 165fe 165ff 16600 16601 16602 16604 16605 16607 16609 1660b 1660d 1660e 1660f 16610 16612 16613 16614 16616 16617 16618 16619 1661a 1661b 16669 16747 16766 167ac 1687c 16880 168a9 168ca 168d9 168f6 168ff 16904 1690a 1695a 169b4 169c1 169c3 169c4 169c5 169cb 169d4 169d5 169d8 169de 169df 169f0 169f7 169fd 169fe 16a00 16a12 16a17 16a19 16a1e 16a1f 16a20 16a25 16a26 16a38 16a43 16a44 16a45 16a48 16a4a 16a4f 16a54 16a58 16a5f 16a65 16a6e 16a73 16a79 16a8a 16a90 16a91 16a9e 16aa3 16aa7 16aa8 16aa9 16aab 16aad 16ab1 16aba 16ac1 16ac2 16ac3 16ac4 16ac5 16ac6 16ac7 16ac8 16ad1 16ad2 16ad4 16adb 16add 16ae2 16ae7 16aeb 16aee 16af0 16aff 16b00 16b0b 16b16 16b17 16b1d 16b1f 16b22 16b23 16b25 16b26 16b28 16b35 16b36 16b46 16b4a 16b4c 16b4d 16b55 16b57 16b5b 16b65 16b67 16b6a 16b6c 16b71 16b72 16b7f 16b81 16b85 16b93 16b95 16b96 16b97 16b98 16b9f 16bb0 16bb5 16bce 16bd0 16d0a 16d50 16d62 16d94 16dfa 16e82 16f3e 16f4c 16f55 170c4 1744c 174c0 17556 175b1 175d9 17618 17630 1764d 176d7 176ee 176f5 1770d 1775e 17760 17840 178dc 17905 17985 17989 17999 1799a 179a0 179a8 17a35 17b79 17b7f 17b82 17bbd 17cf9 17d0e 17d19 17d3c 17d67 17d7b 17de6 17e20 17ebd 17ee9 17eef 17ef2 17ef4 17ef6 17ef8 17f01 17f03 17f1f 17f84 17fc4 17ffc 18075 18164 1827a 18302 1836f 18420 184dc 184df 1850c 18517 187fa 1885d 1886e 188ae 188af 18944 18947 1894e 18958 1895d 18990 189aa 189d5 18c57 18cc2 18d38 18d6c 18d75 18ded 18e82 18e83 18e92 18f19 18f1f 1905a 190f0 191c3 19307 1930d 19316 19319 1931b 1931e 1931f 19320 19330 19334 19335 19338 193b8 193c9 1942c 19463 19475 194f5 19539 196da 196ed 19745 197e1 19803 1980d 19827 1986c 198f0 19906 1995b 19976 19a2d 19a75 19a7e 19ad3 19b49 19ba7 19ba8 19bb2 19bc1 19bc2 19bd6 19bd7 19c61 19cad 19d35 19d6c 19ee0 1a03f 1a064 1a078 1a07c 1a07e 1a07f 1a084 1a085 1a086 1a08a 1a08b 1a09d 1a0df 1a17e 1a32b 1a32f 1a348 1a34f 1a39e 1a3b1 1a3f0 1a445 1a49b 1a5ef 1a6db 1a6f4 1a734 1a797 1a7a3 1a7ab 1a838 1a848 1a88f 1a9d3 1a9f4 1aa06 1aa09 1aa0a 1aa0c 1aa10 1aa15 1aa22 1aa23 1aa35 1aaf1 1ab3b 1ab40 1ab4b 1abdb 1aca2 1acd0 1ad1e"" "))))
; (.split"Q23 Q42 Q76 Q80 Q91 Q157 Q181 Q185 Q186 Q192 Q206 Q207 Q254 Q255 Q260 Q272 Q296 Q297 Q301 Q303 Q306 Q307 Q326 Q329 Q331 Q335 Q346 Q352 Q353 Q354 Q360 Q368 Q377 Q379 Q392 Q400 Q407 Q409 Q410 Q440 Q444 Q448 Q449 Q464 Q475 Q489 Q493 Q498 Q501 Q502 Q504 Q512 Q517 Q529 Q530 Q535 Q539 Q555 Q557 Q558 Q559 Q562 Q563 Q567 Q576 Q579 Q590 Q600 Q603 Q605 Q607 Q609 Q615 Q619 Q624 Q632 Q633 Q635 Q636 Q651 Q675 Q680 Q687 Q692 Q714 Q720 Q742 Q747 Q755 Q762 Q765 Q767 Q814 Q815 Q820 Q835 Q838 Q839 Q845 Q848 Q849 Q853 Q855 Q857 Q859 Q862 Q868 Q873 Q882 Q885 Q892 Q905 Q909 Q913 Q920 Q926 Q927 Q930 Q935 Q937 Q939 Q946 Q949 Q984 Q989 Q991 Q997 Q1001 Q1023 Q1031 Q1035 Q1043 Q1047 Q1048 Q1051 Q1056 Q1058 Q1064 Q1067 Q1081 Q1124 Q1145 Q1149 Q1151 Q1178 Q1189 Q1192 Q1203 Q1217 Q1220 Q1224 Q1225 Q1228 Q1230 Q1233 Q1235 Q1238 Q1240 Q1241 Q1242 Q1245 Q1253 Q1254 Q1257 Q1259 Q1260 Q1264 Q1267 Q1268 Q1271 Q1275 Q1276 Q1290 Q1294 Q1298 Q1300 Q1316 Q1317 Q1318 Q1319 Q1320 Q1322 Q1323 Q1324 Q1325 Q1326 Q1327 Q1328 Q1329 Q1330 Q1331 Q1332 Q1333 Q1339 Q1340 Q1379 Q1381 Q1394 Q1395 Q1398 Q1399 Q1401 Q1402 Q1403 Q1405 Q1407 Q1409 Q1411 Q1413 Q1414 Q1416 Q1417 Q1419 Q1421 Q1423 Q1424 Q1425 Q1426 Q1427 Q1429 Q1430 Q1433 Q1434 Q1436 Q1440 Q1442 Q1446 Q1450 Q1453 Q1463 Q1464 Q1470 Q1480 Q1488 Q1496 Q1500 Q1503 Q1511 Q1512 Q1514 Q1523 Q1526 Q1528 Q1532 Q1541 Q1544 Q1545 Q1585 Q1589 Q1604 Q1615 Q1618 Q1625 Q1628 Q1631 Q1634 Q1638 Q1639 Q1646 Q1651 Q1652 Q1654 Q1655 Q1656 Q1657 Q1659 Q1660 Q1662 Q1665 Q1666 Q1668 Q1669 Q1671 Q1672 Q1674 Q1677 Q1679 Q1681 Q1683 Q1685 Q1687 Q1690 Q1691 Q1698 Q1699 Q1702 Q1704 Q1705 Q1708 Q1712 Q1716 Q1717 Q1728 Q1732 Q1736 Q1738 Q1739 Q1742 Q1743 Q1744 Q1745 Q1747 Q1750 Q1751 Q1752 Q1753 Q1755 Q1758 Q1760 Q1762 Q1766 Q1768 Q1769 Q1771 Q1775 Q1776 Q1777 Q1778 Q1779 Q1782 Q1783 Q1784 Q1785 Q1786 Q1787 Q1788 Q1789 Q1790 Q1791 Q1793 Q1796 Q1797 Q1798 Q1802 Q1803 Q1804 Q1805 Q1812 Q1817 Q1830 Q1835 Q1839 Q1868 Q1878 Q1879 Q1883 Q1885 Q1894 Q1907 Q1908 Q1909 Q1910 Q1911 Q1912 Q1913 Q1915 Q1916 Q1917 Q1918 Q1919 Q1920 Q1921 Q1922 Q1923 Q1924 Q1925 Q1926 Q1927 Q1928 Q1929 Q1931 Q1933 Q1934 Q1935 Q1936 Q1937 Q1938 Q1939 Q1940 Q1942 Q1943 Q1944 Q1945 Q1950 Q1955 Q1956 Q1958 Q1962 Q1984 Q1991 Q1993 Q2001 Q2006 Q2010 Q2022 Q2031 Q2038 Q2039 Q2040 Q2042 Q2054 Q2069 Q2071 Q2072 Q2086 Q2097 Q2098 Q2104 Q2105 Q2116 Q2124 Q2125 Q2129 Q2147 Q2153 Q2161 Q2172 Q2185 Q2190 Q2196 Q2252"" "))))