(ns frontend.core
  (:require [cljsjs.react]
    [cljsjs.react.dom]
    [sablono.core :as sab :include-macros true]))

;; 定义系统 html 模板
(def tmpl (sab/html [:h1.score "hello world"]))

;; 定义系统状态
(def starting-state {})

;; 定义渲染方式
(let [node (.getElementById js/document "app")]
  (defn renderer [full-state]
    (.render js/ReactDOM tmpl node)))
(renderer starting-state)