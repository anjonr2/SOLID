package com.solidprinciples.LiskovSubstitutionPrinciple.example2.GoodCode;

import com.solidprinciples.LiskovSubstitutionPrinciple.example2.BadCode.BankAccount;

public class SavingAccount extends BankAccount implements Withdrawls {

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.amount) {
            this.amount -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
