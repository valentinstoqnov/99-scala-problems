penultimate(X, [X, _]).
penultimate(X, [_, H|T]) :- penultimate(X, [H|T]).
