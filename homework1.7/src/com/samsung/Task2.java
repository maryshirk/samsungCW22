package com.samsung;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        while (n >= 0) {
            n = scanner.nextInt();
            count++;
        }
        System.out.println(count);
    }
}