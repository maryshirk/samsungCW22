package com.samsung;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String res = ((a % 2 == 0 && b % 2 == 0) || (b % 2 == 0 && c % 2 == 0) || (a % 2 == 0 && c % 2 == 0)) ? "true" : "false";
        System.out.println(res);
    }
}
