package com.samsung;

import com.samsung.model.Product;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product(
                "Сыр",
                350,
                10
        );
        Product product2 = new Product(
                "Хлеб",
                50,
                100
        );
        String str = product1.toString();  // нужно преобразовать в строку, вызывая .toString()
        System.out.println(product1);  // сам вызывает .toString()
        System.out.println(product1.productCount);  // => 2
        System.out.println(product2.productCount);  // => 2
        System.out.println(Product.productCount);  // => 2
        Product.changeCount(product1, 20);
        Product.changeCount(product1, -5);
        System.out.println(product1);
    }
}