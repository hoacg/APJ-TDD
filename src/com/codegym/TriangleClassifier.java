package com.codegym;

public class TriangleClassifier {

    public static final String EQUILATERAL_TRIANGLE = "tam giác đều";
    public static final String ISOSCELES_TRIANGLE = "tam giác cân";
    public static final String TRIANGLE = "tam giác thường";
    public static final String NON_TRIANGLE = "không phải là tam giác";

    public String getTriangleType(int sideA, int sideB, int sideC) {
        boolean isValidSides = sideA > 0 && sideB > 0 && sideC > 0;
        boolean isEquilateralTriangle = sideA == sideB && sideB == sideC;
        boolean isIsoscelesTriangle = sideA == sideB || sideB == sideC || sideA == sideC;
        boolean isTriangle = sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;

        if (isValidSides) {
            if (isEquilateralTriangle) {
                return EQUILATERAL_TRIANGLE;
            } else if (isIsoscelesTriangle) {
                return ISOSCELES_TRIANGLE;
            } else if (isTriangle) {
                return TRIANGLE;
            }
        }
        return NON_TRIANGLE;
    }

}
