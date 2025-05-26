package com.solidprinciples.SingleResponsibilityPrinciple.NotFollowed;

import com.solidprinciples.Util.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart(){
        this.products = new ArrayList<>();
    }

    public ShoppingCart(List<Product> products){
        this.products=products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public double calculateTotalPrice(){
        double total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

    //This method violates the Single Responsibility Principle. It should be in a separate class
    public void printInvoice(){
        System.out.println("Shopping cart invoice");
        for (Product product : products){
            System.out.println(product.getName()+"- Rs"+product.getPrice());
        }
        System.out.println("Total: Rs"+calculateTotalPrice());
    }

    //Again this method violates the single responsibility principle. It should be in a separate class
    public void saveToDatabase(){
        //Code to save the shopping cart to a database
        System.out.println("Shopping cart is saved to database");
    }
}
