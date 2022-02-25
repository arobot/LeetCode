package com.arobotv.problems.p0001_0100.p0056_merge_intervals;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][1]) {
                continue;
            } else if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = intervals[i][1];
            } else {
                intervals[++index] = intervals[i];
            }
        }
        return Arrays.copyOf(intervals, ++index);
    }
}
