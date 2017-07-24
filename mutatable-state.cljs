
(def *x (atom 0))

(add-watch *x :changes
  (fn [_context _key _ref old-value new-value]
    (println "changes at *x from" old-value "to" new-value)))

(reset! *x 1)
(reset! *x 2)

(println "Now *x is" @*x)

(swap! *x inc)

(println "Now *x is" @*x)

(remove-watch *x :changes)
(println "removed watcher")

(swap! *x inc)

(println "Now *x is" @*x)
