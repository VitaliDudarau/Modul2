/*
7. Сформировать квадратную матрицу порядка N по правилу:
A[I,J] = sin((I^2-J^2)/N)
и подсчитать количество положительных элементов в ней.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo7 {
    public static void main(String[]args) {

        int n = 3;
        double sum = 0;
        double[][] arr = new double[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }

        System.out.println("arr[][] = ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                System.out.printf("%6.3f", arr[i][j]);
                System.out.print(" | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.printf("\nsum of positive elements = %6.3f", sum);
    }
}
