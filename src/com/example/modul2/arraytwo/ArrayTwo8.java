/*
8. В числовой матрице поменять местами два столбца любых столбца,
т. е. все элементы одного столбца поставить на соответствующие
им позиции другого, а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
*/
package com.example.modul2.arraytwo;

import java.util.Scanner;

public class ArrayTwo8 {

    @SuppressWarnings("resources")
    public static void main(String[]args) {

        int column1, column2, help;
        int[][] arr = new int[4][4];

        Scanner s = new Scanner(System.in);

        do {
            System.out.println("write column1: ");
            column1 = s.nextInt();
            System.out.println("write column 2: ");
            column2 = s.nextInt();
        }while (column1 > arr.length || column2 > arr.length || column1 <= 0
                || column2 <= 0 || column1 == column2);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(12 - (-18) + 1)) + (-18);
            }
        }

        System.out.println("*********************************" +
                "********************************************" +
                "********************************************");
        System.out.println("arr[][] = ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        for (int i = 0; i < arr.length; i++) {
            help = arr[i][column1 - 1];
            arr[i][column1 - 1] = arr[i][column2 - 1];
            arr[i][column2 - 1] = help;
        }

        System.out.println("*********************************" +
                "********************************************" +
                "********************************************");
        System.out.println("changed arr[][] = ");
        System.out.println("---------------------------------------" +
                "-----------------------------------------" +
                "-----------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }
    }
}
