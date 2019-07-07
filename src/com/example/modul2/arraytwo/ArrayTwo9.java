/*
9. Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo9 {

    public static void main(String[]args) {

        int sum = 0, sumMax = 0, columnMax = 0 ;
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(12 - 0 + 1)) + 0;
            }
        }

        System.out.println("arr[][] = ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                columnMax = j + 1;
            }
            sum = 0;
        }

        System.out.println("maximum sum of " + columnMax + " column = " + sumMax);
    }
}
