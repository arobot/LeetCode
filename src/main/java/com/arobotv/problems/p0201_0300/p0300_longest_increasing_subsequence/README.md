# 最长递增子序列

## 分析

本来试着从正向从0到i的方向思考问题，奈何一直不通。是因为，在往后的过程中，遇到一个更大的数的时候，并不知道需要往前回溯多少，所以动态转移方程也并不好做。

试着假设`dp[i]`为元素`i`到数组结尾的最长递增子序列时，只需要在前方寻找到一个小于该值的元素，即可将序列长度加1.

所以，这里得到了一个从`len->0`以及嵌套的`i-len`的循环，获得$O(n^2)$的时间复杂度。

### 1. 动态规划

```java
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i; j < nums.length; j++) {
                dp[i] = Math.max(dp[i], nums[i] < nums[j] ? dp[j] + 1 : 1);
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
```

> 执行用时：78 ms, 在所有 Java 提交中击败了5.14%的用户
>
> 内存消耗：40.9 MB, 在所有 Java 提交中击败了16.57%的用户

### 2. 贪心+二分

贪心的思想是，当每次都往后面追加足够小的元素时，有足够的几率使最长子序列变长。

```java
    public int lengthOfLIS2(int[] nums) {
        int[] sorted = new int[nums.length];
        int index = 0;
        for (int i : nums) { // 遍历元素
            int l = 0, r = index; // 固定边界
            while (l < r) { // 找到待插入的点；二分查找
                int m = l + ((r - l) >>> 1); // 确定中点
                if (sorted[m] < i) { // 目的在于找到最大的小于i的元素，确定插入i的位置
                    l = m + 1; // 确定插入i的位置
                } else
                    r = m; // 缩小又边界
            }
            sorted[l] = i; // 替换位置
            if (index == r) // 稳定最长子序列的长度。只有在替换到等于之前的最长边界时，才扩展边界
                index++;
        }
        return index;
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了99.73%的用户
>
> 内存消耗：40.5 MB, 在所有 Java 提交中击败了40.54%的用户
