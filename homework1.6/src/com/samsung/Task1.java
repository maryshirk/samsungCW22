package com.samsung;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0 && n < 10) {
            System.out.println("DIGIT");
        }
        else if (n >= 10 && n < 100) {
            System.out.println("NUM");
        }
        else {
            System.out.println("OTHER");
        }
    }
}
