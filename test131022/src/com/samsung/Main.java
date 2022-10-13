package com.samsung;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        // Бесконечный цикл
        /*for (;;) {
            // comand
        }*/

        int[] array = new int[100];
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        array[9] = 10;

        // array.fori
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i] + " ");
        }

    }
}