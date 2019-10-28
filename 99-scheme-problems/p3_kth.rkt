(define (kth k xs)
  (if (= k 0) (car xs)
      (kth (- k 1) (cdr xs))))

(kth 3 (list 1 2 3 4))
(kth 6 (list 1 2 3 4 5 6 7 8 9))