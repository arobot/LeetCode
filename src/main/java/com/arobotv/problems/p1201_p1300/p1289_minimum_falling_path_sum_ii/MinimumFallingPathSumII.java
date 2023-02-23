package com.arobotv.problems.p1201_p1300.p1289_minimum_falling_path_sum_ii;

import java.util.Arrays;

public class MinimumFallingPathSumII {
    /*
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.4 MB, 在所有 Java 提交中击败了35.96%的用户
     */
    public static int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        if (m == 1)
            return grid[0][0];
        int[] temp = new int[m];
        int last = Integer.MAX_VALUE, secLast = Integer.MAX_VALUE;
        Arrays.fill(temp, 0);
        for (int i = 0; i < m; i++) {
            last = Integer.MAX_VALUE;
            secLast = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (temp[j] < last) {
                    secLast = last;
                    last = temp[j];
                } else if (last <= temp[j] && temp[j] < secLast) {
                    secLast = temp[j];
                }
            }
            for (int j = 0; j < m; j++) {
                if (temp[j] == last)
                    temp[j] = grid[i][j] + secLast;
                else
                    temp[j] = grid[i][j] + last;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int a : temp) {
            min = Math.min(min, a);
        }
        return min;
    }
}
