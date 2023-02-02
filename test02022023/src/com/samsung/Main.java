package com.samsung;

import com.samsung.model.Person;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Valera", 15, 89345674323L),
                new Person("Nikita", 28, 89345994335L),
                new Person("Dima", 16, 89345994311L),
                new Person("Olesya", 14, 83445674323L),
                new Person("Alex", 31, 89345994335L),
                new Person("Dima", 14, 89345992211L),
        };
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (String.valueOf(o1.getNumber() % 100).compareTo(String.valueOf(o2.getNumber() % 100)) > 0) {
                    return -1;
                }
                if (String.valueOf(o1.getNumber() % 100).compareTo(String.valueOf(o2.getNumber() % 100)) < 0) {
                    return 1;
                }
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(persons));
    }
}