/*
8. Дана последовательность целых чисел a1, a2, ..., an.
Образовать новую последовательность, выбросив из исходной
те члены, которые равны ) min(a1, a2, ..., an).
 */
package com.example.modul2.onearrays;

public class OneArrays8 {

    public static void main(String[]args) {

        int min = 5, indexMin = 11, b = 0, count = 0;
        int[] arr, arr1;
        arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(5 - (-3) + 1)) + (-3);
        }

        System.out.println("array = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "] = " + arr[i] + " | ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
               min = arr[i];
               indexMin = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min || arr[i] > min) {
                count++;
            }
        }

        arr1 = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min || arr[i] > min) {
               arr1[b] = arr[i];
               b++;
            }
        }

        System.out.println("\narray1 is without minimum elements (" + min + ") = ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("[" + i + "] = " + arr1[i] + " | ");
        }
    }
}