package com.company;

import javax.swing.plaf.ProgressBarUI;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {

        User u1 = new User("user@gmail.com");

        Product p1 = new Product("product1", 13.90, 15225, 20);
        Product p2 = new Product("product2", 20.50, 44225, 50);
        Product p3 = new Product("product3", 12.20, 13268);

        ArrayList<Product> products = new ArrayList<>();

        Category c1 = new Category();
        Category c2 = new Category("Category two");
        Category c3 = new Category("Category three", products);

        c1.addProduct(p1);
        c2.addProduct(p2);
        c3.addProduct(p3);

        c3.renameCategory("Category three and a half");
        System.out.println(c3.getName());

        //prepare pre-filled basket
        Product[] products1 = {p1,p2};

        Basket b1 = new Basket();
        Basket b2 = new Basket(u1);
        Basket b3 = new Basket(u1, products1);

        b1.addProduct(p2);
//        b1.addProduct(p1);
//        b1.setUser(u1);




    }
}