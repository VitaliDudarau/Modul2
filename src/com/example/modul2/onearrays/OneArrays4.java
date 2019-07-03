/*
4. Даны действительные числа а1 ,а2 ,..., аn .
Поменять местами наибольший и наименьший элементы.
 */
package com.example.modul2.onearrays;

public class OneArrays4 {

    public static void main(String[]args) {

        int index_min = 6, index_max = 0;
        double min = 15, max = -10, help;
        double[] mas = new double[7];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random()*(15 - (-10))) + (-10);
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%6.2f", mas[i]);
            System.out.print(" | ");
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                index_min = i;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                index_max = i;
            }
        }

        help = mas[index_min];
        mas[index_min] = mas[index_max];
        mas[index_max] = help;

        System.out.println("\nchange mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%6.2f", mas[i]);
            System.out.print(" | ");
        }
    }
}
