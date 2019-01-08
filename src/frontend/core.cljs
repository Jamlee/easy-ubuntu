(ns frontend.core
  (:require [cljsjs.react]
    [cljsjs.react.dom]
    [cljsjs.bootstrap]
    [frontend.core.component :as component]
    [sablono.core :as sab :refer-macros [html]]))

;; 定义系统状态
(def starting-state {})

;; 定义渲染方式
(let [node (.getElementById js/document "app")]
  (defn renderer [full-state]
    (.render js/ReactDOM component/header node)))
(renderer starting-state)