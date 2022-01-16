package com.arobotv.problems.p0001_0100.p0070_climbing_stairs;

public class ClimbingStairs {
    int[] cache;

    public int climbStairs(int n) {
        cache = new int[n];
        return recrusive(n);
    }

    public int recrusive(int n) {
        if (n <= 3)
            return n > 0 ? n : 0;
        if (cache[n - 1] > 0)
            return cache[n - 1];
        int steps = recrusive(n - 1) + recrusive(n - 2);
        cache[n - 1] = steps;
        return steps;
    }

    public int dp(int n) {
        if (n <= 2)
            return n > 0 ? n : 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        int i = 3;
        while (i <= n) {
            dp[i] = dp[i - 1] + dp[i - 2];
            i++;
        }
        return dp[n];
    }

    public int dp2(int n) {
        if (n <= 2)
            return n > 0 ? n : 0;
        int a = 1, b = 2;
        int i = 3;
        while (i <= n) {
            int tmp = b;
            b = a + b;
            a = tmp;
            i++;
        }
        return b;
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        long start = System.currentTimeMillis();
        climbingStairs.dp(450);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }
}
