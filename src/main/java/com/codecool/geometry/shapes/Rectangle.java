package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private double a = 2.00;
    private double b = 5.00;

    @Override
    public double calculateArea() {
        double rectangleArea = a*b;
        double rounded = Math.floor(rectangleArea * 100) / 100;
        return rounded;
    }

    @Override
    public double calculatePerimeter() {
        double rectanglePerimeter = 2*a+2*b;
        double rounded = Math.floor(rectanglePerimeter * 100) / 100;
        return rounded;
    }

    public String toString() {
        String shapeName = "Rectangle";
        return shapeName+", "+"a = "+String.valueOf(a)+", "+"b = "+String.valueOf(b);
    }
}
