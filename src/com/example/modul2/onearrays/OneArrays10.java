/*
10.  Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй элемент
(освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
 */
package com.example.modul2.onearrays;

public class OneArrays10 {

    public static void main(String[]args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*(10 - (-10) + 1)) + (-10);
        }

        System.out.println("array = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "] = " + arr[i] + " | ");
        }

        for (int i = 1; i < (Math.ceil(arr.length / 2.0)); i++) {
           arr[i] = arr[2*i];
        }

        for (int i = ((int) Math.ceil(arr.length / 2.0)); i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println("\ncompressed array = ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "] = " + arr[i] + " | ");
        }
    }
}