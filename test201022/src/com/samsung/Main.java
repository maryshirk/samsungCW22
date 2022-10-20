package com.samsung;

public class Main {
    public static void main(String[] args) {
        /*int[][] arr = {
                {1, 2, 16},
                {9, 8, 77},
                {-88, 77, 8}
        };

        System.out.println(arr[1][2]);  // => 77*/
        // int[][] = new int[5][];

        int[][] arr = new int[6][6];
        fill_Array(arr, 100);

        print_Array(arr);

        // вывод главной диагонали
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i] + " ");
        }

        // или
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) System.out.print(arr[i][j] + "");
            }
        }*/

    }

    public static void fill_Array(int[][] arr, int limit) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * limit);
            }
        }
    }

    public static void print_Array(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print('\n');
        }
    }
}