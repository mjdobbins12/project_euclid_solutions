(ns project-euler.even-fibonacci)

(defn fib-series
  "Generates the fibonnaci series beginning with 1 and 2, for values below a specified limit"
  [limit]
  (loop [x 1
         y 2
         acc [1 2]]
    (if (> (+ x y) limit)
      acc
      (recur y (+ x y) (conj acc (+ x y))))
    ))

(defn sum-even-fib
  "Gives the sum of even members of the fibonacci series below a specified limit"
  [limit]
  (reduce +
          (filter
           #(= (mod % 2) 0)
           (fib-series limit))))
