# 寻找峰值

## 分析

峰值对应的鞍部，想要寻找到一个峰值点，则峰值点的两边必然是有一个递增和递减的趋势。

同时，算法要求要实现一个$O(log n)$的时间复杂度，这个时间复杂度模型常见于二分算法。所以，这里可以考虑任取一点分析其增减趋势继续，当得到一个区间的左边为递增趋势且右边为递减趋势的时候，基本可以肯定能够在其中找到一个峰值。

### 1. 二分查找

通过不断的在左右的增减区间跳转，一定会锁定任意一个峰值点出现。

```java
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        return findPeak(nums, 0, nums.length - 1);
    }

    int findPeak(int[] nums, int start, int end) {
        int mid = (start + end) >>> 1;
        if (end - start == 1) {
            return nums[start] < nums[end] ? end : start;
        }
        if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1])
            return findPeak(nums, mid, end);
        else if (nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1])
            return findPeak(nums, start, mid);
        else
            return findPeak(nums, start + 1, end);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：40.6 MB, 在所有 Java 提交中击败了19.51%的用户
