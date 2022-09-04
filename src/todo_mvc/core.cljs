(ns todo-mvc.core
  (:require [reagent.core :as r]
            [reagent.core :as r]
            [reagent.dom :as rdom]
            [react]
            [styled-components :as styled]
            [cljs-styled-components.reagent
                      :refer [defstyled]]))

(enable-console-print!)

(defstyled example1 :p {:color "blue"})

(defn todo-app []
  [:div example1 
    ["hello world"]])
  

(rdom/render [todo-app] (js/document.getElementById "app"))
