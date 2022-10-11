package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class AddTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = (x * x + y * y <= 1 && ((x >= 0) || (x < 0 && (y >= -x || y <= x)))) ? "YES" : "NO";
        System.out.println(res);
    }
}
