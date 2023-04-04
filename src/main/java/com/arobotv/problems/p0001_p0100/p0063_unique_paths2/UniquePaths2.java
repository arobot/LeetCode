package com.arobotv.problems.p0001_p0100.p0063_unique_paths2;

public class UniquePaths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    obstacleGrid[0][0] = 1;
                    continue;
                }
                if (i == 0) {
                    obstacleGrid[0][j] = obstacleGrid[0][j - 1];
                } else if (j == 0)
                    obstacleGrid[i][0] = obstacleGrid[i - 1][0];
                else
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
            }
        }
        return obstacleGrid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] a = {{0,1},{0,0}};
        System.out.println("result:" + uniquePathsWithObstacles(a));
    }

}
