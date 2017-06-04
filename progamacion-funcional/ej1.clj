;; Definir en terminos de if una funcion my-cond que se comporte como cond para:
;; 1) valores inmutables y funciones puras
;; 2) valores mutables y funciones con efectos colaterales


;; Esto es un comentario?
(def n -10)

(cond 
  (< n 0) "Negativo"
  (> n 0) "Positivo"
  :else "zero"
)

(if (< n 0) "neg"
    (if (> n 0) "pos"
        "zero"
    )
)


(defn my-cond 
  ([] nil)
  ([predicado valor & resto_parametros]
    (if predicado valor
        (apply my-cond resto_parametros))
    )
)


(my-cond 
  (< n 0) "my-cond Negativo"
  (> n 0) "my-cond Positivo"
  :else "my-cond zero"
)

