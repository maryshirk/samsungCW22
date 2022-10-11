package com.samsung;

import java.util.Scanner;

public class AddTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s3 = Math.max(Math.max(a, b), c);
        int s1 = Math.min(Math.min(a, b), c);
        int s2 = a + b + c - s1 - s3;
        if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2) {
            if (s1 * s1 + s2 * s2 == s3 * s3) {
                System.out.println("right");
            } else if (s1 * s1 + s2 * s2 > s3 * s3) {
                System.out.println("acute");
            } else System.out.println("obtuse");
        } else System.out.println("impossible");
    }
}
