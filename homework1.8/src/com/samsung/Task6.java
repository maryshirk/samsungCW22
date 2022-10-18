package com.samsung;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int el = array[0];
        int c = 0;
        int cuq;
        for (int i = 0; i < n; i++) {
            cuq = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] == array[i]) {
                    cuq++;
                }
            }
            if (cuq > c) {
                c = cuq;
                el = array[i];
            }
        }
        System.out.println(el);
    }
}