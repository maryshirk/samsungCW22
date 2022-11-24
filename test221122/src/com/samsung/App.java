package com.samsung;

import com.samsung.model.Mage;
import com.samsung.model.Unit;
import com.samsung.model.Warrior;

public class App {
    public static void main(String[] args) {

        Warrior warrior1 = new Warrior(
                "Валлера",
                100,
                10
        );

        Mage mage1 = new Mage(
                "Виталий",
                60
        );

        while (warrior1.getHp() > 0 && mage1.getHp() > 0) {
            warrior1.attack(mage1);
            mage1.attack(warrior1);
        }

        System.out.println("++++++++");

        System.out.println(mage1);
        System.out.println(warrior1);
    }
}