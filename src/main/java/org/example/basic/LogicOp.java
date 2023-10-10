package org.example.basic;

public class LogicOp {
    public static void main(String[] args) {

        // Конъюнкция - (& &) логическая операция, по своему применению максимально приближена к союзу "И".
        // true  & & true = true           true  & & false = false
        // false  & & false = false        false  & & true = false


        // Побитовое "И" - бинарная операция (&), действие которой эквивалентно применению логического "И"
        // к каждой паре битов, которые стоят на одинаковых позициях в двоичных представлениях операндов.
        //Таблица истинности такая же, как и конъюнкции: пример 1 & 1 = 1, 1 & 0 = 0


        // Дизъюнкция - логическая операция (||), по своему применению приближена к союзу "ИЛИ".
        //true || true = true              true || false = true
        //false || true = false            false || true = true

        //Побитовое "ИЛИ" - бинарная операция (|) действие которой эквивалентно применению логического "ИЛИ"
        //к каждой паре битов, которые стоят на одинаковых позициях в двоичных представлениях операндов.

        // Исключающее "ИЛИ" - (^) строгая дизъюнкция, булева функция и логическая операция. Результат выполнения операции является
        //истинным только при условии, что один операнд является истинным, а другой ложным.
        //true ^ true = false          true ^ false = true
        //false ^ false = false        false ^ true = true
        //при побитовом ИЛИ таблица истинности аналогичная.

        // Отрицание (!) - унарная операция, пример !true = false , !false = true
        // Побитовое отрицание (~) - пример, ~ 0 = 1, ~ 1 = 0 
    }
}