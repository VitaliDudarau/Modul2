/*
16.  Магическим квадратом порядка n называется квадратная матрица
размера nxn, составленная из чисел 1, 2, 3, ..., n^2 так,
что суммы по каждому столбцу, каждой строке и каждой из двух
больших диагоналей равны между собой. Построить такой квадрат.
Пример магического квадрата порядка 3:
    6   1   8
    7   5   3
    2   9   4
*/
package com.example.modul2.arraytwo;

public class ArrayTwo16 {

    public static void main(String[]args) {

        boolean magic = true;
        int help = 1, sum = 0, n = 3, sumMagic = 0;
        int[][] arr = new int[n][n];

        for(int i = 1; i <= n*n; i++) {
            sumMagic += i;
        }
        sumMagic /= 3;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = help;
                help++;
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

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sumMagic != sum) {
                sum = 0;
                magic = false;
                break;
            }
            sum = 0;
            System.out.println("2");
        }

        if (magic == true){
            for (int j = 0; j < arr[0].length; j++) {
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][j];
                }
                if (sumMagic != sum) {
                    sum = 0;
                    magic = false;
                    break;
                }
                sum = 0;
            }
            System.out.println("3");
        }

        if (magic == true){
            for (int i = 0, j = 0; i < arr.length; i++, j++) {
                sum += arr[i][j];
            }
            if (sumMagic != sum) {
                magic = false;
            }
            sum = 0;
            System.out.println("4");
        }


        if (magic == true){
            for (int i = 0, j = arr[i].length - 1; i < arr.length; i++, j--) {
                sum += arr[i][j];
            }
            if (sumMagic != sum) {
                magic = false;
            }
            sum = 0;
            System.out.println("5");
        }


        if (magic == true) {
            System.out.println("magic arr[i][j] = ");
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
        }else {
            System.out.println("it is not magic square");
            System.out.println("---------------------------------------" +
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