package com.solidprinciples.SingleResponsibilityPrinciple.SRPFollowed;

import com.solidprinciples.SingleResponsibilityPrinciple.NotFollowed.ShoppingCart;
import com.solidprinciples.Util.Product;

public class ShoppingCartInvoice {
    private ShoppingCart shoppingCart;

    public ShoppingCartInvoice(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void printInvoice(){
        System.out.println("Shopping cart invoice");
        for(Product product : shoppingCart.getProducts()){
            System.out.println(product.getName()+"- RS "+ product.getPrice());
        }
        System.out.println("Total: RS "+ shoppingCart.calculateTotalPrice());
    }
}
