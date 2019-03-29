kth(X, [X|_], 1).
kth(X, [_|T], K) :- K1 is K - 1, kth(X, T, K1).
