package com.samsung;

import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int res = 0;
        int a = Math.abs(n1);
        int b = Math.abs(n2);
        for (int i = 0; i < a; i++) {
            res += b;
        }
        System.out.println(n1 < 0 ^ n2 < 0 ? -res : res);
    }
}
