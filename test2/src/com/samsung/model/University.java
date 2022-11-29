package com.samsung.model;

public class University implements Printer {
    private String addres;
    protected Student[] students;
    protected Teacher[] teachers;

    public University(String addres, Student[] students, Teacher[] teachers) {
        this.addres = addres;
        this.students = students;
        this.teachers = teachers;
    }

    public String getAddres() {
        return addres;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("=========================\n")
                .append(getClass().toString()).append("\n")
                .append("========================").append("\n")
                .append("Addres: " + getAddres()).append("\n")
                .append("========================").append("\n")
                .append("Students:\n");
        for (int i = 0; i < getStudents().length; i++) {
            builder.append(getStudents()[i]).append("\n");
        }
        builder.append("========================").append("\n").append("Teachers:\n");
        for (int i = 0; i < getTeachers().length; i++) {
            builder.append(getTeachers()[i]).append("\n");
        }
        builder.append("========================");
        return builder.toString();
    }

    @Override
    public void printInfoToConsole() {
        System.out.println(this);
    }
}
