#lang racket

(define (slice l i k)
  (define (loop xs counter acc)
    (cond ((or (null? xs) (> counter k)) (reverse acc))
          ((< counter i) (loop (cdr xs) (+ 1 counter) acc))
          (else (loop (cdr xs) (+ 1 counter) (cons (car xs) acc)))))
  (loop l 1 '()))