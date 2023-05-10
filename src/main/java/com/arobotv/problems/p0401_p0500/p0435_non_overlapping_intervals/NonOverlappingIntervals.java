package com.arobotv.problems.p0401_p0500.p0435_non_overlapping_intervals;

import java.util.Arrays;

public class NonOverlappingIntervals {
    /**
     * 贪心解法
     * 
     * 执行用时：48 ms, 在所有 Java 提交中击败了85.95%的用户
     * 内存消耗：98.3 MB, 在所有 Java 提交中击败了12.37%的用户
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[1] - b[1];
        });

        int ans = 1;
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] arr = intervals[i];
            if (arr[0] >= right) {
                ans++;
                right = arr[1];
            }
        }
        return intervals.length - ans;
    }
}
