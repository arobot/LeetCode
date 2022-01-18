package com.arobotv.problems.p0101_0200.p0121_best_time_to_trade_stock;

public class BestTimeToTradeStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    /**
     * 优化动态规划
     * 
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        if (prices.length == 1)
            return 0;

        int sold = 0;
        int bought = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sold = Math.max(sold, bought + prices[i]);
            bought = Math.max(bought, -prices[i]);
        }
        return sold;
    }
}
