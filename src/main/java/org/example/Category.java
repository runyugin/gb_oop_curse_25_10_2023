package org.example;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String name;
    private List<Product> productList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


    @Override
    public String toString() {
        return name +
                ", товары=" + productList;
    }
}
