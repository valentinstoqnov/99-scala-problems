(define (flatten xs)
  (if (null? xs) xs
      (if (list? (car xs)) (append (flatten (car xs)) (flatten (cdr xs)))
          (append (list (car xs)) (flatten (cdr xs))))))

(flatten (list 1 2 (list 3 4) 5))
(flatten (list 1 2 (list 3 4 (list (list (list 5)))) (list 6) 7 8))
(flatten (list))