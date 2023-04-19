package com.arobotv.problems.p1001_p1100.p1043_partition_array_for_maximum_sum;

public class PartitionArrayForMaximumSum {
    /*
     * 执行用时：6 ms, 在所有 Java 提交中击败了59.92%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了45.46%的用户
     */
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        // dp[i] = max(dp[i], dp[i - j] + max(arr[i - j + 1], ..., arr[i]) * j)
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            // j = 1, 2, ..., k
            for (int j = 1; j <= k && i - j + 1 >= 0; j++) {
                // 判断当前窗口[i-k+1,i]最大值
                max = Math.max(max, arr[i - j + 1]);
                // 动态转移，判断当前窗口划定的k个数是否大于之前的最大值
                dp[i] = Math.max(dp[i], (i >= j ? dp[i - j] : 0) + max * j);
            }
        }
        return dp[arr.length - 1];
    }
}
