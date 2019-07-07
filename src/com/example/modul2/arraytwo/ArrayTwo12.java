/*
12.  Отсортировать строки матрицы по возрастанию
и убыванию значений элементов.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo12 {

    public static void main(String[]args) {

        int help;
        int[][] arr = new int[4][9];

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
            System.out.print((i+1) + " line | ");
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < (arr[i].length - 1); j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][k] < arr[i][j]) {
                        help = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = help;
                    }
                }
            }
        }

        System.out.println("arr[i][j] with lines are ascending = ");
        System.out.println("********************************" +
                "*********************************************" +
                "*********************************************");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + " line | ");
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j  = 0; j < (arr[i].length - 1); j++) {
                for (int k = j+1; k < arr[i].length; k++) {
                    if (arr[i][k] > arr[i][j]) {
                        help = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = help;
                    }
                }
            }
        }

        System.out.println("arr[i][j] with lines are descending = ");
        System.out.println("********************************" +
                "*********************************************" +
                "*********************************************");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + " line | ");
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }
    }
}