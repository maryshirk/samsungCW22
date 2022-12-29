package com.samsung.myapplication.model;

import java.io.Serializable;

public class Product implements Serializable {
    private final String name_product;
    private String date;
    private int amount;
    private int price;

    public Product(String name_product, String date, int amount, int price) {
        this.name_product = name_product;
        this.date = date;
        this.amount = amount;
        this.price = price;
    }

    public String getName_product() {
        return name_product;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void newInformation(Product product) {
        date = product.getDate();
        amount += product.getAmount();
        price = product.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Информация о продукте\n").
                append("=========================\n")
                .append("Название: ").append(getName_product()).append("\n")
                .append("Дата поступления: ").append(getDate()).append("\n")
                .append("Количество: ").append(getAmount()).append("\n")
                .append("Стоимость за единицу: ").append(getPrice());
        return builder.toString();
    }
}
