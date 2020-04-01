package com.company;

public class Product {

    String name;
    Double price;
    int productCode;
    int numberOfItems;

    public Product(String name, Double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfItems = 0;
    }

    public Product(String name, Double price, int productCode, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        if (numberOfItems < 0) {
            throw new IllegalArgumentException("number of items cannot be smaller than 0");
        } else {
            this.numberOfItems = numberOfItems;
        }
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getProductCode() {
        return productCode;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}

