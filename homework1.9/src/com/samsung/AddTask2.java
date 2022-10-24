package com.samsung;

public class AddTask2 {
    public static void main(String[] arrgs) {
        System.out.println(min(2, 4, -6, 8));
    }

    public static int min(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int minn = a;
        for (int i : arr) {
            if (i < minn)
                minn = i;
        }
        return minn;
    }
}
