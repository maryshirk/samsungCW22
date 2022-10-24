package com.samsung;

public class AddTask1 {
    public static void main(String[] arrgs) {
        System.out.println(trianglePerimetr(-15809, 20304, 18912, -10503, 10020, 22779));
        System.out.println(segmentLength(-15809, 20304, 18912, -10503));
    }
    public static double segmentLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3) {
        return segmentLength(x1, y1, x2, y2) + segmentLength(x2, y2, x3, y3) + segmentLength(x3, y3, x1, y1);
    }
}
