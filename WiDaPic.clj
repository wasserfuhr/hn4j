(ns x(:require[clojure.data.json :as json]))
(println
(apply str(map(fn[q](let[s(slurp(str"q/"q".json"))]
(str q" "
(:value(:datavalue(:mainsnak(first(:P18 (:claims
 ((keyword q)(:entities(json/read-str s :key-fn keyword)))))))))"\n")))
 (.split"Q7747 Q76 Q937 Q7200 Q6294 Q352 Q8016 Q12823 Q5879 Q8704 Q8023 Q7243 Q991 Q5152 Q255 Q692 Q254 Q1339 Q9682 Q855 Q5383 Q762 Q11571 Q5592 Q567 Q23 Q882"" "))))