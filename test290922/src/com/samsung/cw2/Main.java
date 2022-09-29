package com.samsung.cw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte aByte = -128;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 200000000000L;

        System.out.println( aByte );
        System.out.println( aShort );
        System.out.println( aInt );
        System.out.println( aLong );

        double aDouble = 8.1234456434556534;
        float aFloat = 8.34342f;

        System.out.println( aFloat );

        /*Scanner in = new Scanner(System.in);
        aDouble = in.nextDouble();*/

        //boolean aBoolean = 3 < 4;
        boolean aBoolean = false;
        System.out.println(aBoolean);

        //char aChar = 97;
        char aChar = 'a';
        System.out.println((char) (aChar + 1));

        int a = 10, b = 5;
        double res;
        res = a + b;
        System.out.println(res);
        res = a - b;
        System.out.println(res);
        res = a * b;
        System.out.println(res);
        res = a / b;
        System.out.println(res);
        res = a % b;
        System.out.println(res);

        int i = 0;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i); // i = i + 1;
        System.out.println(i--); // i = i - 1;

        i += 5; // i = i + 5;
        i /= 2; // i = i / 2;
        i %= 2; // i = i % 2;
        i *= 2; // i = i * 2;
        i -= 2; // i = i - 2;

    }
}