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
}
