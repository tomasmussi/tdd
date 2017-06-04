;; Defina una funcion multimetodo que dado un parametro imprima "soy un []" donde [] es
;; la clase del objeto para string y para vector.
;; Agregar el caso default

(defmulti multimetodo-things (fn [thing] (type thing)))
(defmethod multimetodo-things java.lang.String [thing] "string papa")
(defmethod multimetodo-things clojure.lang.PersistentVector [thing] "vector papa")
(defmethod multimetodo-things :default [thing] "cualquiera")

(multimetodo-things "")
(multimetodo-things [])
(multimetodo-things {})

