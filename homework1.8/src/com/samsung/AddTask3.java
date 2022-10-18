package com.samsung;

import java.util.Scanner;

public class AddTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array1 = new int[n][n];
        int[][] array2 = new int[n][n];
        int c = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array1[i][j] = c;
                c++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array1[i][j] == array2[i][j]) {
                    System.out.print(array1[i][j] + " ");
                }
            }
        }
    }
}