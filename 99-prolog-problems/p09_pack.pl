pack([], []).
pack([X|L], [H|T]) :- move(X, L, H, Ys), pack(Ys, T).

%move(X, L, Xs, Ys).

move(X, [], [X], []).
move(X, [Y|Ys], [X], [Y|Ys]) :- X \= Y.
move(X, [X|L], [X|Xs], Ys) :- move(X, L, Xs, Ys).
