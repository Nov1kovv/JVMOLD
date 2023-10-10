package org.example.basic;

public class Ternary {
    public static void main(String[] args) {
        int a = 1, b = 2, max = 0;

        //Переменной max, присваиваю возвращаемое значение тернарного оператора

        max = (a > b) ? a : b; //если a > b, то ВЕРНУТЬ: а ИНАЧЕ: вернуть b.
        System.out.println(max);
    }
}
