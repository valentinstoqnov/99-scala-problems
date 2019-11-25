#lang racket

(define (dupli xs)
  (if (null? xs) '()
      (append (list (car xs) (car xs)) (dupli (cdr xs)))))

(dupli '(A B C C D))