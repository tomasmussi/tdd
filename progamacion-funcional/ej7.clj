;; Definir una funcion eval inmediate que reciba un diccionario asociando simbolos
;; a funciones, una lista cuyo primer elemento sea un simbolo y que invoca la funcion
;; asociada al simbolo sobre el resto de los elementos de la lista

(defn eval-immediate)

(def env { :suma + :mult * :concat (fn [& x] (apply str x))})


(eval-immediate env (:suma 1 2 3))
(eval-immediate env (:mult 2 4))
