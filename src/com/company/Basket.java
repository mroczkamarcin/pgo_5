package com.company;

public class Basket {

    int s=0;
    User user;
    Product[] products= new Product[s];

    public Basket() {
    }

    public Basket(User user) {
        this.user = user;
    }

    public Basket(User user, Product[] products) {
        this.user = user;
        this.products = products;
    }

    public void addProduct(Product product) throws Exception {
        if (product.getNumberOfItems()<=0){
            throw new Exception("There are no items left in the shop");

        }

        else {
            s=s+1;
            System.out.println(products.length);
            products[s-1]=product;

        }
    }

    public void removeProduct(Product product){

    }

    public void buy(){

    }

    public void setUser(User user) {
        this.user = user;
    }



}
