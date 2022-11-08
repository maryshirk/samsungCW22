package com.samsung;

import com.samsung.model.Pet;

public class App {
    public static void main(String[] args) {
        Pet pet1 = new Pet(
                "Рыжик",
                "Михаил",
                "Кот"
        );
        Pet pet2 = new Pet(
                "Шарик",
                "Анастасия",
                "Собака"
        );
        pet1.printInfo();
        pet2.printInfo();
    }
}