# 在排序数组中查找元素的第一个和最后一个位置

## 分析

使用二分查找，不断的切分数组。如果遇到二分时，刚好落在了等值的区间，则看当前区间是左还是右边界值，然后向对应边界扩展。

### 1. 二分查找

```java
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int left = -1;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] == target) {
                end = mid - 1;
                left = mid;
            } else
                start = mid + 1;
        }

        start = 0;
        end = nums.length - 1;
        int right = -1;
        while (start <= end) {
            int mid = start + end >>> 1;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] == target) {
                start = mid + 1;
                right = mid;
            } else
                start = mid + 1;
        }
        return new int[] { left, right };
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：44.2 MB, 在所有 Java 提交中击败了27.33%的用户

### 2. 常规遍历

```java
    public int[] searchRange2(int[] nums, int target) {
        int start = -1, end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                    end = i;
                } else
                    end = i;
            }
        }
        return new int[] { start, end };
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了12.05%的用户
>
> 内存消耗：44 MB, 在所有 Java 提交中击败了29.35%的用户
