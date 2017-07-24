
(def edn-demo {:a 1
               :b [1 2]
               :c false
               :d :a-keyword
               :e '(1 2 3)
               :f #{1 2 3}
               :g "string"
               :h nil})

(def json-demo (clj->js edn-demo))
; js->clj if you need

(def json-string-demo (.stringify js/JSON json-demo nil 2))

(println "EDN:" edn-demo)

(.log js/console "JSON:" json-demo)

(println "JSON String:" json-string-demo)
