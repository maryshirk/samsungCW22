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
}
