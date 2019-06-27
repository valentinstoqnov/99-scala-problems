drop_n(Xs, N, Ys) :- drop_n(Xs, N, Ys, N).

drop_n([], _, [], _).
drop_n([_|Xs], N, Ys, 1) :- drop_n(Xs, N, Ys, N).
drop_n([X|Xs], N, [X|Ys], K) :- K > 1, K1 is K - 1, drop_n(Xs, N, Ys, K1).
