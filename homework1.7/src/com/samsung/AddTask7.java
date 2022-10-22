package com.samsung;

import java.util.Scanner;

public class AddTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean f = true;
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                f = false;
                break;
            }
            i++;
        }
        if (f) System.out.println("prime");
        else System.out.println("composite");
    }
}