/*
5. Даны целые числа а1 ,а2 ,..., аn .
Вывести на печать только те числа, для которых аi > i.
 */
package com.example.modul2.onearrays;

public class OneArrays5 {

    public static void main(String[]args) {

        int[] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*(12 - (-8) + 1)) + (-8);
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print("mas[" + i + "] = " + mas[i] + " | ");
        }

        System.out.println("\nnumbers, where mas[i] > i = ");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > i) {
                System.out.print("mas[" + i + "] = " + mas[i] + " | ");
            }
        }
    }
}
