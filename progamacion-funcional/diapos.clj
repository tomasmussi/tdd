(defn factorial-acc [numero acumulador]
  (if
    (= numero 1)
    acumulador
    (recur (- numero 1) (* numero acumulador))
  )
)

(defn factorial [numero]
  (factorial-acc numero 1)
)

(factorial 4)

(def bools [true true true false false])
(every? true? bools)


(defn pepe [p] (= "rob" p))

(some pepe ["kyle" "siva" "rob" "celeste"])

(count (list 1 2 3 4))

(def the-map {:a 1 :b 2 :c 3})
(the-map :b)

(:b the-map)

(:z the-map 26)

(def users {
  :kyle {
    :date-joined "2009-01-01"
    :summary {
      :average {
        :monthly 1000
        :yearly 12000
      }
      }
    }
  }
)

(assoc-in users [:kyle :summary :average :monthly] 3000)
;=> {:kyle {:date-joined "2009-01-01", :summary {:average
;{:monthly 3000,
;:yearly 12000}}}}

(get-in users [:kyle :summary :average :monthly])

((comp inc *) 2 3 4)

(map inc (list 1 2 3))

(map (fn [arg] (> arg 0)) (list 1 2 3))


(filter pos? (list -1 1 2 3))

(filter neg? (list -1 1 2 3))

(defn juan [x y] (+ x y))
(def acc 0)
(reduce juan acc (list -1 1 2 3))

(defn average-pets []
  (let [
        user-data (vals users)
        pet-counts (map :number-pets user-data)
        total (apply + pet-counts)
    ]
    (/ total (count users))
  )
)

(use 'clojure.test)

(deftest test-math-operations
(is (= 4 (+ 2 2)))
(is (instance? Long 256))
(is (.startsWith "abcde" "ab"))
(is (= 4 (+ 2 1)))
)

(run-tests)
