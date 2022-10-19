package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = sum(a, b);
        System.out.println(res);
        System.out.println(max(a, b));

        int[] arr = {10, 19, -23, 12435};
        printArray(arr);
        System.out.println(printArr(arr));

        /*for (int i : arr) {
            System.out.println(i);
        }*/
    }

    public static int sum(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static String printArr(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i : arr) {
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}