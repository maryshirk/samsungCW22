package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        String res = (x >= 3 && x <= 8) ? "true" : "false";
        System.out.println(res);
    }
}