/*
1. В массив A [N] занесены натуральные числа.
Найти сумму тех элементов, которые кратны данному К.

 */
package com.example.modul2.onearrays;

import java.util.Scanner;

public class OneArrays1 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int k, sum = 0;
        int[] mas = new int[6];

        Scanner s =  new Scanner(System.in);
        System.out.println("write divider k:");
        k = s.nextInt();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*(10 - 1 + 1)) + 1;
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i]%k == 0) {
                sum += mas[i];
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " | ");
        }

        System.out.println("\nsum = " + sum);

    }
}
