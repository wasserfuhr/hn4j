(ns x(:require[clojure.data.json :as json]))
(let[Q"Q42]
(:value(:datavalue(:mainsnak(first(:P18 (:claims
 ((keyword Q)(:entities
      (clojure.contrib.json/read-json
          (slurp(str"q/"Q".json")))
	    ))))))))" ""_")"UTF-8"))))