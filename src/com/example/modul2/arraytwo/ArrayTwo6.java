/*
6. Сформировать квадратную матрицу порядка n по заданному
 образцу(n - четное):
 1    1    1    ...    1    1    1
 0    1    1    ...    1    1    0
 0    0    1    ...    1    0    0
...  ...  ...   ...   ...  ...  ...
 0    0    1    ...    1    0    0
 0    1    1    ...    1    1    0
 1    1    1    ...    1    1    1
*/
package com.example.modul2.arraytwo;

public class ArrayTwo6 {

    public static void main(String[]args) {

        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = (arr.length / 2 - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = (arr.length - 2); i >= (arr.length / 2); i--) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = (arr.length / 2 - 1); i > 0; i--) {
            for (int j = (arr.length - 1); j >= arr.length - i; j--) {
                arr[i][j] = 0;
            }
        }

        for (int i = (arr.length - 2); i >= (arr.length / 2); i--) {
            for (int j = (arr.length - 1); j > i; j--) {
                arr[i][j] = 0;
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