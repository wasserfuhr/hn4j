(ns x(:require[clojure.data.json :as json]))
(println(apply str(map(fn[q](let[s(slurp
(str"https://www.wikidata.org/wiki/Special:EntityData/"r".json")
;(str"q/"q".json")
)]
 (str q" "(:value(:datavalue(:mainsnak(first(:P18 (:claims
  ((keyword q)(:entities(json/read-str s :key-fn keyword)))))))))"\n")))
;  (.split"Q7747 Q76 Q937 Q7200 Q6294 Q352 Q8016 Q12823 Q5879 Q8704 Q8023 Q7243 Q991 Q5152 Q255 Q692 Q254 Q1339 Q9682 Q855 Q5383 Q762 Q11571 Q5592 Q567 Q23 Q882"" "))))
(.split"Q16378 Q16379 Q16381 Q16382 Q16383 Q19837 Q19837 Q20150 Q22686 Q23481 Q23844 Q30863 Q34253 Q34981 Q36215 Q41421 Q42101 Q43768 Q43948 Q44194 Q44403 Q47875 Q51666 Q57229 Q57364 Q60024 Q62285 Q62892 Q62901 Q63032 Q65932 Q71074 Q76632 Q76658 Q76826 Q77391 Q84296 Q86081 Q92764 Q107006 Q108447 Q135216 Q152308 Q156268 Q160305 Q178369 Q188987 Q243969 Q298341 Q312618 Q312799 Q317521 Q318636 Q432473 Q435716 Q562799 Q705525 Q828203 Q1330449 Q1577296 Q1670311 Q1898276 Q1929182 Q2057275 Q2589454 Q6860370 Q9079904 Q18176756"" "))))
;  (.split"Q23 Q42 Q76 Q80 Q91 Q157 Q181 Q185 Q186 Q192 Q206 Q207 Q254 Q255 Q260 Q272 Q296 Q297 Q301 Q303 Q306 Q307 Q326 Q329 Q331 Q335 Q346 Q352 Q353 Q354 Q360 Q368 Q377 Q379 Q392 Q400 Q407 Q409 Q410 Q440 Q444 Q448 Q449 Q464 Q475 Q489 Q493 Q498 Q501 Q502 Q504 Q512 Q517 Q529 Q530 Q535 Q539 Q555 Q557 Q558 Q559 Q562 Q563 Q567 Q576 Q579 Q590 Q600 Q603 Q605 Q607 Q609 Q615 Q619 Q624 Q632 Q633 Q635 Q636 Q651 Q675 Q680 Q687 Q692 Q714 Q720 Q742 Q747 Q755 Q762 Q765 Q767 Q814 Q815 Q820 Q835 Q838 Q839 Q845 Q848 Q849 Q853 Q855 Q857 Q859 Q862 Q868 Q873 Q882 Q885 Q892 Q905 Q909 Q913 Q920 Q926 Q927 Q930 Q935 Q937 Q939 Q946 Q949 Q984 Q989 Q991 Q997 Q1001 Q1023 Q1031 Q1035 Q1043 Q1047 Q1048 Q1051 Q1056 Q1058 Q1064 Q1067 Q1081 Q1124 Q1145 Q1149 Q1151 Q1178 Q1189 Q1192 Q1203 Q1217 Q1220 Q1224 Q1225 Q1228 Q1230 Q1233 Q1235 Q1238 Q1240 Q1241 Q1242 Q1245 Q1253 Q1254 Q1257 Q1259 Q1260 Q1264 Q1267 Q1268 Q1271 Q1275 Q1276 Q1290 Q1294 Q1298 Q1300 Q1316 Q1317 Q1318 Q1319 Q1320 Q1322 Q1323 Q1324 Q1325 Q1326 Q1327 Q1328 Q1329 Q1330 Q1331 Q1332 Q1333 Q1339 Q1340 Q1379 Q1381 Q1394 Q1395 Q1398 Q1399 Q1401 Q1402 Q1403 Q1405 Q1407 Q1409 Q1411 Q1413 Q1414 Q1416 Q1417 Q1419 Q1421 Q1423 Q1424 Q1425 Q1426 Q1427 Q1429 Q1430 Q1433 Q1434 Q1436 Q1440 Q1442 Q1446 Q1450 Q1453 Q1463 Q1464 Q1470 Q1480 Q1488 Q1496 Q1500 Q1503 Q1511 Q1512 Q1514 Q1523 Q1526 Q1528 Q1532 Q1541 Q1544 Q1545 Q1585 Q1589 Q1604 Q1615 Q1618 Q1625 Q1628 Q1631 Q1634 Q1638 Q1639 Q1646 Q1651 Q1652 Q1654 Q1655 Q1656 Q1657 Q1659 Q1660 Q1662 Q1665 Q1666 Q1668 Q1669 Q1671 Q1672 Q1674 Q1677 Q1679 Q1681 Q1683 Q1685 Q1687 Q1690 Q1691 Q1698 Q1699 Q1702 Q1704 Q1705 Q1708 Q1712 Q1716 Q1717 Q1728 Q1732 Q1736 Q1738 Q1739 Q1742 Q1743 Q1744 Q1745 Q1747 Q1750 Q1751 Q1752 Q1753 Q1755 Q1758 Q1760 Q1762 Q1766 Q1768 Q1769 Q1771 Q1775 Q1776 Q1777 Q1778 Q1779 Q1782 Q1783 Q1784 Q1785 Q1786 Q1787 Q1788 Q1789 Q1790 Q1791 Q1793 Q1796 Q1797 Q1798 Q1802 Q1803 Q1804 Q1805 Q1812 Q1817 Q1830 Q1835 Q1839 Q1868 Q1878 Q1879 Q1883 Q1885 Q1894 Q1907 Q1908 Q1909 Q1910 Q1911 Q1912 Q1913 Q1915 Q1916 Q1917 Q1918 Q1919 Q1920 Q1921 Q1922 Q1923 Q1924 Q1925 Q1926 Q1927 Q1928 Q1929 Q1931 Q1933 Q1934 Q1935 Q1936 Q1937 Q1938 Q1939 Q1940 Q1942 Q1943 Q1944 Q1945 Q1950 Q1955 Q1956 Q1958 Q1962 Q1984 Q1991 Q1993 Q2001 Q2006 Q2010 Q2022 Q2031 Q2038 Q2039 Q2040 Q2042 Q2054 Q2069 Q2071 Q2072 Q2086 Q2097 Q2098 Q2104 Q2105 Q2116 Q2124 Q2125 Q2129 Q2147 Q2153 Q2161 Q2172 Q2185 Q2190 Q2196 Q2252"" "))))