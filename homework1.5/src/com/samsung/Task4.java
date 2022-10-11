package com.samsung;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = (100 <= n && n <= 999 && n % 5 == 0) ? "true" : "false";
        System.out.println(res);
    }
}
