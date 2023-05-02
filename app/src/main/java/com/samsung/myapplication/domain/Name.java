package com.samsung.myapplication.domain;

import androidx.annotation.NonNull;

public class Name {
    private String name;
    private String surname;

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @NonNull
    @Override
    public String toString() {
        return getName().toLowerCase() + " " + getSurname().toLowerCase();
    }
}
