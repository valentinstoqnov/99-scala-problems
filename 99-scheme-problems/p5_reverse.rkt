(define (rev xs)
  (define (rev-r xs ys)
    (if (null? xs) ys
        (rev-r (cdr xs) (append (list (car xs)) ys))))
  (rev-r xs (list)))

(rev (list 1 2 3 4))
(rev '())