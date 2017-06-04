;; Definir una funcion execute que reciba la funcion a ejecutar como parametro y sus argumentos
;; y realice la ejecucion de la misma. Aplicar al multimetodo del ej2.

(defn execute [funcion & parametros]
  (apply funcion parametros)
)

(execute + 1 2 3 4 5)
(execute reduce + [1 2 3 4 5])

(def cuadrado {:nombre "cuadrado" :tipo "figuras.cuadrado"})
(def rectangulo {:nombre "rectangulo" :tipo "figuras.rectangulo"})


(defn get-tipo [figura]
  (:tipo figura))

(defmulti sarasa get-tipo)
(defmethod sarasa "figuras.cuadrado" [figura] "esto es cuadrado papa")
(defmethod sarasa "figuras.rectangulo" [figura] "esto es rectangulo papa")


(sarasa cuadrado)

(execute sarasa cuadrado)


