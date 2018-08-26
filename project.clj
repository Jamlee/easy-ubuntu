(defproject easy-ubuntu "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [ [org.clojure/clojure "1.9.0"]
                  ;; js 模块
                  [cljsjs/react "15.6.2-5"]
                  [cljsjs/react-dom "15.6.2-5"]
                  [cljsjs/moment "2.22.2-0"]
                  [cljsjs/c3 "0.4.18-0"]
                  [cljsjs/formsy-react "0.19.0-0"]
                  [cljsjs/formsy-material-ui "0.5.3-0"]
                  [cljsjs/material-ui "1.4.0-0"]

                  ;; html 模板
                  [sablono "0.8.4"]

                  ;; 后端 api
                  [liberator "0.15.2"]
                  [compojure "1.6.1"]
                  [ring/ring-core "1.6.3"]]

  :resource-paths ["resources" "target"]

  ;; figwheel 开发工具
  :profiles {:dev {:dependencies [[com.bhauman/figwheel-main "0.1.7"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]]}}

  ;; 后端
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler backend.server/handler}
  
  ;;任务
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]})

