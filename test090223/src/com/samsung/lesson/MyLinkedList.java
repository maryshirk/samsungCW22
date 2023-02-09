package com.samsung.lesson;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private class Node {
        private T value;
        private Node next;

        private Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node first;
    private Node last;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T value) {
        if (isEmpty()) {
            last = new Node(value, null);
            first = last;
        } else {
            Node prev = last;
            last = new Node(value, null);
            prev.next = last;
        }
    }

    public  void addFirst(T value) {
        if (isEmpty()) {
            last = new Node(value, null);
            first = last;
        } else {
            Node next = first;
            first = new Node(value, null);
            first.next = next;
        }
    }

    public boolean remove(T value) {
        if (isEmpty())
            throw new IllegalStateException("Cannot remove");
        boolean result = false;
        Node prev = null;
        Node curr = first;
        while (curr.next != null && !curr.value.equals(value)) {
            prev = curr;
            curr = prev.next;
        }
        if (curr.value.equals(value)) {
            if (first == last) first = null;
            else if (curr == first) {
                first = first.next;
            } else if (curr == last) {
                last = prev;
                last.next = null;
            } else {
                prev.next = curr.next;
            }
            result = true;
        }
        return result;
    }

    private class Iter implements Iterator<T> {
        private Node cursor = first;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T value = cursor.value;
            cursor = cursor.next;
            return value;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iter();
    }

    public T get(int number) {
        Node curr = first;
        for (int i = 0; i < number; i++) {
            curr = curr.next;
        }
        return curr.value;
    }
}
