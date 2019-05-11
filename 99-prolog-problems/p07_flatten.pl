my_flatten([], []).
my_flatten(L, [L]) :- not(is_list(L)).
my_flatten([H|T], R) :-	my_flatten(H, FH),
						my_flatten(T, FT),
						append(FH, FT, R).
