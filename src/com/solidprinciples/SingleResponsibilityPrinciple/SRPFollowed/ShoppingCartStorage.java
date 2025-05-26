package com.solidprinciples.SingleResponsibilityPrinciple.SRPFollowed;

import com.solidprinciples.SingleResponsibilityPrinciple.NotFollowed.ShoppingCart;

public class ShoppingCartStorage {
    ShoppingCart shoppingCart;
    public ShoppingCartStorage(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }
    public void saveToDB(){
        System.out.println("Saving shopping cart to database...");
    }
}
