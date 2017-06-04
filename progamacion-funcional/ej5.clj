;; Definir funcion (fmap f coll) que aplique f al contenido de una coleccion
;; preservando el tipo de la misma (map retorna siempre una lista infinita) La misma debe al
;; menos operar sobre listas, vectores y diccionarios


(defn fmap [funcion colleccion]
  map funcion colleccion
)



(fmap inc (list 1 2 3))
(fmap inc [1 2 3 4 5])
(fmap inc {:a 1 :b 2})
