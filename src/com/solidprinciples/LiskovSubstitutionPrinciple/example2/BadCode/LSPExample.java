package com.solidprinciples.LiskovSubstitutionPrinciple.example2.BadCode;

/*This class violating Liskov Substitution Principle
* Since on passing child class object in place of parent object it throws an exception
* hence breaking the program*/
public class LSPExample {
    public static void main(String [] args){
        BankAccount account = new FixedDepositAccount();
        account.withdraw(1000); // This will throw an exception
    }
}
