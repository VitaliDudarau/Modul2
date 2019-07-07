/*
5. Сформировать квадратную матрицу порядка n по заданному
 образцу(n - четное):
 1    1    1    ...    1    1    1
 2    2    2    ...    2    2    0
 3    3    3    ...    3    0    0
...  ...  ...   ...   ...  ...  ...
n-1  n-1   0    ...    0    0    0
 n    0    0    ...    0    0    0
*/
package com.example.modul2.arraytwo;

public class ArrayTwo5 {

    public static void main(String[]args) {

        int help = 1;
        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr[i].length - i); j++) {
                arr[i][j] = help;
            }
            help++;
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