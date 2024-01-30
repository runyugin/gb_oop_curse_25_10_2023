package org.example;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> buyProductList = new ArrayList<>();

    public List<Product> getBuyProductList() {
        return buyProductList;
    }

    public void setBuyProductList(List<Product> buyProductList) {
        this.buyProductList = buyProductList;
    }

    @Override
    public String toString() {
        return buyProductList.toString();
    }
}
