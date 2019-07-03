/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
package com.example.modul2.onearrays;

import java.util.Scanner;

public class OneArrays2 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int count = 0;
        double z;
        double[] mas = new double[8];

        Scanner s =  new Scanner(System.in);
        System.out.println("write number z: ");
        z = s.nextDouble();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random()*(20 - (-15))) + (-15);
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%7.2f", mas[i]);
            System.out.print(" | ");
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                count++;
            }
        }

        System.out.println("\nchange mas= ");

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%7.2f", mas[i]);
            System.out.print(" | ");
        }

        System.out.println("\nnumber of replacements = " + count);
    }
}
