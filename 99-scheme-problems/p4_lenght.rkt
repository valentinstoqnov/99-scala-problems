(define (len xs)
  (if (null? xs) 0
      (+ 1 (len (cdr xs)))))

(len (list 1 2 3 4))
(len (list))
(len (list 1))