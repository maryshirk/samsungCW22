package com.samsung;

import java.util.Scanner;

public class AddTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0, c = 2;
        while (i < n) {
            System.out.print(c + " ");
            c += 2;
            i++;
        }
    }
}