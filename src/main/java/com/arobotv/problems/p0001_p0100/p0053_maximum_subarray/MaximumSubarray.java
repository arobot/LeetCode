package com.arobotv.problems.p0001_p0100.p0053_maximum_subarray;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = max;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int cur = max;
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(cur, 0) + nums[i];
            max = Math.max(cur, max);
        }
        return max;
    }
}
