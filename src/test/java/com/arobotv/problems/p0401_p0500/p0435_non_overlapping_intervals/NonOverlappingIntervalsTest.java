package com.arobotv.problems.p0401_p0500.p0435_non_overlapping_intervals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonOverlappingIntervalsTest {
    /*
     * 输入: intervals = [[1,2],[2,3],[3,4],[1,3]]
     * 输出: 1
     */
    @Test
    void testEraseOverlapIntervals() {
        int[][] data = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        int eraseOverlapIntervals = nonOverlappingIntervals.eraseOverlapIntervals(data);
        Assertions.assertEquals(1, eraseOverlapIntervals);
    }

    /*
     * 输入: intervals = [[1,2],[1,2],[1,2]]
     * 输出: 2
     */
    @Test
    void testEraseOverlapIntervals2() {
        int[][] data = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        int eraseOverlapIntervals = nonOverlappingIntervals.eraseOverlapIntervals(data);
        Assertions.assertEquals(2, eraseOverlapIntervals);
    }

    /*
     * 输入: intervals = [[1,2],[2,3]]
     * 输出: 0
     */
    @Test
    void testEraseOverlapIntervals3() {
        int[][] data = { { 1, 2 }, { 2, 3 } };
        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        int eraseOverlapIntervals = nonOverlappingIntervals.eraseOverlapIntervals(data);
        Assertions.assertEquals(0, eraseOverlapIntervals);
    }
}
