rotate(Xs, N, Ys) :- length(Xs, LXs),
					 ((N >= 0, NXs is N mod LXs) ; (N < 0, NXs is -((-N) mod LXs))),
					 rotate_left(Xs, LXs, NXs, Ys).

rotate_left(Xs, _, N, Ys) :- N >= 0, split_pairs(Xs, N, Z1s, Z2s), append(Z2s, Z1s, Ys).
rotate_left(Xs, LXs, N, Ys) :- N < 0, N1 is LXs + N, split_pairs(Xs, N1, Z1s, Z2s), append(Z2s, Z1s, Ys). 

