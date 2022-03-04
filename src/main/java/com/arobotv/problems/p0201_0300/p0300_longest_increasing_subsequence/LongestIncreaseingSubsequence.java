package com.arobotv.problems.p0201_0300.p0300_longest_increasing_subsequence;

public class LongestIncreaseingSubsequence {
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
}
