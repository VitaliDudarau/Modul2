/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых
число 5 встречается три и более раз.
*/
package com.example.modul2.arraytwo;

public class ArrayTwo11 {

    public static void main(String[]args) {

        int count = 0, count1 = 0;
        int[][] arr = new int[10][20];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*(15 - 0 + 1)) + 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + " line | ");
            for (int j  = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println("\n---------------------------------------" +
                    "-----------------------------------------" +
                    "-----------------------------------------");
        }

        System.out.print("required lines are ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print("\nline " + (i + 1));
                count1++;
            }
            count = 0;
        }
        if (count1 == 0) {
            System.out.print("not");
        }
    }
}
