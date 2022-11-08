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

        // Вывод информации о питомцах
        pet1.printInfo();
        pet2.printInfo();

        // Вывод и добавление посещений для первого питомца
        pet1.allVisit();
        pet1.addVisit("25.10.22");
        pet1.addVisit("02.11.22");
        pet1.allVisit();


        String[] pet3visits = { "25.11.22", "01.11.22" };
        Pet pet3 = new Pet(
                "Рик",
                "Константин",
                "Попугай",
                pet3visits
        );
        pet3.allVisit();
        pet3.addVisit("08.11.22");
        pet3.allVisit();
    }
}