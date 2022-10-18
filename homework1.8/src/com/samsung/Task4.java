package com.samsung;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 4;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = c;
            c += 3;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
