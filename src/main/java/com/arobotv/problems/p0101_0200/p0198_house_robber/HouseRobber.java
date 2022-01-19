package com.arobotv.problems.p0101_0200.p0198_house_robber;

public class HouseRobber {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }

    public int rob2(int[] nums) {
        int rob = nums[0];
        int through = 0;
        for (int i = 1; i < nums.length; i++) {
            int tmp = through;
            through = Math.max(through, rob);
            rob = tmp + nums[i];
        }
        return Math.max(rob, through);
    }
}
