package com.samsung;

import java.util.Scanner;

public class AddTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 12 && n > 0) {
            if (n == 2) {
                System.out.println(28);
            } else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
                System.out.println(31);
            } else System.out.println(30);
        } else System.out.println(0);
    }
}
