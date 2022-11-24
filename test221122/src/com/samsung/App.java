package com.samsung;

import com.samsung.model.Mage;
import com.samsung.model.Unit;
import com.samsung.model.Warrior;

public class App {
    public static void main(String[] args) {
        Unit unit1 = new Unit(
                "Мудрый дуб",
                100
        );
        System.out.println(unit1);

        Warrior warrior1 = new Warrior(
                "Валлера",
                250,
                100
        );
        System.out.println(warrior1);

        Mage mage1 = new Mage(
                "Виталий",
                90
        );
        System.out.println(mage1);

        Unit unit2 = mage1;
        System.out.println(unit2);
        System.out.println(((Mage)unit2).getMp());
    }
}