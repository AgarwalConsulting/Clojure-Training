(ns hello-api
  ; (:use [ring.adapter.jetty :only [run-jetty]]))
  (:require [ring.adapter.jetty :refer [run-jetty]]))
; https://stackoverflow.com/questions/871997/difference-between-use-and-require

(defn hello-handler [request]
  {:status 200
    :headers {"Content-Type" "text/html"}
    :body "Hello World from clojure"})

(defn router [request]
  (let [{uri :uri method :request-method} request]
    (case [method uri]
      [:get "/hello"] (hello-handler request)
      {:status 404 :body "404 not found"})))

(defn -main [& [port]]
  (let [port (Integer. (or port
    (System/getenv "PORT")
    3000))]
  (run-jetty router {:port port
                       :join? false})))
