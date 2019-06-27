split_pairs([], _, [], []).
split_pairs([X|Xs], N, [X|Ys], Zs) :- N > 0, N1 is N - 1, split_pairs(Xs, N1, Ys, Zs).
split_pairs([X|Xs], 0, Ys, [X|Zs]) :- split_pairs(Xs, 0, Ys, Zs).
