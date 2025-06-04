package com.solidprinciples.LiskovSubstitutionPrinciple.example2.GoodCode;

public class BankAccount {
    double amount;

    public void getBalance() {
        System.out.println("Balance: " + amount);
    }
}
