#lang racket

(define (rotate l n)
  (define (loop xs counter acc)
    (cond ((or (null? xs) (= 0 counter)) (append xs (reverse acc)))
          (else (loop (cdr xs) (- counter 1) (cons (car xs) acc)))))

  (if (>= n 0) (loop l n '())
      (reverse (loop (reverse l) (abs n) '()))))