package com.samsung;

import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n > 0 && n <= 12 && m > 0) {
            if (n == 2 && m > 28) {
                System.out.println(-1);
            } else if ((n == 2 || n == 4 || n == 6 || n == 9 || n == 11) && m > 30) {
                System.out.println(-1);
            } else if (m > 31) {
                System.out.println(-1);
            } else {
                switch (n) {
                    case 1:
                        System.out.println(334 + (31 - m));
                        break;
                    case 2:
                        System.out.println(306 + (28 - m));
                        break;
                    case 3:
                        System.out.println(275 + (31 - m));
                        break;
                    case 4:
                        System.out.println(245 + (30 - m));
                        break;
                    case 5:
                        System.out.println(214 + (31 - m));
                        break;
                    case 6:
                        System.out.println(184 + (30 - m));
                        break;
                    case 7:
                        System.out.println(153 + (31 - m));
                        break;
                    case 8:
                        System.out.println(122 + (31 - m));
                        break;
                    case 9:
                        System.out.println(92 + (30 - m));
                        break;
                    case 10:
                        System.out.println(61 + (31 - m));
                        break;
                    case 11:
                        System.out.println(31 + (30 - m));
                        break;
                    case 12:
                        System.out.println(31 - m);
                        break;
                }
            }
        } else System.out.println(-1);
    }
}
