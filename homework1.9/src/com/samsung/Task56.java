package com.samsung;

public class Task56 {
    public static void main(String[] args) {
        int[] arr = {-8, 15, 86457};
        System.out.println(avgOf4Digit(arr));
        int[] arr2 = {8, 7, 5, 4, 2};
        for (int i : minToBegin(arr2)) {
            System.out.print(i + " ");
        }
    }
    public static double avgOf4Digit(int[] array) {
        double s = 0;
        int c = 0;
        for (int i : array) {
            if (999 < i && i < 10000) {
                s += i;
                c++;
            }
        }
        if (c > 0) {
            return s / c;
        }
        else {
            return -1.0d;
        }
    }

    public static int[] minToBegin(int[] array) {
        int uq = 0, minn = array[0], temp = array[0], t;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minn) {
                minn = array[i];
                uq = i;
            }
        }
        array[0] = array[uq];
        for (int i = 1; i < uq + 1; i++) {
            t = array[i];
            array[i] = temp;
            temp = t;
        }
        return array;
    }
}
