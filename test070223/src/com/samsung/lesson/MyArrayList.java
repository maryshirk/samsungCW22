package com.samsung.lesson;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements Iterable {
    private Object[] data;
    private int size;

    public MyArrayList(int n) {
        data = new Object[n];
        size = 0;
    }

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    public Object get(int n) {
        if (n > 0 && n < size)
            return data[n];
        return null;
    }

    public void add(Object o) {
        if (size == data.length) {
            Object[] tmp = new Object[data.length * 2];
            System.arraycopy(data, 0, tmp, 0, data.length);  // копировать дату в тмп
            data = tmp;
        }

        data[size] = o;
        size++;
    }

    public void remove(int i) {
        if (i > 0 && i < size && i!= size - 1) {
            System.arraycopy(data, i + 1, data, i, size - i);
        }
        data[size] = null;
        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; ; i++) {
            stringBuilder.append(data[i] + ", ");
            if (i == size - 1) return stringBuilder.append(data[i] + "]").toString();
        }
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator{
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public Object next() {
            cursor++;
            return data[cursor - 1];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
        }
    }
}
