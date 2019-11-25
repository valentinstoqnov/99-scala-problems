#lang racket

(define (split l n)
  (define (loop xs ys counter)
    (if (or (= counter n) (null? xs)) (cons (reverse ys) xs)
        (loop (cdr xs) (cons (car xs) ys) (+ counter 1))))
  (loop l '() 0))