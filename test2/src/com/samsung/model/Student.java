package com.samsung.model;

public class Student extends User {
    protected int group;

    public Student(String name, String surname, String middlename, String telephone, int group) {
        super(name, surname, middlename, telephone);
        this.group = group;
    }

    public Student(Student student) {
        super(student.getName(), student.getSurname(), student.getMiddlename(), student.getTelephone());
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void sayHello() {
        System.out.println("Привет! Я студен, мое имя " + getName());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Surname: ").append(getSurname()).append("\n")
                .append("Middle name: ").append(getMiddlename()).append("\n")
                .append("Telephone: ").append(getTelephone()).append("\n")
                .append("Group: ").append(getGroup());
        return builder.toString();
    }

    @Override
    public void printInfoToConsole() {
        System.out.println(this);
    }
}
