package com.samsung;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                ans = i + 1;
                break;
            }
        }
        if (ans == 0) {
            System.out.println("NO");
        } else {
            System.out.println(ans);
        }
    }
}