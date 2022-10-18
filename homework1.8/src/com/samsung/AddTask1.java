package com.samsung;

import java.util.Scanner;

public class AddTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[2 * n];
        int c = 0;
        while (n != 0) {
            array[c] = n % 2;
            n /= 2;
            c++;
        }
        for (int i = 0; i < c; i++) {
            System.out.print(array[i]);
        }
    }
}
