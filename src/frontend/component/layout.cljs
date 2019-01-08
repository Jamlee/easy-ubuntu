(ns frontend.core.component
  (:require [cljsjs.react]
    [cljsjs.react.dom]
    [sablono.core :as sab :refer-macros [html]]))

(def nav
  (html [:nav {:class "my-2 my-md-0 mr-md-3"} 
    (list [:a {:class "p-2 text-primary"} "登陆"] 
          [:a {:class "p-2 text-primary"} "头像"])]))


;; 定义文件头
(def header 
  (html [:header {:class "shadow-sm"}
    [:div {:class "container"} 
      [:div {:class "row"}
        [:div {:class "col-12"}
          [:div {:class "d-flex flex-column flex-md-row align-items-center p-3 px-md-4 bg-white"}
            (list [:h4 {:class "my-0 mr-md-auto font-weight-normal"} 
                  "VeryPanel"]
                nav)]]]]]))