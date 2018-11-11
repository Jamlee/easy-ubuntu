(ns backend.server
  (:require [liberator.core :refer [resource defresource]]
    [ring.middleware.params :refer [wrap-params]]
    [compojure.core :refer [defroutes ANY]]))

;; 定义请求入口
(defroutes app
  (ANY "/foo" [] (resource :available-media-types ["text/html"]
                           :handle-ok "hello world"))                                    
  (ANY "/bar" [] (resource :available-media-types ["text/html"]
                           :handle-ok (fn [ctx]
                                        (format "<html>It's %d milliseconds since the beginning of the epoch."
                                                (System/currentTimeMillis))))))

(def handler 
  (-> app wrap-params))