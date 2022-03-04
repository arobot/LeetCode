# 零钱兑换

## 分析

自底而上的分析。从1元钱开始，每一份总额都会有一种方案对应最少的零钱兑换数量。

假设方程$F(S)$是金额$S$的对应的零钱兑换数量，那么其能够兑换的最小数量，就是扣除任意一个存在的零钱后，能够得到的最少零钱数量+1

这样，状态转移方程就出来。

### 1. 动态规划

```java
    public int coinChange(int[] coins, int amount) {
        int[] nums = new int[amount + 1];
        Arrays.fill(nums, amount + 1);
        nums[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    nums[i] = Math.min(nums[i], nums[i - coins[j]] + 1);
            }
        }
        return nums[amount] > amount ? -1 : nums[amount];
    }
```

> 执行用时：12 ms, 在所有 Java 提交中击败了81.98%的用户
>
> 内存消耗：40.6 MB, 在所有 Java 提交中击败了39.42%的用户
