package com.samsung;

import java.util.Scanner;

public class Add2Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : array) {
            if (i > 0)
                c++;
        }
        System.out.println(c);
    }
}
