package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = ((y > 0) && (y < 0.5) && (x > 0) && (x < Math.PI) && (y <= Math.sin(x))) ? "YES" : "NO";
        System.out.println(res);
    }
}
