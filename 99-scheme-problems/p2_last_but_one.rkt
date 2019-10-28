(define (penultimate xs)
  (if (null? (cddr xs)) (car xs)
      (penultimate (cdr xs))))

(penultimate (list 1 2 3 4))
(penultimate (list 1 2))

    
                          