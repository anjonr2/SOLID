package com.solidprinciples.LiskovSubstitutionPrinciple.example1.BadCode;

public class LSPViolationExample {
    public static void main(String [] args){
        Bird bird = new Penguin();
        bird.fly(); //This will throw an exception
    }
}
