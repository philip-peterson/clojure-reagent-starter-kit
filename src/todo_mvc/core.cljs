(ns todo-mvc.core
  (:require [cljsjs.react :as react]))

(enable-console-print!)

(.log js/console js/React)
(js/alert js/React)

(defn hello [] "hello There")

;; uncomment this to alter the provided "app" DOM element
;; (set! (.-innerHTML (js/document.getElementById "app")) (hello))

(println (hello))
