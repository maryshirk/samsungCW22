package com.samsung;

import com.samsung.lesson.MyLinkedList;
import com.samsung.model.Person;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Person> personList = new LinkedList<>();
        // personList.


        MyLinkedList<Person> personMyLinkedList = new MyLinkedList<>();

        personMyLinkedList.add(new Person("Valera", 13));
        personMyLinkedList.add(new Person("Valera2", 13));
        personMyLinkedList.add(new Person("Valer3a", 13));
        personMyLinkedList.add(new Person("Valeria", 16));
        personMyLinkedList.add(new Person("Oleg", 18));
        Person kolya = new Person("Kolya", 18);
        personMyLinkedList.add(kolya);
        personMyLinkedList.add(new Person("Sasha", 21));

        for (Object o: personMyLinkedList) {
            System.out.println(o);
        }

        personMyLinkedList.remove(kolya);
        personMyLinkedList.remove(new Person("Valera", 13));

        System.out.println("==============");

        for (Object o: personMyLinkedList) {
            System.out.println(o);
        }

        System.out.println("============");
        System.out.println(personMyLinkedList.get(2));
    }
}