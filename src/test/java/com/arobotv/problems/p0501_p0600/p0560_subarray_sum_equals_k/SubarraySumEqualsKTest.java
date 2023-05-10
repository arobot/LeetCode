package com.arobotv.problems.p0501_p0600.p0560_subarray_sum_equals_k;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarraySumEqualsKTest {
    /**
     * 输入：nums = [1,1,1], k = 2
     * 输出：2
     */
    @Test
    void testSubarraySum() {
        int[] data = { 1, 1, 1 };
        int k = 2;
        int result = 2;
        SubarraySumEqualsK equalsK = new SubarraySumEqualsK();
        Assertions.assertEquals(result, equalsK.subarraySum(data, k));
    }

    /**
     * 输入：nums = [1,2,3], k = 3
     * 输出：2
     */
    @Test
    void testSubarraySum2() {
        int[] data = { 1, 2, 3 };
        int k = 3;
        int result = 2;
        SubarraySumEqualsK equalsK = new SubarraySumEqualsK();
        Assertions.assertEquals(result, equalsK.subarraySum(data, k));
    }

    /**
     * 输入：nums = [-1,-1,1], k = 0
     * 输出：1
     */
    @Test
    void testSubarraySum3() {
        int[] data = { -1, -1, 1 };
        int k = 0;
        int result = 1;
        SubarraySumEqualsK equalsK = new SubarraySumEqualsK();
        Assertions.assertEquals(result, equalsK.subarraySum(data, k));
    }
}
