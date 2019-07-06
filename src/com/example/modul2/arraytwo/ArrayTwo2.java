/*
2. Дана квадратная матрица. Вывести на экран элементы,
стоящие на диагонали.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo2 {

    public static void main(String[]args) {

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(11 - (-8) + 1)) + (-8);
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

        System.out.println("\nmain diagonal is: ");
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
        }
    }
}
