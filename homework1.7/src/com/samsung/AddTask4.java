package com.samsung;

import java.util.Scanner;

public class AddTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int n = 10000;
        boolean f = true;
        while (n < 100000) {
            if (n % a == b && n % c == d) {
                System.out.print(n + " ");
                f = false;
            }
            n++;
        }
        if (f) {
            System.out.println(-1);
        }
    }
}