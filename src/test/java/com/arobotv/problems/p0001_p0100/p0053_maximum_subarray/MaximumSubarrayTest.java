package com.arobotv.problems.p0001_p0100.p0053_maximum_subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MaximumSubarrayTest {
    static MaximumSubarray subarray = new MaximumSubarray();

    @Test
    void testMaxSubArray() {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Assertions.assertEquals(6, subarray.maxSubArray(nums));
        Assertions.assertEquals(6, subarray.maxSubArray2(nums));
    }

    @Test
    void testMaxSubArray2() {
        int[] nums = { 1 };
        Assertions.assertEquals(1, subarray.maxSubArray(nums));
        Assertions.assertEquals(1, subarray.maxSubArray2(nums));
    }

    @Test
    void testMaxSubArray3() {
        int[] nums = { 5, 4, -1, 7, 8 };
        Assertions.assertEquals(23, subarray.maxSubArray(nums));
        Assertions.assertEquals(23, subarray.maxSubArray2(nums));
    }
}
