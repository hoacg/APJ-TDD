package com.codegym;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    TriangleClassifier triangleClassifier;

    @BeforeEach
    void setup() {
        triangleClassifier = new TriangleClassifier();
    }

    @Test
    void kiemTra_TamGiacDeu() {
        String actualResult = triangleClassifier.getTriangleType(2, 2, 2);
        String expectedResult = "tam giác đều";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void kiemTra_TamGiacCan() {
        String actualResult = triangleClassifier.getTriangleType(2, 2, 3);
        String expectedResult = "tam giác cân";

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void kiemTra_TamGiacThuong() {
        String actualResult = triangleClassifier.getTriangleType(3, 4, 5);
        String expectedResult = "tam giác thường";

        assertEquals(expectedResult, actualResult);

    }
    @Test
    void kiemTra_khongPhai_tamGiac() {
        int[][] triangleSides = {
                { 8, 2, 3 },
                { -1, 2, 1 },
                { 0, 1, 1 },
                { 0, 0, 0 }
        };

        for (int[] sides : triangleSides) {
            String actualResult = triangleClassifier.getTriangleType(sides[0], sides[1], sides[2]);
            String expectedResult = "không phải là tam giác";
            assertEquals(expectedResult, actualResult);
        }
    }
}
