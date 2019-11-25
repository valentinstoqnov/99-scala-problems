#lang racket

(define (range-l a b)
  (define (loop a b acc)
    (if (> a b) (reverse acc)
        (loop (+ a 1) b (cons a acc))))
  (if (> a b) (reverse (loop b a '()))
      (loop a b '())))