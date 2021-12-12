# Задача 3

В крестиках-ноликах на доске 10x10 побеждает та сторона, которая построит линию из пяти отметок (крестиков или ноликов).

Напишите функцию `int solve3(int[][] a)`, которой передаётся массив 10x10 с полем для игры в крестики-нолики. На поле крестики отмечаются как `1`, нолики - как `-1`, а пустые клетки - как `0`.

Функция должна вернуть:
- число `+1ijkl`, если самая длинная линия состоит из крестиков и проходит от клетки с индексами `(i,j)` до клетки с индексами `(k,l)`; 
- число `-1ijkl`, если самая длинная линия состоит из ноликов и проходит от клетки с индексами `(i,j)` до клетки с индексами `(k,l)`; 
- число `+ij`, если в клетке `(i,j)` находится число, отличное от `-1, 0, 1`;
- число `0`, если поле пустое.

(рекомендуется написать дополнительные вспомогательные функции)

Если подходят несколько условий, можно вернуть любой подходящий ответ.

Для следующего поля, где `O` и `X` обозначают, соответственно, `-1` и `1`, `#` обозначает `9`, а пробел - `0`, функция может вернуть: 10131, 10134, -14144 или 75.

```
   0123456789
  +----------+
0 | X        |
1 | XX       |
2 | X X      |
3 | X  X     |
4 | OOOO     |
5 |          |
6 |          |
7 |     #    |
8 |          |
9 |          |
  +----------+
```
