package com.samsung.model;

public abstract class User implements Printer {
    private String name;
    private String surname;
    private String middlename;
    protected String telephone;

    public User(String name, String surname, String middlename, String telephone) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getTelephone() {
        return telephone;
    }

    public abstract void sayHello();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Surname: ").append(getSurname()).append("\n")
                .append("Middle name: ").append(getMiddlename()).append("\n")
                .append("Telephone: ").append(getTelephone());
        return builder.toString();
    }
}
