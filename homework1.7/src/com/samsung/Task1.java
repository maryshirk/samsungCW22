package com.samsung;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        if (n > 10) {
            s += n;
        }
        while (n % 5 != 0) {
            n = scanner.nextInt();
            if (n > 10) {
                s += n;
            }
        }
        System.out.println(s);
    }
}