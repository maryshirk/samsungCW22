package com.samsung.myapplication.domain;

public class Name {
    private String name;
    private String surname;
    private String result;

    // Обязательно создайте геттеры и сеттеры для всех полей!
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
