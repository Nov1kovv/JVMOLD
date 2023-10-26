package org.example.basic;

public class Cycle {
    public static void main(String[] args) {

        // Цикл - управляющая конструкция, предназначенная для многократного исполнения набора инструкций.
        // Итерация - один проход цикла.

        // while - цикл выполняется до тех пор, пока условие истинно.
        int counterOne = 0;
        while (counterOne <= 3){
            counterOne++;
            System.out.println("Counter" + counterOne);
        }

        // do-while - цикл, в котором условие проверяется после выполнения тела цикла. Тело цикла выполняется хотя бы 1 раз.

        int counterTwo = 0;
            do {
                counterTwo++;
                System.out.println("Counter "+ counterTwo);
            } while (counterTwo <3 );
        System.out.println("Произведено " + counterTwo + " итераций.");


        // for - цикл, в котором переменная это счетчик итераций цикла, с определенным шагом, изменяет свое значение
        // до заданного конечного значения.

        for(int counterThree = 0; counterThree < 3; counterThree++) {

            System.out.println("Counter " + counterThree);
        }
    }
}

// TODO: 10/15/2023 разобрать foreach. 