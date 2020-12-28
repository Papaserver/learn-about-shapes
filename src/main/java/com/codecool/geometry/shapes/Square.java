package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    private double a = 10.00;

    @Override
    public double calculateArea() {
        double squareArea = a*a;
        double rounded = Math.floor(squareArea * 100) / 100;
        return rounded;
    }

    @Override
    public double calculatePerimeter() {
        double squarePerimeter = 4*a;
        double rounded = Math.floor(squarePerimeter * 100) / 100;
        return rounded;
    }

    @Override
    public String toString() {
        String shapeName = "Square";
        return shapeName+", "+"a = "+String.valueOf(a);
    }
}
