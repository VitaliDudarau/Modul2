/*
8.  В массиве целых чисел с количеством элементов n
найти наиболее часто встречающееся число. Если
таких чисел несколько, то определить наименьшее из них.
 */
package com.example.modul2.onearrays;

public class OneArrays9 {

    public static void main(String[]args) {

        int count = 0, count1 = 1, indexMore = 0;
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(1 - (-1) + 1)) + (-1);
        }

        System.out.println("array = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "] = " + arr[i] + " | ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count ++;
                }
            }
            if (count > count1) {
                count1 = count;
                indexMore = i;
            }else {
                if (count == count1 && arr[indexMore] > arr[i]) {
                    indexMore = i;
                }
            }
            count = 0;
        }

        System.out.println("\nelement, which is most common = " + arr[indexMore] + " (" +  count1 + " times)");
    }
}