package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class AddTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = (y < 2 - x * x && ((x >= 0 && y >= 0) || (x < 0 && y >= x))) ? "YES" : "NO";
        System.out.println(res);
    }
}
