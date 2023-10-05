package org.example.basic;

public class IncDec {
    public static void main(String[] args) {
        //Increment - это увеличение на единицу (++)
        //Pre-increment - увеличение происходит до того как вызывается переменная (++a)
        //Post-increment - увеличение происходит после вызова переменной (a++).

        //Decrement - это уменьшение на единицу (--)
        //Pre-decrement и post-decrement аналогично как и у инкремента.

        byte numberOne = 0;
        System.out.println(numberOne++); //сначала выводим на экран, а потом уже увеличивается на 1.
        System.out.println(numberOne);

        byte numberTwo = 0;
        System.out.println(numberTwo--);
        System.out.println(numberTwo);

        byte numberThree = 2;
        System.out.println(++numberThree);
        System.out.println(numberThree);

    }
}
