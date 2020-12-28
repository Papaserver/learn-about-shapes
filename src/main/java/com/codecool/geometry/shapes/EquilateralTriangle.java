package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    private double a = 2.00;

    @Override
    public double calculateArea() {
        double equLatTriangArea = a*a*Math.sqrt(3)/4;
        double rounded = Math.floor(equLatTriangArea * 100) / 100;
        return rounded;
    }

    @Override
    public double calculatePerimeter() {
        double equLatTriangPerimeter = 3*a;
        double rounded = Math.floor(equLatTriangPerimeter * 100) / 100;
        return rounded;
    }
    public String toString() {
        String shapeName = "Equilateral Triangle";
        return shapeName+", "+"a = "+String.valueOf(a);
    }
}
