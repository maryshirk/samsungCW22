package com.samsung;

public class Task15 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < a.length; i += 2) {
            for (int j = 0; j < a[0].length; j += 2) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}