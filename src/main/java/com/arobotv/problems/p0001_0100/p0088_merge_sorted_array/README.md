# 合并两个有序数组

给你两个按**非递减顺序**排列的整数数组`nums1`和`nums2`，另有两个整数`m`和`n`，分别表示`nums1`和`nums2`中的元素数目。

请你**合并**`nums2`到`nums1`中，使合并后的数组同样按**非递减顺序**排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组`nums1`中。为了应对这种情况，`nums1`的初始长度为`m+n`，其中前`m`个元素表示应合并的元素，后`n`个元素为`0`，应忽略。`nums2`的长度为`n`。

## 分析

复用函数外观，可以从大到小进行合并。

### 1. 递归合并

```java
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0)
            return;
        if (m == 0)
            nums1[n - 1] = nums2[n-- - 1];
        else if (n == 0)
            nums1[m - 1] = nums1[m-- - 1];
        else if (nums1[m - 1] < nums2[n - 1])
            nums1[m + n - 1] = nums2[n-- - 1];
        else
            nums1[m + n - 1] = nums1[m-- - 1];
        merge(nums1, m, nums2, n);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.5 MB, 在所有 Java 提交中击败了60.07%的用户
