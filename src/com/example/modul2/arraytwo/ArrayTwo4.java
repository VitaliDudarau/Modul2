/*
4. Сформировать квадратную матрицу порядка n по заданному
 образцу(n - четное):
 1    2    3    ...    n
 n   n-1  n-2   ...    1
 1    2    3    ...    n
 n   n-1  n-2   ...    1
...  ...  ...   ...   ...
 n   n-1  n-2   ...    1
*/
package com.example.modul2.arraytwo;

public class ArrayTwo4 {

    public static void main(String[]args) {

        int[][] arr = new int[7][7];

        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int i = 1; i < arr.length; i += 2) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i].length - j;
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