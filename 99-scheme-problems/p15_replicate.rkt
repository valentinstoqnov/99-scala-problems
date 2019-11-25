#lang racket

(define (repeat x n)
    (if (= 0 n) '() (cons x (repeat x (- n 1)))))

(define (repli xs n)
 (if (null? xs) '()
     (append (repeat (car xs) n) (repli (cdr xs) n))))