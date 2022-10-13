package com.samsung;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        if (n < 10 && n % 2 != 0) {
            c = n;
        }
        while (n / 10 >= 1) {
            if ((n % 10) % 2 != 0) {
                c = n % 10;
                break;
            }
            n /= 10;
        }
        if (c > 0) {
            System.out.println(c);
        } else {
            if ((n % 10) % 2 != 0) {
                System.out.println(n % 10);
            } else System.out.println("NO");
        }
    }
}
