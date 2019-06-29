range(A, A, [A]).
range(A, B, [A|Xs]) :- A < B, A1 is A + 1, range(A1, B, Xs).
