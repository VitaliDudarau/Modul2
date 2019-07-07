/*
10. Найти положительные элементы главной
диагонали квадратной матрицы.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo10 {

    public static void main(String[]args) {

        int count = 0;
        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(9 - (-14) + 1)) + (-14);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        System.out.println("main diagonal is: ");
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
        }

        System.out.println("\n********************************" +
                "*********************************************" +
                "*********************************************");
        System.out.println("positive elements of main diagonal is: ");

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i][j] > 0) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("not");
        }

    }
}
