package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean aBool = true;
        System.out.println( !aBool );

        int n = scanner.nextInt();
        aBool = 0 < n && n < 10;
        System.out.println(aBool);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println( a > b ? a : b );

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String res = (y > 0 && x * x + y * y > 4 && x < 2 && y < x) ? "YES" : "NO";
        System.out.println(res);

        Math.sin(n);


    }
}