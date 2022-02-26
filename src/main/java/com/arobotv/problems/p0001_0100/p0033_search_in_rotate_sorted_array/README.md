# 搜索旋转排序数组

## 分析

数组本身一定是分段有序的。找到一个`nums[m]`值时，m的左右两边一定是有一个区间有序的，如果这个target处于这个有序区间，则正常二分，反之再另外一个区间中继续查找。

### 1. 二分查找

```java
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (nums[l] > target && nums[r] < target)
            return -1;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] == target)
                return m;
            if (nums[m] >= nums[l]) {// 左边有序
                if (nums[l] <= target && target <= nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            } else {
                if (nums[m] <= target && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }

        }
        return -1;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：40.4 MB, 在所有 Java 提交中击败了34.41%的用户
