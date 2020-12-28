package com.codecool.geometry.shapes;

public class Triangle extends Shape {

    private double a = 6.00;
    private double b = 7.00;
    private double c = 8.00;
    private double s = (a+b+c)/2;

    @Override
    public double calculateArea() {
        double triangleArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double rounded = Math.floor(triangleArea * 100) / 100;
        return rounded;
    }

    @Override
    public double calculatePerimeter() {
        double trianglePerimeter = a+b+c;
        double rounded = Math.floor(trianglePerimeter * 100) / 100;
        return rounded;
    }

    public String toString() {
        String shapeName = "Triangle";
        return shapeName+", "+"a = "+String.valueOf(a)+", "+"b = "+String.valueOf(b)+", "+"c = "+String.valueOf(c);
    }
}
