package com.arobotv.problems.p0201_0300.p0240_search_a_2d_matrix_ii;

public class SearchATwoDMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int mi = matrix.length - 1, mj = matrix[0].length - 1;
        int l = 0, r = matrix.length - 1;
        while (l <= r) {
            int m = (r + l) >>> 1;
            if (matrix[m][0] > target) {
                r = m - 1;
                mi = r;
            } else if (matrix[m][0] < target)
                l = m + 1;
            else
                return true;
        }
        l = 0;
        r = matrix[0].length - 1;
        while (l <= r) {
            int m = (r + l) >>> 1;
            if (matrix[0][m] > target) {
                r = m - 1;
                mj = r;
            } else if (matrix[0][m] < target)
                l = m + 1;
            else
                return true;
        }
        for (int i = 0; i <= mi; i++) {
            l = 0;
            r = mj;
            while (l <= r) {
                int m = (r + l) >>> 1;
                if (matrix[i][m] > target) {
                    r = m - 1;
                } else if (matrix[i][m] < target)
                    l = m + 1;
                else
                    return true;
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] < target)
                i++;
            else if (target < matrix[i][j])
                j--;
            else
                return true;
        }
        return false;
    }

}
