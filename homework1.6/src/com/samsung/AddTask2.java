package com.samsung;

import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n > 0 && n <= 12 && m > 0) {
            if (n == 2 && m != 28) {
                System.out.println(-1);
            } else if ((n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) && m != 31) {
                System.out.println(-1);
            } else if (m != 30) {
                System.out.println(-1);
            } else {

            }
        } else System.out.println(-1);
    }
}
