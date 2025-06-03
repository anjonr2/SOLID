package com.solidprinciples.LiskovSubstitutionPrinciple.example1.GoodCode;

public class FlyingBird extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Can fly!!");
    }
}
