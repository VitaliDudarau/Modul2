/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/
package com.example.modul2.arraytwo;

import java.util.Scanner;

public class ArrayTwo3 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int k, p;
        int[][] arr = new int[6][6];

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("write line k: ");
            k = s.nextInt();
            System.out.println("write column p: ");
            p = s.nextInt();
        }while (k > arr.length || p > arr.length || k <= 0 || p <= 0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(14 - (-15) + 1)) + (-15);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        System.out.println("\nline " + k + " is: ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");

        for (int j = 0; j < arr[k-1].length; j++) {
            System.out.print("[" + (k-1) + "][" + j + "] = " + arr[k-1][j] + " | ");
        }

        System.out.println("\n---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");
        System.out.println("column " + p + " is: ");
        System.out.println("------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "][" + (p-1) + "] = " + arr[i][p-1] + " | ");
        }

        System.out.println("------------------");
    }
}
