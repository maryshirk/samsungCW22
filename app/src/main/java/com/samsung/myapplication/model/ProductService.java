package com.samsung.myapplication.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductService implements Serializable {
    private Product[] list;
    private int length;

    public ProductService() {
        this.list = new Product[1000];
        length = 0;
    }

    public void addProduct(Product product) {
        if (length >= list.length) {
            Product[] tmp = new Product[list.length];
            System.arraycopy(tmp, 0, list, 0, list.length);
            list = new Product[length * 2];
            System.arraycopy(list, 0, tmp, 0, list.length);
        }
        list[length] = product;
        length++;
    }

    public Product findByName(String name) {
        for (int i = 0; i < length; i++) {
            if (list[i].getName_product().equals(name)) {
                return list[i];
            }
        }
        return null;
    }
}
