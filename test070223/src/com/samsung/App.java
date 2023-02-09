package com.samsung;

import com.samsung.lesson.MyArrayList;

public class App {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();

        arrayList.add(10);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);
        arrayList.add(22);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        arrayList.remove(15);
        System.out.println(arrayList.size());

        System.out.println(arrayList);

        for (Object o: arrayList) {
            System.out.println(o);
        }
    }
}