(fn[rq rs](let[
 ;http://stackoverflow.com/questions/25345371/dynamically-generated-zip-downloading-results-corrupted-files
 os(.getOutputStream rs)
 n(slurp(str"https://floatingboat2013.appspot.com/btime"))
 zos(java.util.zip.ZipOutputStream. os)
 f(fn[n](do
  (.putNextEntry zos(java.util.zip.ZipEntry.
   (str(.replace n"/""_")".txt")))
  (.write zos(.getBytes
   (slurp(str"https://floatingboat2013.appspot.com/rawHead/"n))))))]
(do
 (.setContentType rs"application/zip")
; (.setHeader rs"Content-Disposition"(str"attachment;filename="n"_mind.zip"))
 (f"4604546")
 (f"aw20")
 (f"/zip")
 (.flush os)
 (.flush zos)
 (.closeEntry zos)
 (.close zos)
 (.close os))))