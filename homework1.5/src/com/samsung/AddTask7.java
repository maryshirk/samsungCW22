package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class AddTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = ((x <= 0 && y >= 1 - x && y >= 2 * x * x) || (x > 0 && y >= 1 - x && x <= 1)) ? "YES" : "NO";
        System.out.println(res);
    }
}
