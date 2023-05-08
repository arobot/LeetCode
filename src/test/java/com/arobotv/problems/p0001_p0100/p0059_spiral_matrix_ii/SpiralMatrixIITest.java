package com.arobotv.problems.p0001_p0100.p0059_spiral_matrix_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpiralMatrixIITest {
    /*
     * 输入：n = 3
     * 输出：[[1,2,3],[8,9,4],[7,6,5]]
     */
    @Test
    void testGenerateMatrix() {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        int[][] generateMatrix = spiralMatrixII.generateMatrix(3);
        Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, generateMatrix[0]);
        Assertions.assertArrayEquals(new int[] { 8, 9, 4 }, generateMatrix[1]);
        Assertions.assertArrayEquals(new int[] { 7, 6, 5 }, generateMatrix[2]);
    }

    /*
     * 输入：n = 1
     * 输出：[[1]]
     */
    @Test
    void testGenerateMatrix2() {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        int[][] generateMatrix = spiralMatrixII.generateMatrix(1);
        Assertions.assertArrayEquals(new int[] { 1 }, generateMatrix[0]);
    }
}
