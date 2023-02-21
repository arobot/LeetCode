package com.arobotv.problems.p0901_p1000.p0931_minimum_falling_path_sum;

class Solution {

    /*
     * 执行用时：4 ms, 在所有 Java 提交中击败了67.60%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了89.49%的用户
     */
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0)
                    matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i - 1][j + 1]);
                else if (j == n - 1)
                    matrix[i][j] += Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]);
                else
                    matrix[i][j] += Math.min(Math.min(matrix[i - 1][j - 1], matrix[i - 1][j]), matrix[i - 1][j + 1]);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min=Math.min(min, matrix[n-1][i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println("result:"+minFallingPathSum(matrix));
        int[][] matrix2 = {{-19,57},{-40,-5}};
        System.out.println("result:"+minFallingPathSum(matrix2));
    }
}