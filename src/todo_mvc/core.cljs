(ns todo-mvc.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(.log js/console "reagent is" r/atom)
(js/alert js/React)

(defn hello [] "hello There")

;; uncomment this to alter the provided "app" DOM element
;; (set! (.-innerHTML (js/document.getElementById "app")) (hello))

(println (hello))
