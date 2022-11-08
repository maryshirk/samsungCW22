package com.samsung.model;

public class Pet {
    private String animalName;
    private String ownerName;
    private String animalType;
    private String[] data = new String[0];

    // конструктор с 3 параметрами
    public Pet(String animalName, String ownerName, String animalType) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        this.animalType = animalType;
    }

    // конструктор с 4 параметрами
    public Pet(String animalName, String ownerName, String animalType, String[] data) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        this.animalType = animalType;
        this.data = data;
    }

    // вывод информации о питомце
    public void printInfo() {
        System.out.println(this);
    }

    // добавление посещения
    public void addVisit(String visit) {
        String[] temp = new String[this.data.length + 1];
        for (int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }
        temp[this.data.length] = visit;
        this.data = temp;
    }

    // вывод всех посещений
    public void allVisit() {
        System.out.print("Посещения питомца с именем " + this.animalName + ": ");
        if (this.data.length == 0) {
            System.out.println("нет посещений");
        } else {
            for (int i = 0; i < this.data.length; i++) {
                System.out.print(this.data[i] + " ");
                if (i == this.data.length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animal's name: ").append(animalName).append("\n")
                .append("Owner's name: ").append(ownerName).append("\n")
                .append("Animal's type: ").append(animalType);
        return stringBuilder.toString();
    }
}
