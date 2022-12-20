package com.samsung;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("NO");
        } finally {
            scanner.close();
        }

        System.out.println("what");

        try {
            test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test() throws Exception {
        if (Math.random() < 0.5) {
            Exception exception = new Exception();
            // либо создать свой класс MyExc наследуемый от exception
            throw exception;
            // trow new MyExc
        } else {
            System.out.println("dgjdhfg");
        }
    }


}