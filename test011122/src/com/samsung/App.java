package com.samsung;

import com.samsung.model.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Valera";
        person.age = 18;

        Person person1 = new Person();
        person1.name = "Kolya";
        person1.age = 14;

        person.printInfo();
        person.birthday();
        person.printInfo();

        person1.printInfo();
        person1.birthday();
        person1.printInfo();

        int b = 1;  // примитивный тип
        Integer a = 1;  // класс-оболочка
        int parseInt = Integer.parseInt("123");  // parseInt = 123
        parseInt++;  // parseInt = 124
    }
}