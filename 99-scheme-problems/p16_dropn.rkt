#lang racket

(define (drop l n)
  (define (loop xs counter)
    (cond ((null? xs) '())
          ((= counter n) (loop (cdr xs) 1))
          (else (cons (car xs) (loop (cdr xs) (+ counter 1))))))
  (loop l 1))