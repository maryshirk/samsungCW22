package com.samsung.model;

public abstract class Unit implements Battle {
    public final static int K_DMG = 10;
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

    public abstract void sayHello();

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
