(ns demo.lib)

(defn hello []
  (js/console.log "hello world"))

(defn not-exported []
  (js/console.log "foo"))
