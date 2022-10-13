package com.samsung;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        while (n > 9 && n < 100) {
            s += n / 10 + n % 10;
            n = scanner.nextInt();
        }
        System.out.println(s);
    }
}
