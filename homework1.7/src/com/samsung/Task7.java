package com.samsung;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 1;
        while (n / 10 >= 1) {
            n /= 10;
            c++;
        }
        System.out.println(c);
    }
}
