package com.arobotv.problems.p0101_0200.p0122_best_time_to_trade_stock_ii;

public class BestTimeToTradeStock2 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                dp[i][0] = dp[i - 1][0];
                dp[i][1] = dp[i - 1][0];
                dp[i][2] = -prices[i];
            } else {
                dp[i][0] = prices[i] + dp[i - 1][2] + dp[i - 1][1];
                dp[i][1] = dp[i - 1][1];
                dp[i][2] = dp[i - 1][2];
            }
        }
        return dp[prices.length - 1][0];
    }

    public int maxProfit2(int[] prices) {
        int sale = 0;
        int hold = 0;
        int cost = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) {
                hold = sale;
                cost = -prices[i];
            } else {
               sale = prices[i] + cost + hold;
            }
        }
        return sale;
    }

    public int maxProfit3(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
