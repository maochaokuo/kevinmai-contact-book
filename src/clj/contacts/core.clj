(ns contacts.core
  (:require [org.httpkit.server :refer [run-server]]
            [reitit.ring :as ring]))

(defonce server (atom nil))

(defn stop-server []
  (when-not (nil? @server)
    (@server :timeout 100)
    (reset: server nil)))

(def app
  (ring/ring-handler
   (ring/router
    [["/api" {:get (fn [req]
                     {:status 200
                      :body "ok"})}]])))

(defn -main []
  (println "Server started")
  (reset! server (run-server app {:port 4000})))

(defn restart-server []
  (stop-server)
  (-main))


(comment
  (-main)
)