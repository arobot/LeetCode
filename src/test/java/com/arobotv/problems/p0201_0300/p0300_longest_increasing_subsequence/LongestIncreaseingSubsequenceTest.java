package com.arobotv.problems.p0201_0300.p0300_longest_increasing_subsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreaseingSubsequenceTest {
    static LongestIncreaseingSubsequence lis = new LongestIncreaseingSubsequence();

    @Test
    void testLengthOfLIS() {
        Assertions.assertEquals(4, lis.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
    }

    @Test
    void testLengthOfLIS2() {
        Assertions.assertEquals(4, lis.lengthOfLIS(new int[] { 0, 1, 0, 3, 2, 3 }));
    }

    @Test
    void testLengthOfLIS3() {
        Assertions.assertEquals(1, lis.lengthOfLIS(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
    }

    @Test
    void testLengthOfLIS4() {
        Assertions.assertEquals(4, lis.lengthOfLIS2(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
    }

    @Test
    void testLengthOfLIS5() {
        Assertions.assertEquals(4, lis.lengthOfLIS2(new int[] { 0, 1, 0, 3, 2, 3 }));
    }

    @Test
    void testLengthOfLIS6() {
        Assertions.assertEquals(1, lis.lengthOfLIS2(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
    }
}
