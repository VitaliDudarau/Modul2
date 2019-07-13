/*
15. Найдите наибольший элемент матрицы и
заменить все нечетные элементы на него.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo15 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int m, n;
        int[][] arr = new int[7][8];

        for (int j = arr[0].length - 1; j >= 0; j--) {
            for (int i  = 0; i <= j; i++) {
                arr[i][j] = 1;
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
    }
}