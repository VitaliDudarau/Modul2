/*
3.  Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
package com.example.modul2.onearrays;

public class OneArrays3 {

    public static void main(String[]args) {

        int count_minus = 0, count_plus = 0, count_zero = 0;
        double[] mas = new double[12];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random()*(15 - (-10))) + (-10);
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%6.2f", mas[i]);
            System.out.print(" | ");
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                count_zero++;
            }else {
                if (mas[i] < 0) {
                    count_minus++;
                }else {
                    count_plus++;
                }
            }
        }

        System.out.println("\nnumber of minus = " + count_minus);
        System.out.println("number of plus = " + count_plus);
        System.out.println("number of zero = " + count_zero);

    }
}
