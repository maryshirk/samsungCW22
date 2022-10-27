package com.samsung;

public class Task16 {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 9};
        rotRight(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void rotRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0 ; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
}
