/*
13. Отсотрировать стобцы матрицы по возрастанию
и убыванию значений эементов.
 */
package com.example.modul2.arraytwo;

public class ArrayTwo13 {

    public static void main(String[]args) {

        int help;
        int[][] arr = new int[7][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(16 - (-12) + 1)) + (-12);
            }
        }

        System.out.println("arr[i][j] = ");
        System.out.println("********************************" +
                "*********************************************" +
                "*********************************************");

        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i  = 0; i < (arr.length - 1); i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k][j] < arr[i][j]) {
                        help = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = help;
                    }
                }
            }
        }

        System.out.println("arr[i][j] with columns are ascending = ");
        System.out.println("********************************" +
                "*********************************************" +
                "*********************************************");


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i  = 0; i < (arr.length - 1); i++) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k][j] > arr[i][j]) {
                        help = arr[i][j];
                        arr[i][j] = arr[k][j];
                        arr[k][j] = help;
                    }
                }
            }
        }

        System.out.println("arr[i][j] with columns are descending = ");
        System.out.println("********************************" +
                "*********************************************" +
                "*********************************************");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }
    }
}
