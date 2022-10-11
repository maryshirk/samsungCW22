package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ddfhhdhter");  // с переходом на новую строку
        System.out.print("dhbghdfbgg");  // без перехода на новую строку
        System.out.print("dgdhsryjh" + "\n");  // организация перехода на новую строку
        // \t - табуляция
        double aDouble = 3.1415161732874;
        System.out.printf("3 знака: %.3f | 5 знаков: %.5f", aDouble, aDouble);

        /*while (n < 100) {
            System.out.println(n);
            n++;
        }

        do {
            System.out.println();
        } while (n < 100);*/

        int a;
        int c = 0;
        do {
            a = scanner.nextInt();
            c++;
        } while (a >= 0);
        System.out.println(c);

        int n = scanner.nextInt();
        int count = 1;
        while (n >= 0) {
            n = scanner.nextInt();
            count++;
        }
        System.out.println(count);

        int m = scanner.nextInt();
        while (m < 100) {
            m++;
            if (m == 71) continue;
            System.out.println(m);
        }

        int k = scanner.nextInt();
        while (k < 100) {
            k += Math.random() * 10;
            System.out.println(k);
            if (k == 50) break;
        }

        scanner.close();
    }
}