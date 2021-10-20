(ns project-euler.largest-prime-factor)

(defn prime-sieve
  [x]
  (loop [num (range 2 (inc x))
         acc []]
    (if (empty? num)
      acc
      (recur (filter
              #(not= (mod % (first num)) 0)
              (rest num))
             (conj acc (first num))))))
;; 11718