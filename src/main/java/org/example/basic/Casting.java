package org.example.basic;

public class Casting {
    public static void main(String[] args) {
        //Преобразования типа (Casting) - преобразование значения переменной одного типа значение другого типа.
        //Выделают явное и неявное преобразование типов.

        //Неявное преобразование - преобразование меньшего типа в больший.
        byte byteValOne = 127;
        int intValueOne = 3000000;
        intValueOne = byteValOne;

        System.out.println(intValueOne);

        //Неявное преобразование типа int в тип float
        int intValueTwo = 1000;
        float floatValueOne = 0f;
        floatValueOne = intValueTwo;

        System.out.println(floatValueOne);



        //Явное преобразование - преобразование большего типа в меньший.
        //При преобразовании вещественного в целочисленный тип могут быть потери точности.

        //Явное преобразование float в int
        float floatValueTwo = 10.5F;
        int intValueThree = 0;
        intValueThree = (int)floatValueTwo;

        System.out.println(intValueThree);

    }
}
