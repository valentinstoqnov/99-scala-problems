(define (last xs)
  (if (null? (cdr xs)) (car xs)
      (last (cdr xs))))

(last (list 1 2 3 4))
(last (list 1))