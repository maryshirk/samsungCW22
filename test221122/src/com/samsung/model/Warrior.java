package com.samsung.model;

public class Warrior extends Unit{
    private int armor;

    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, я воин!");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append(this.getClass().toString()).append("\n")
                .append("========================").append("\n")
                .append("Name: ").append(getName()).append("\n")
                .append("HP: ").append(getHp()).append("\n")
                .append("Armor: ").append(getArmor());
        return builder.toString();
    }

    @Override
    public Unit attack(Unit unit) {
        return null;
    }

    @Override
    public void getDmg(int dmg) {
        if (this.armor > 0) {
            this.armor -= 1;
            this.hp -= dmg / 2;
        } else {
            this.hp -= dmg;
        }
    }
}
