
(def x1 "1234")
(def x2 "abcd")
(def x3 "a1b2c3d4")

(println (re-find #"\d+" x1))
(println (re-find #"\d+" x2))
(println (re-find #"\d+" x3))
