package com.samsung;

import com.samsung.model.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Valera", 19);
        Person person2 = new Person("Valera1", 19);
        Person person3 = new Person("Valera2", 19);
        Person person4 = new Person("Valera", 11);
        Person person5 = new Person("Valera", 19);

        Map<Integer, Person> personMap = new HashMap<>();

        personMap.put(1, person1);
        personMap.put(2, person2);
        personMap.put(3, person3);
        personMap.put(4, person4);
        personMap.put(5, person5);

        for (Map.Entry<Integer, Person> entry: personMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

    }
}