;=/WiDaPic
(fn[rq rs](let[
q(.getParameter rq"q")
Q(if q q"Q107006")]
;(.sendRedirect rs
(str"/mPic?q="
(java.net.URLEncoder/encode
(.replaceAll
(:value(:datavalue
(:mainsnak
(first
;(second;SuendenMund!
(:P18
(:claims
 ((keyword Q)
   (:entities
      (clojure.contrib.json/read-json
          (slurp(str"https://www.wikidata.org/wiki/Special:EntityData/"Q".json")))
	    ))))))))" ""_")"UTF-8"))))