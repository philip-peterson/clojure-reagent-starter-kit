(ns todo-mvc.core
  (:require [reagent.core :as r]
   [reagent.core :as r]
   [reagent.dom :as rdom]
   [clojure.string :as str]))

(enable-console-print!)

(defn todo-app []
  [:div {:style {:background "#FFF"
                 :color "#000"}}

        [:h1 "title"]])

(rdom/render [todo-app] (js/document.getElementById "app"))
