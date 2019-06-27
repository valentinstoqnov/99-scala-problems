slice(Xs, A, B, Ys) :- slice(Xs, A, B, Ys, 1).

slice([], _, _, [], _).
slice(_, A, B, [], I) :- I > B.
slice([X|Xs], A, B, [X|Ys], I) :- I >= A, I =< B, I1 is I + 1, slice(Xs, A, B, Ys, I1).
slice([_|Xs], A, B, Ys, I) :- I < A, I =< B, I1 is I + 1, slice(Xs, A, B, Ys, I1).
