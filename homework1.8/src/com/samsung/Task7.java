package com.samsung;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array0 = new int[n];
        int[] array1 = new int[n];
        int c0 = 0, c1 = 0, x;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x >= 0) {
                array1[c1] = x;
                c1++;
            } else {
                array0[c0] = x;
                c0++;
            }
        }
        for (int i = 0; i < c0; i++) {
            System.out.print(array0[i] + " ");
        }
        for (int i = 0; i < c1; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
