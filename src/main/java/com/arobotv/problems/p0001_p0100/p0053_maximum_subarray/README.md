# 最大子数组和

给你一个整数数组 `nums` ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。

示例 1：

```txt
输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
```

示例 2：

```txt
输入：nums = [1]
输出：1
```

示例 3：

```txt
输入：nums = [5,4,-1,7,8]
输出：23
```

## 分析

动态规划先画图

|   -   |  -2   |   1   |  -3   |   4   |  -1   |   2   |   1   |  -5   |   4   |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  -2   |  -2   |  -1   |  -4   |   0   |  -1   |   1   |   2   |  -3   |   1   |
|   1   |   -   |   1   |  -2   |   2   |   1   |   3   |   4   |  -1   |   3   |
|  -3   |   -   |   -   |  -3   |   1   |   0   |   2   |   3   |  -2   |   2   |
|   4   |   -   |   -   |   -   |   4   |   3   |   5   |   6   |   1   |   5   |
|  -1   |   -   |   -   |   -   |   -   |  -1   |   1   |   2   |  -3   |   1   |
|   2   |   -   |   -   |   -   |   -   |   -   |   2   |   3   |  -2   |   2   |
|   1   |   -   |   -   |   -   |   -   |   -   |   -   |   1   |  -4   |   0   |
|  -5   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |  -5   |  -1   |
|   4   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   4   |

上图实际上很难看出状态和转移过程，下面对上图进行精简：

|   -   |  -2   |   1   |  -3   |   4   |  -1   |   2   |   1   |  -5   |   4   |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  -2   |  -2   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |
|   1   |   -   |   1   |  -2   |   -   |   -   |   -   |   -   |   -   |   -   |
|  -3   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |
|   4   |   -   |   -   |   -   |   4   |   3   |   5   |   6   |   1   |   5   |
|  -1   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |
|   2   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |
|   1   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |
|  -5   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |
|   4   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |   -   |

观察精简后的表格，假定状态列表 `dp[9]`,初始状态 `dp[0] = -2`，而`dp[i]`存储累积到当前位置的连续最大和。条件转移方程是当`dp[i]<0 && nums[i+1]>0`时，直接切换到当前值开始计算。即`dp[i+1]=max(dp[i]+nums[i+1],nums[i+1])`.

### 1. 动态规划

```java
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
```

> 执行用时：3 ms, 在所有 Java 提交中击败了17.67%的用户
>
> 内存消耗：46.6 MB, 在所有 Java 提交中击败了99.57%的用户

### 2. 动态规划优化

使用`dp`数组时，实际上每次只会使用到前一个索引的值，所以可以优化到使用一个临时变量存储即可。

```java
    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int cur = max;
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(cur, 0) + nums[i];
            max = Math.max(cur, max);
        }
        return max;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：48 MB, 在所有 Java 提交中击败了74.08%的用户
>> 和方法内存消耗相比，真是大大的疑惑？？