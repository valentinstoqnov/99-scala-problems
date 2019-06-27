dupli_n(Xs, N, Ys) :- dupli_n(Xs, N, Ys, N).

dupli_n([], _, [], _).
dupli_n([_|Xs], N, Ys, 0) :- dupli_n(Xs, N, Ys, N).
dupli_n([X|Xs], N, [X|Ys], K) :- K > 0, K1 is K - 1, dupli_n([X|Xs], N, Ys, K1).
