
(def fs (js/require "fs"))

(def content (fs.readFileSync "README.md" "utf8"))

(println content)
