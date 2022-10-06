package com.samsung;

import java.util.Scanner;

public class Main {

    static int d = 19;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*int nextInt = scanner.nextInt();
        if (nextInt > 5) {
            System.out.println("nextInt > 5");
            System.out.println("!");
        }else{
            System.out.println("nextInt < 5");
            System.out.println("!");
        }*/

        /*int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();*/

        /*if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }*/

        /*if (a > b)
            if (a > c) System.out.println(a);
            else System.out.println(c);
        else
            if (b > c) System.out.println(b);
            else System.out.println(c);*/

        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            default:
                System.out.println("Нет такого месяца");
                break;
        }

        int a = 1;
        int b = 10;
        if (a > 0){
            int c = 5;
            int d = 100;
            System.out.println(c);
            if (true) {
                System.out.println(d);
                System.out.println(Main.d);
            }
        }else{
            System.out.println(d);
        }

    }
}