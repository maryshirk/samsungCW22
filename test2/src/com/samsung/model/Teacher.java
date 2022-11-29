package com.samsung.model;

public class Teacher extends User {
    private String discipline;

    public Teacher(String name, String surname, String middlename, String telephone, String discipline) {
        super(name, surname, middlename, telephone);
        this.discipline = discipline;
    }

    public Teacher(Teacher teacher) {
        super(teacher.getName(), teacher.getSurname(), teacher.getMiddlename(), teacher.getTelephone());
        this.discipline = teacher.discipline;
    }

    public String getDiscipline() {
        return discipline;
    }

    @Override
    public void sayHello() {
        System.out.println("Здравствуйте! Я преподаватель, мое имя " + getName());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Surname: ").append(getSurname()).append("\n")
                .append("Middle name: ").append(getMiddlename()).append("\n")
                .append("Telephone: ").append(getTelephone()).append("\n")
                .append("Discipline: ").append(getDiscipline());
        return builder.toString();
    }

    @Override
    public void printInfoToConsole() {
        System.out.println(this);
    }
}
