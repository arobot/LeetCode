package com.arobotv.problems.p0501_p0600.p0566_reshape_the_matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.arobotv.utils.PrintUtils;

public class ReshapeTheMatrixTest {
    @Test
    void testMatrixReshape() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        int[][] result = reshapeTheMatrix.matrixReshape(mat, r, c);
        PrintUtils.printMatrix(result);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(4, result[0].length);
    }

    @Test
    void testMatrixReshape2() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 2, c = 2;
        int[][] result = reshapeTheMatrix.matrixReshape(mat, r, c);
        PrintUtils.printMatrix(result);
        Assertions.assertEquals(2, result.length);
        Assertions.assertEquals(2, result[0].length);
    }

    @Test
    void testMatrixReshape3() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        int[][] result = reshapeTheMatrix.matrixReshape2(mat, r, c);
        PrintUtils.printMatrix(result);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(4, result[0].length);
    }

    @Test
    void testMatrixReshape4() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        int[][] result = reshapeTheMatrix.matrixReshape2(mat, r, c);
        PrintUtils.printMatrix(result);
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(4, result[0].length);
    }
}
