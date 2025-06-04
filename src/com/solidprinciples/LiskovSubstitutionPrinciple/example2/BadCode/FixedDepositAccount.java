package com.solidprinciples.LiskovSubstitutionPrinciple.example2.BadCode;

/*As we can see FixedDeposit is a child class of BankAccount
* But if we pass an object of FixedDeposit account instead of BankAccount it will
* break the program as it is throwing an Exception so it violates LSP*/
public class FixedDepositAccount extends BankAccount{
    @Override
    public void withdraw(double amount){
        throw new UnsupportedOperationException(";Withdrawals are not allowed from Fixed Deposit Accounts");
    }
}
