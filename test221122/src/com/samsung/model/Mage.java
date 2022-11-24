package com.samsung.model;

public class Mage extends Unit{
    private int mp;

    public Mage(String name, int hp) {
        super(name, hp);
        mp = 50;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public void sayHello() {
        System.out.println("Привет, я маг!");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append(this.getClass().toString()).append("\n")
                .append("========================").append("\n")
                .append("Name: ").append(getName()).append("\n")
                .append("HP: ").append(getHp()).append("\n")
                .append("Mp: ").append(getMp());
        return builder.toString();
    }

    @Override
    public Unit attack(Unit unit) {
        // unit.getClass().equals(this.getClass());
        if (this.mp > 0) {
            this.mp -= 5;
            unit.getDmg(K_DMG * 2);
        } else {
            unit.getDmg(K_DMG);
        }
        return unit;
    }

    @Override
    public void getDmg(int dmg) {
        this.hp -= dmg;
    }
}
