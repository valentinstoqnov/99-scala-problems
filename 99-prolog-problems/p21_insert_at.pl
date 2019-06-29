insert_at(Y, Xs, 1, [Y|Xs]).
insert_at(Y, [X|Xs], K, [X|Ys]) :- K > 1, K1 is K - 1, insert_at(Y, Xs, K1, Ys).
