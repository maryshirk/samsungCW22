package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, c = 0;
        double s = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x % 2 != 0) {
                s += x;
                c++;
            }
        }
        if (c == 0) {
            System.out.println("NO");
        } else {
            double ans = s / c;
            System.out.printf(Locale.US, "%.2f", ans);
        }
    }
}
