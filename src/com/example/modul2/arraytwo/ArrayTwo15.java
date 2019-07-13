/*
15. Найдите наибольший элемент матрицы и
заменить все нечетные элементы на него.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo15 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int m = 21, n = -19, max = n;
        int[][] arr = new int[3][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(m - n + 1)) + n;
            }
        }

        System.out.println("arr[][] = ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
            }
        }

        System.out.println("maximum = " + max);
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");
        System.out.println("changed arr[][] = ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }
    }
}