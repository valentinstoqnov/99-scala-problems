#lang racket

(define (rm-at xs i)
  (cond ((null? xs) '())
        ((= 1 i) (cdr xs))
        (else (cons (car xs) (rm-at (cdr xs) (- i 1))))))
        