package com.samsung;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        String res = (a == -b || a == -c || a == -d || b == -c || b == -d || c == -d) ? "true" : "false";
        System.out.println(res);
    }
}
