package com.arobotv.problems.p0001_p0100.p0059_spiral_matrix_ii;

public class SpiralMatrixII {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了93.17%的用户
     */
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int[][] rotate = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int rotateIndex = 0;
        int num = 0;
        int i = 0, j = 0;
        int[] dir = rotate[rotateIndex];
        while (num < n * n) {
            matrix[i][j] = ++num;
            if (i + dir[0] >= n || j + dir[1] >= n
                    || i + dir[0] < 0 || j + dir[1] < 0
                    || matrix[i + dir[0]][j + dir[1]] > 0) {
                rotateIndex = (rotateIndex + 1) % 4;
                dir = rotate[rotateIndex];
            }
            i += dir[0];
            j += dir[1];
        }

        return matrix;
    }
}
