remove_at(X, [X|Xs], 1, Xs).
remove_at(X, [Y|Xs], K, [Y|Ys]) :- K > 1, K1 is K - 1, remove_at(X, Xs, K1, Ys).
