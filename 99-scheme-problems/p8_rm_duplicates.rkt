(define (rm-dupl xs)
  (define (rm-dupl-r xs pe)
    (if (null? xs) (list pe)
        (if (= (car xs) pe) (rm-dupl-r (cdr xs) pe)
            (append (list pe) (rm-dupl-r (cdr xs) (car xs))))))
  
  (if (null? xs) xs
    (rm-dupl-r (cdr xs) (car xs))))

(rm-dupl (list 1 2 3 3 3 4 5 6 6 6 6 6 7))
(rm-dupl (list))
(rm-dupl (list 2))
(rm-dupl (list 1 1 1 1 1 1 1))
(rm-dupl (list 3 3 3 3 3 3 3 3 3 4 4 4 4 4 3 4 3))

      