
(def xs (range 100))

(defn square [x] (* x x))

(println (->> xs
            (map square)
            (reduce +)))
; ->> is a macro, it expands to
; (reduce + (map sequare xs))
