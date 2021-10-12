(ns project-euler.multiples)

(defn multiples-of-3-or-5
  "Finds the sum of all positive multiples of 3 or 5 less than a specified upper bound"
  [limit]
  (reduce +
          (filter
           #(or
             (= (mod % 5) 0)
             (= (mod % 3) 0))
           (range 3 limit))))
