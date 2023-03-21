package com.samsung;


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
        int[] a = {1, 4, 2, 8, 9};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("===============");
        int[] b = {1, 4, 2, 8, 9};
        insertionSort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}