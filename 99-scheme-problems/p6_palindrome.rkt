(define (palindrome? xs)
  (equal? (reverse xs) xs))

(palindrome? (list 1 2 3 2 1))
(palindrome? (list))
(palindrome? (list 1 2 3 4 5))
      