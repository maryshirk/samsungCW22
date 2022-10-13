package com.samsung;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c, a;
        boolean flag = true;
        while (flag) {
            n++;
            c = 0;
            a = 2;
            while (a <= Math.sqrt(n)) {
                if (n % a == 0) {
                    c++;
                    break;
                }
                a++;
            }
            if (c == 0) {
                System.out.println(n);
                break;
            }
        }
    }
}
