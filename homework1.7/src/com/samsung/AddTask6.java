package com.samsung;

import java.util.Scanner;

public class AddTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s;
        boolean f = false;
        while (n != 0) {
            s = n % 10;
            n /= 10;
            if (s == n % 10) {
                f = true;
            }

        }
        if (f) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}