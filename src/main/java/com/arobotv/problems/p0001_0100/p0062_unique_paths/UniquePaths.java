package com.arobotv.problems.p0001_0100.p0062_unique_paths;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] paths = new int[m];
        Arrays.fill(paths, 1);
        while (n-- > 1) {
            for (int i = 1; i < m; i++) {
                paths[i] = paths[i] + paths[i - 1];
            }
        }
        return paths[m - 1];
    }
}
