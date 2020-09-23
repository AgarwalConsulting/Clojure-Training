(ns hello-api
  (:use ring.adapter.jetty))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World from clojure"})

(defn -main [& [port]]
  (let [port (Integer. (or port
    (System/getenv "PORT")
    3000))]
  (run-jetty handler {:port port
                       :join? false})))
