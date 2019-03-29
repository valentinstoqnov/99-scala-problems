len([], 0).
len([_|T], X) :- len(T, X1), X is X1 + 1.
