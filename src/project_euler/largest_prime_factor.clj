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

(defn smallest-factor
  [x]
  (first (filter #(= (mod x %) 0)
                 (range 2 (inc (int (Math/floor (Math/sqrt x))))))))

(defn is-prime?
  [x]
  (nil? (smallest-factor x)))

(defn largest-prime-factor 
  [x]
  (loop [factor x]
    (if (is-prime? factor)
      factor
      (recur (/ factor (smallest-factor x))))))
;; 11718