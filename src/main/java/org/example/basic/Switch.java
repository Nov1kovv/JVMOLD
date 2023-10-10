package org.example.basic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Введите число");

        // Принимаем ввод от пользователя
        Scanner in = new Scanner(System.in);
        String number = in.next();

        switch (number) {
            case "1": {
                System.out.println("Один");
                break;
            }
                case "2":{
                    System.out.println("Два");
                    break;
                }
            default:{
                System.out.println("Неверное число");
                break;
            }
            }
        }
    }

