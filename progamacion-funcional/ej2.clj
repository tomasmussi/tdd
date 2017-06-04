;; Crear una funcion multimetodo para imprimir cuadrado y rectangulo



(def cuadrado {:nombre "cuadrado" :tipo "figuras.cuadrado"})
(def rectangulo {:nombre "rectangulo" :tipo "figuras.rectangulo"})


;;(defn funcion-dispatch (fn [figura] :tipo figura))
(defn get-tipo [figura]
  (:tipo figura))

(defmulti sarasa (fn [figura] (:tipo figura)))
(defmethod sarasa "figuras.cuadrado" [figura] "esto es cuadrado papa")
(defmethod sarasa "figuras.rectangulo" [figura] "esto es rectangulo papa")
(sarasa cuadrado)

;(defmulti m-figuras (fn [figura] (:tipo figura)))
;(defmethod m-figuras "figuras.cuadrado" [figura] "cuadrado papa")
;(defmethod m-figuras "figuras.rectangulo" [figura] "rectangulo papa")
;(m-figuras cuadrado)
;(m-figuras rectangulo)
