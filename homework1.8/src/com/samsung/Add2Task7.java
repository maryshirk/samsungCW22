package com.samsung;

import java.util.Scanner;

public class Add2Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int uq = array[0];
        for (int i = 0; i < n - 1; i++) {
            if (uq != array[i + 1]) {
                uq = array[i + 1];
                c++;
            }
        }
        System.out.println(c);
    }
}
