package com.samsung;

import java.util.Scanner;

public class AddTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // создание массива
        int n = scanner.nextInt();
        int[] array = new int[n];
        n -= 1;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // сортировка массива (пузырьком)
        int temp;
        for (int i = 0; i + 1 < n; i++) {
            for (int j = 0; j + 1 < n - i; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // проверка на наличие карточки с номером 1
        int c;
        c = 0;
        for (int j = 0; j < n; j++) {
            if (array[j] == 1) {
                c = 1;
                break;
            }
        }
        if (c == 0) {
            System.out.println(1);
        } else {

            // ищем недостающую карточку
            for (int i = 0; i < n; i++) {
                c = 0;

                // проверяем, есть ли в массиве число большее текущего элемента на 1 (следующее за ним)
                for (int j = 0; j < n; j++) {
                    if (array[i] + 1 == array[j]) {
                        c = 1;
                        break;
                    }
                }
                if (c == 0) {
                    System.out.print(array[i] + 1);
                    break;
                }
            }
        }
    }
}
