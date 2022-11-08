package com.samsung.model;

public class Pet {
    private String animalName;
    private String ownerName;
    private String animalType;
    private String[] data;

    public Pet(String animalName, String ownerName, String animalType) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        this.animalType = animalType;
    }

    public void printInfo() {
        System.out.println(this);
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
