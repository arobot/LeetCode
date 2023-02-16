package com.arobotv.problems.p0001_0100.p0064_minimum_path_sum;

public class Solution {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;
                else if (i == 0)
                    grid[0][j] += grid[0][j - 1];
                else if (j == 0)
                    grid[i][0] += grid[i - 1][0];
                else {
                    grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
                }
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] data1 = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println("data1:"+minPathSum(data1));
        
        int[][] data2 = {{1,2,3},{4,5,6}};
        System.out.println("data2:"+minPathSum(data2));

    }
}
