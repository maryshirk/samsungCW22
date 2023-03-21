package com.samsung;


import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > mas[i+1]){
                int temp = mas[i];
                mas[i] = mas[i+1];
                mas[i+1] = temp;
            }
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int currElem = a[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && a[prevKey] > currElem) {
                a[prevKey + 1] = a[prevKey];
                prevKey--;
            }
            a[prevKey+1] = currElem;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 2, 8, 6};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("===============");
        int[] b = {1, 4, 2, 8, 6};
        insertionSort(b);
        System.out.println(Arrays.toString(b));
    }
}