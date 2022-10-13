package com.samsung;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        while (a - b >= 0) {
            a -= b;
            c++;
        }
        System.out.println(c + " " + a);
    }
}
