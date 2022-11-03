package com.samsung;

import com.samsung.model.Person;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 18);
        // Person person1 = person;  // no!
        Person person1 = new Person(person);
        person.printInfo();
        int age = person.getAge();
        System.out.println(age);
        person.setAge(19);
        person.printInfo();
        person1.printInfo();
        person.printInfo(3);
    }
}