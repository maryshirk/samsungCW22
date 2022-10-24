package com.samsung;

import java.util.Scanner;

public class Add2Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int maxx = array[0];
        for (int i : array) {
            if (i > maxx)
                maxx = i;
        }
        System.out.println(maxx);
    }
}
