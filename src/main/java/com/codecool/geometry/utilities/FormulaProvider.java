package com.codecool.geometry.utilities;

public class FormulaProvider {

    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getAreaForShape(int shape) {
        String areaFormula = "";
        switch (shape) {
            case 1:
                areaFormula = "Circle area formula = π×r×r";
                break;
            case 2:
                areaFormula = "Equilateral Triangle area formula = a×a×sqrt(3)/4";
                break;
            case 3:
                areaFormula = "Rectangle area formula = a×b";
                break;
            case 4:
                areaFormula = "Regular Pentagon area formula = a×a×sqrt(5×(5+2×sqrt(5))/4";
                break;
            case 5:
                areaFormula = "Square area formula = a×a";
                break;
            case 6:
                areaFormula = "Triangle area formula = sqrt(s×(s-a)×(s-b)×(s-c))";
                break;
        }
        return areaFormula;
    }

    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getPerimeterForShape(int shape) {
        String perimeterFormula = "";
        switch (shape) {
            case 1:
                perimeterFormula = "Circle perimeter formula = 2×π×r";
                break;
            case 2:
                perimeterFormula = "Equilateral Triangle perimeter formula = 3×a";
                break;
            case 3:
                perimeterFormula = "Rectangle perimeter formula = 2×a+2×b";
                break;
            case 4:
                perimeterFormula = "Regular Pentagon perimeter formula = 5×a";
                break;
            case 5:
                perimeterFormula = "Square perimeter formula = 4×a";
                break;
            case 6:
                perimeterFormula = "Triangle area formula = a+b+c";
                break;
        }
        return perimeterFormula;
    }
}
