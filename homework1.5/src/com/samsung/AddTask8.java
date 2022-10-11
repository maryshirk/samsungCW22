package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class AddTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = (x >= 0 && y <= 1 && ((y >= 0 && y >= x - 1) || (y < 0 && x * x + y * y <= 1))) ? "YES" : "NO";
        System.out.println(res);
    }
}
