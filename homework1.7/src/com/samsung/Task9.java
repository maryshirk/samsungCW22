package com.samsung;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m;
        int k = n;
        while (k % 10 == 0) {
            k /= 10;
        }
        m = k % 10;
        while (n / 10 >= 1) {
            if (n % 10 < m && n % 10 != 0) {
                m = n % 10;
            }
            n /= 10;
        }
        if (n % 10 < m) {
            m = n;
        }
        System.out.println(m);
    }
}
