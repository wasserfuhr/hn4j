(ns x(:require[clojure.data.json :as json]))
(first(:bindings(:results
  (json/read-str (slurp(str"wd/""0322"))] :key-fn keyword)))