package com.solidprinciples.LiskovSubstitutionPrinciple.example2.BadCode;

public class BankAccount {
    double amount;
    public void getBalance(){
        System.out.println("Balance: " + amount);
    }
    public void deposit(double amount){
        this.amount += amount;
        System.out.println("Deposited: "+amount);
    }

    public void withdraw(double amount){
        if(this.amount>=amount){
            this.amount -= amount;
            System.out.println("Withdrawn:"+amount);
        }else{
            System.out.println("Insufficient balance to withdraw: "+amount);
        }
    }
}
