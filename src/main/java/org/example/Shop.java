package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Category> categorys = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }

    public static void buy(User user, Product product) {
        user.getBasket().getBuyProductList().add(product);
    }


    @Override
    public String toString() {
        return categorys.toString();
    }

}
