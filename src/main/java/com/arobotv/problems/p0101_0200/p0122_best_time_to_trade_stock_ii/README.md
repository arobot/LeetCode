# 买卖股票的最佳时机II

给定一个数组 `prices` ，其中 `prices[i]` 是一支给定股票第 `i` 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

## 分析

动态规划例子

表格1

价格|7|1|5|3|6|4
:-:|:-:|:-:|:-:|:-:|:-:|:-:
卖出利润|0|0|4|4|7|7
持有成本|-7|-1|-1|-3|-3|-4
操作|买入|切换买入|尝试卖出|确认前日卖出并买入|尝试卖出|确认前日卖出并买入

表格2

价格|7|1|5|3|6|7|4
:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:
卖出利润|0|0|4|4|7|8|8
持有利润|0|0|0|4|4|4|8
持有成本|-7|-1|-1|-3|-3|-3|-4
操作|买入|切换买入|尝试卖出|确认前日卖出并买入|尝试卖出|尝试卖出|确认前日卖出并买入

通过表格2可以推演出，我们需要保持三项数据。并在当日尝试卖出与前一日卖出进行比较，如果前一日卖出利润更高，则确认卖出操作并买入。

假设状态转移存到`dp[length][3]`,初始状态如下

```java
dp[0][0] = 0
dp[0][1] = 0
dp[0][2] = -price[0]
```

状态转移公式如下

```java
if(price[i]<price[i-1]){
    dp[i][0] = dp[i-1][0]   //确认前一次卖出，利润保持不变
    dp[i][1] = dp[i-1][0]   //确认前一次卖出，持有利润=前一天卖出的利润
    dp[i][2] = -price[i]    //确认前一日卖出，今天买入更新成本
}else{
    dp[i][0]= price[i] + dp[i-1][2] + dp[i-1][1]    //今日尝试卖出，更新利润
    dp[i][1] = dp[i-1][1]                           //今日保持持有，利润持平昨日
    dp[i][2] = dp[i-1][2]                            //尝试日，持有成本不变
}
```

### 1. 动态规划

```java
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
```

> 执行用时：3 ms, 在所有 Java 提交中击败了22.94%的用户
>
> 内存消耗：38.1 MB, 在所有 Java 提交中击败了56.68%的用户

### 2. 动态规划优化

数组中只用了前一天的状态，所以可以将其优化。

```java
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
```

> 执行用时：1 ms, 在所有 Java 提交中击败了99.59%的用户
>
> 内存消耗：38.2 MB, 在所有 Java 提交中击败了51.96%的用户

### 3. 贪心

```java
    public int maxProfit3(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit+=(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了99.59%的用户
>
> 内存消耗：38.3 MB, 在所有 Java 提交中击败了27.72%的用户
