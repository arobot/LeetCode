package com.arobotv.problems.p1001_p1100.p1043_partition_array_for_maximum_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionArrayForMaximumSumTest {
    /*
     * 输入：arr = [1,15,7,9,2,5,10], k = 3
     * 输出：84
     */
    @Test
    void testMaxSumAfterPartitioning() {
        PartitionArrayForMaximumSum partitionArrayForMaximumSum = new PartitionArrayForMaximumSum();
        int[] arr = { 1, 15, 7, 9, 2, 5, 10 };
        int k = 3;
        int result = partitionArrayForMaximumSum.maxSumAfterPartitioning(arr, k);
        Assertions.assertEquals(84, result);
    }

    /*
     * 输入：arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
     * 输出：83
     */
    @Test
    void testMaxSumAfterPartitioning2() {
        PartitionArrayForMaximumSum partitionArrayForMaximumSum = new PartitionArrayForMaximumSum();
        int[] arr = { 1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3 };
        int k = 4;
        int result = partitionArrayForMaximumSum.maxSumAfterPartitioning(arr, k);
        Assertions.assertEquals(83, result);
    }

    /*
     * 输入：arr = [1], k = 1
     * 输出：1
     */
    @Test
    void testMaxSumAfterPartitioning3() {
        PartitionArrayForMaximumSum partitionArrayForMaximumSum = new PartitionArrayForMaximumSum();
        int[] arr = { 1 };
        int k = 1;
        int result = partitionArrayForMaximumSum.maxSumAfterPartitioning(arr, k);
        Assertions.assertEquals(1, result);
    }
}
