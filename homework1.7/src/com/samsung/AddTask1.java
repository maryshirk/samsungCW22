package com.samsung;

import java.util.Scanner;

public class AddTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ans = 0, n;
        for (int i = 0; i < a; i++) {
            n = scanner.nextInt();
            if (n <= 437) {
                ans = i + 1;
                break;
            }
        }
        if (ans == 0) {
            System.out.println("No crash");
        } else System.out.println("Crash " + ans);
    }
}
