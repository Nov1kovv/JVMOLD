package org.example.basic;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[5];

        for(int i = 0; i < array.length; i++){
            array[i] = i*2;
        }

        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
    // Массив - это именованный набор однотипных переменных расположенный в памяти друг за другом, у каждого элемента массива есть свой индекс.



    // TODO: 10/15/2023 пробежаться по одномерным,двухмерным и трехмерным массивам с помощью for и найти примеры с зубчатыми массивами. 
}
