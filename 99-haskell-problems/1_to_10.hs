myLast :: [a] -> a
myLast []     = error "myLast called on empty list"
myLast [x]    = x
myLast (_:xs) = myLast xs

myButLast :: [a] -> a
myButLast []     = error "myButLast called on empty list"
myButLast [_]    = error "myButLast called on singleton"
myButLast [x, _] = x
myButLast (_:xs) = myButLast xs

elemAt :: [a] -> Int -> a
elemAt [] _     = error "Index out of bounds"
elemAt (x:_) 1  = x
elemAt (_:xs) n 
  | n < 1      = error "Index out of bounds" 
  | otherwise  = elemAt xs (n - 1)

myLength :: [a] -> Int
myLength []     = 0
myLength (_:xs) = 1 + myLength xs

myReverse :: [a] -> [a]
myReverse []     = []
myReverse (x:xs) = myReverse xs ++ [x]

isPalindrome :: (Eq a) => [a] -> Bool
isPalindrome []     = True
isPalindrome [_]    = True
isPalindrome (x:xs) = x == (last xs) && isPalindrome (init xs)
