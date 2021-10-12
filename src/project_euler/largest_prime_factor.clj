(ns project-euler.largest-prime-factor)

(defn largest-factor
  [x]
  (loop [f (int (Math/floor (Math/sqrt x)))]
    (if (= (mod x f) 0)
      f
      (recur (- f 1)))))

(defn factorize
  [x]
  (loop [f (largest-factor x)
         acc []]
    (if (= (f) 1)
      f
      (recur (- f 1)))))

;; 11718