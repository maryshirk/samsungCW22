package com.samsung.model;

public class Person {
    private String name;
    private int age;
    private long number;

    public Person(String name, int age, long number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Age: ").append(getAge()).append("\n")
                .append("Telephone: ").append(getNumber()).append("\n");
        return builder.toString();
    }
}
