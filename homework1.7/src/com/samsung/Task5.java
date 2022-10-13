package com.samsung;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 1;
        while (n / 2 >= 1) {
            n /= 2;
            c++;
        }
        System.out.println(c);
    }
}
