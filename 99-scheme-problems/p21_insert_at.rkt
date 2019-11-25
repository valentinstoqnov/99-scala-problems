#lang racket

(define (insert-at x xs i)
  (cond ((null? xs) (list x))
        ((= 1 i) (cons x xs))
        (else (cons (car xs) (insert-at x (cdr xs) (- i 1))))))