/*
7. Даны действительные числа a1, a2, ..., an.
Найти max( a1 + a2n, a2 + a2n−1, ..., an + an+1).
 */
package com.example.modul2.onearrays;

public class OneArrays7 {

    public static void main(String[]args) {

        int indexMax1 = 0, indexMax2 = 0;
        double sum = 0, sumMax = -23;
        double[] mas = new double[12];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random()*(18 - (-11))) + (-11);
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print("[" + i + "] = ");
            System.out.printf("%6.2f", mas[i]);
            System.out.print(" | ");
        }

        for (int i = 0, j = (mas.length - 1); i <= (mas.length / 2) && j >= (mas.length / 2); i++, j--) {
             sum = mas[i] + mas[j];
             System.out.print("\nmas[" + i + "] + mas[" + j + "] = ");
             System.out.printf("%6.2f", sum);
             if (sum > sumMax) {
                 sumMax = sum;
                 indexMax1 = i;
                 indexMax2 = j;
             }
        }

        System.out.print("\n\nsumMax = mas[" + indexMax1 + "] + mas[" + indexMax2 + "] = ");
        System.out.printf("%6.2f", sumMax);
    }
}
