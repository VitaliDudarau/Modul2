/*
6. Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
package com.example.modul2.onearrays;

public class OneArrays6 {

    public static void main(String[]args) {

        int count = 0;
        double sum = 0;
        double[] mas = new double[14];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (Math.random()*(20 - (-12))) + (-12);
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print("[" + i + "] = ");
            System.out.printf("%6.2f", mas[i]);
            System.out.print(" | ");
        }

        System.out.print("\narray elements with simple indexes :");

        for (int i = 2; i < mas.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 ) {
                sum += mas[i];
                System.out.print("\n[" + i + "] = ");
                System.out.printf("%6.2f", mas[i]);
            }else {
                count = 0;
            }
        }

        System.out.print("\nsum = ");
        System.out.printf("%6.2f", sum);
    }
}
