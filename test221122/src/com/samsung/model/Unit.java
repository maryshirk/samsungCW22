package com.samsung.model;

public class Unit {
    private String name;
    protected int hp;

    public Unit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
