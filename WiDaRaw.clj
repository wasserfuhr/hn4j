(map(fn[r](let[q(read-string(str"0x"r))]
(if(not(.exists(java.io.File.(str"q/"r))))
 (spit(str"q/"r)(slurp(str"https://www.wikidata.org/wiki/Special:EntityData/Q"q".json"))))))
 (.split(slurp"munzId.txt")" "))