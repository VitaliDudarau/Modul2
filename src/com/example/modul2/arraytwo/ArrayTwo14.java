/*
14. Сформировать случайную матрицу m x n,
состоящую из нулей и единиц, причем в каждом
столбце число единиц равно номеру столбца.
*/
package com.example.modul2.arraytwo;

import java.util.Scanner;

public class ArrayTwo14 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int m, n;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("write number of lines: ");
            m = s.nextInt();
            System.out.println("write number of columns which more or equals number lines: ");
            n = s.nextInt();
        }while (m < n || m <= 0 || n <= 0);

        int[][] arr = new int[n][n];

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