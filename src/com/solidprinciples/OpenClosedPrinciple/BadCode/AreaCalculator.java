package com.solidprinciples.OpenClosedPrinciple.BadCode;

/*This code calculates area of Rectangle and Circle
* But if we add a new shape to calculate area we need to modify existing code
* which violates OCP*/
public class AreaCalculator {
    public double calculateRectangleArea(double length, double width){
        return length * width;
    }
    public double calculateCircleArea(double radius){
        return Math.PI*radius*radius;
    }
}
