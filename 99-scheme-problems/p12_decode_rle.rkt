(define (accumulate op nv start end term next)
  (if (> start end) nv
      (op (term start) (accumulate op nv (next start) end term next))))

(define (repeat x n)
  (accumulate cons '() 1 n (lambda (i) x) (lambda (i) (+ i 1))))

(define (foldr op nv xs)
  (if (null? xs) nv
      (op (car xs) (foldr op nv (cdr xs)))))

(define (decode-rle xs)
  (foldr (lambda (x y) (append (repeat (cdr x) (car x)) y)) '() xs))