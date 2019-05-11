compress([], []).
compress([X], [X]).
compress([X, X|T], R) :- compress([X|T], R).
compress([X, Y|T], [X|RT]) :- X \= Y, compress([Y|T], RT).
