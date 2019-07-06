/*
1. Дана матрица. Вывести на экран все нечетные столбцы,
у которых первый элемент больше последнего.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo1 {

    public static void main(String[]args) {

        int count = 0;
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(9 - (-9) + 1)) + (-9);
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

        for (int j = 0; j < arr[0].length; j += 2) {
            if (arr[0][j] > arr[arr.length-1][j]) {
                count++;
                System.out.println("column " + j + ":");
                System.out.println("----------------");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("[" + i + "][" + j + "] = " + arr[i][j]);
                }
                System.out.println("----------------");
            }
        }

        if (count == 0) {
            System.out.println("no required columns");
        }
    }
}
