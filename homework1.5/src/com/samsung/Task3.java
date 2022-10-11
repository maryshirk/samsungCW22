package com.samsung;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        String res = (!(x >= -2 && x <= 3) && !(x >= 6 && x <= 9)) ? "true" : "false";
        System.out.println(res);
    }
}
