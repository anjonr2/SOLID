package com.solidprinciples.LiskovSubstitutionPrinciple.example1.BadCode;

public class Penguin extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
