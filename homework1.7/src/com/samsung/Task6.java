package com.samsung;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 26;
        int s = 26;
        while (a + 2 < n) {
            a += 2;
            s += a;
        }
        System.out.println(s);
    }
}
