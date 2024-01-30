package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Category frut = new Category();
        frut.setName("Фрукты");

        System.out.println("Создана категория: " + frut.getName());

        Category vegetables = new Category();
        vegetables.setName("Овощи");

        System.out.println("Создана категория: " + vegetables.getName());
        System.out.println();

        shop.setCategorys(Arrays.asList(frut,vegetables));

        System.out.println("В наш магазин добавлены категории: ");
        Stream.of(shop).forEach(n -> System.out.println(n));
        System.out.println();

        Product apple = new Product("Яблоко", 100, 4);
        Product lime = new Product("Лайм", 50, 5);
        Product banana = new Product("Банан", 80, 5);
        Product orange = new Product("Апельсин", 150, 5);

        frut.setProductList(Arrays.asList(apple,lime,banana,orange));

        System.out.println("Созданы и добавлены следующие товары в категорию Фрукты: ");
        Stream.of(frut.getProductList()).forEach(n -> System.out.println(n));
        System.out.println();

        Product corn = new Product("Кукуруза", 200, 5);
        Product potato = new Product("Картофель", 20, 3);
        Product carrot = new Product("Морковь", 10, 4);

        vegetables.setProductList(Arrays.asList(corn,carrot,potato));

        System.out.println("Созданы и добавлены следующие товары в категорию Овощи: ");
        Stream.of(vegetables.getProductList()).forEach(n -> System.out.println(n));
        System.out.println();


        User user_1 = new User("Иван", 555);
        User user_2 = new User("Дмитрий", 777);


        shop.setUsers(List.of(user_1,user_2));


        System.out.println("В магазин пришел: " + user_1);
        System.out.println("В магазин пришел: " + user_2);

        Shop.buy(user_1, apple);
        Shop.buy(user_1, apple);



        System.out.println("В магазин пришел: " + user_1);

        System.out.println(shop);


    }


}