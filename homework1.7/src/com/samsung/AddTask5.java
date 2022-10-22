package com.samsung;

import java.util.Scanner;

public class AddTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        System.out.println(s);
    }
}