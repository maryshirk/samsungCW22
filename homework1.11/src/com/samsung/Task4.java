package com.samsung;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[][] a;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = i * j;
            }
        }
    }
}
