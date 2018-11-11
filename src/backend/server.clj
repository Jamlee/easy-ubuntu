(ns backend.server
  (:require [liberator.core :refer [resource defresource]]
    [ring.middleware.file :refer [wrap-file]]
    [ring.middleware.params :refer [wrap-params]]
    [compojure.route :as route]
    [compojure.core :refer [defroutes GET ANY]]))


;; 定义请求入口
(defroutes app
  (ANY "/" [] (resource :available-media-types ["text/html"]
                        :exists? false :existed? true
                        :moved-permanently? true
                        :location "/index.html"))
  (ANY "/foo" [] (resource :available-media-types ["text/html"]
                           :handle-ok "hello world"))                                    
  (ANY "/bar" [] (resource :available-media-types ["text/html"]
                           :handle-ok (fn [ctx]
                                        (format "<html>It's %d milliseconds since the beginning of the epoch."
                                                (System/currentTimeMillis)))))

  ;; 服务静态文件
  (route/resources "/" {:root "public"})
  (route/not-found "Not found."))

(def handler 
  (-> app wrap-params))