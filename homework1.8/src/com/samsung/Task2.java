package com.samsung;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0, x, c = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x % 2 == 0) {
                ans += x;
                c++;
            }
        }
        if (c == 0) {
            System.out.println("NO");
        } else {
            System.out.println(ans);
        }
    }
}
