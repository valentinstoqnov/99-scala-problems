rev(L, R) :- rev(L, [], R).

rev([], B, B).
rev([H|T], B, R) :- rev(T, [H|B], R). 
