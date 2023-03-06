package com.arobotv.problems.p0501_p0600.p0576_out_of_boundary_paths;

public class OutOfBoundaryPaths {
    /*
     * 执行用时：6 ms, 在所有 Java 提交中击败了52.55%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了71.43%的用户
     */
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long[][][] cache = new long[m + 2][n + 2][maxMove + 1];
        int mod = 1000000007;
        if (maxMove == 0)
            return 0;
        // init cache
        for (int i = 1; i <= maxMove; i++) {
            for (int j = 1; j <= m; j++) {
                cache[j][1][i] += 1;
                cache[j][n][i] += 1;
            }

            for (int j = 1; j <= n; j++) {
                cache[1][j][i] += 1;
                cache[m][j][i] += 1;
            }
        }

        for (int move = 1; move <= maxMove; move++) {
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    cache[i][j][move] += (cache[i + 1][j][move - 1] + cache[i - 1][j][move - 1]
                            + cache[i][j - 1][move - 1] + cache[i][j + 1][move - 1]);

                    cache[i][j][move] %= mod;
                }
            }
        }
        return (int) cache[startRow + 1][startColumn + 1][maxMove];
    }
}