
; It's called "interop" in Clojure world
; http://www.spacjer.com/blog/2014/09/12/clojurescript-javascript-interop/

(println "a demo of string")
(.log js/console "a demo of string")
; console.log('a demo of string')

(.log js/console js/process.argv)
; console.log(process.argv)
(.log js/console (.-argv js/process))
(.log js/console (aget js/process "argv"))

(def now (new js/Date))

(println (.getFullYear now))
; console.log(now.getFullYear())
