package com.arobotv.problems.p0501_p0600.p0566_reshape_the_matrix;

public class ReshapeTheMatrix {

    /*
     * 执行用时：1 ms, 在所有 Java 提交中击败了25.84%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了99.00%的用户
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c)
            return mat;
        int[][] temp = new int[r][c];
        int[] locate = new int[2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                locate = change(i, j, n, c);
                temp[locate[0]][locate[1]] = mat[i][j];
            }
        }
        return temp;
    }

    int[] change(int x, int y, int n, int c) {
        int index = x * n + y;
        return new int[] { index / c, index % c };
    }

    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了44.02%的用户
     */
    public int[][] matrixReshape2(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c)
            return mat;
        int[][] temp = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[x][y++] = mat[i][j];
                x += y == c ? 1 : 0;
                y %= c;
            }
        }
        return temp;
    }

}
