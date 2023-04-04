package com.arobotv.problems.p0001_p0100.p0056_merge_intervals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeIntervalsTest {
    static MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    void merge() {
        Assertions.assertArrayEquals(new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } },
                mergeIntervals.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } }));
    }

    @Test
    void merge2() {
        Assertions.assertArrayEquals(new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } },
                mergeIntervals.merge(new int[][] { { 2, 6 }, { 1, 3 }, { 8, 10 }, { 15, 18 } }));
    }

    @Test
    void merge3() {
        Assertions.assertArrayEquals(new int[][] { { 1, 6 } },
                mergeIntervals.merge(new int[][] { { 2, 6 }, { 1, 3 } }));
    }

    @Test
    void merge4() {
        Assertions.assertArrayEquals(new int[][] { { 1, 6 } },
                mergeIntervals.merge(new int[][] { { 1, 6 }, { 2, 3 } }));
    }

    @Test
    void merge5() {
        Assertions.assertArrayEquals(new int[][] { { 1, 5 } },
                mergeIntervals.merge(new int[][] { { 1, 4 }, { 4, 5 } }));
    }

    @Test
    void merge6() {
        Assertions.assertArrayEquals(new int[][] { { 1, 10 } },
                mergeIntervals.merge(new int[][] { { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 }, { 1, 10 } }));
    }
}
