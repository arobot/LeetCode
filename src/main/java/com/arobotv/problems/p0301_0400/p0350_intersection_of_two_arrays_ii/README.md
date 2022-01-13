# 两个数组的交集 II

给你两个整数数组 `nums1` 和 `nums2` ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。

## 分析

必须要对两个数组进行遍历才能得到结果，暴力求解是一个直观的思考结果。先用暴力求解的方式获取结果。

### 1. 暴力遍历

暴力两层遍历 `nums1` 和 `nums2` ,当找到一个交集元素，Inplace修改 `num1` 中的元素存储匹配的数据，并将 `nums2` 中的数据设置为 `-1` 以避免下次匹配上。这里设置为 `-1` 是因为原题目中有数据下限为 `0` 。

```java
    public int[] intersect(int[] nums1, int[] nums2) {
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums1[index] = nums1[i];
                    nums2[j] = -1;
                    index++;
                    break;
                }
            }
        }
        return Arrays.copyOf(nums1, index);
    }
```

> 执行用时：3 ms, 在所有 Java 提交中击败了43.17%的用户
>
> 内存消耗：38.5 MB, 在所有 Java 提交中击败了71.99%的用户

### 2. 先排序，后双指针

先对数组进行排序，排序后，使用两个指针同时遍历数组。因为两个数组都是有序的，所以不用考虑指针需要回溯的问题。

两个数进行比较，如果相等，那么同时递增。如果不等，则递增当前值较小的指针。这里也用了Inplace修改保存返回值。

```java
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums1[index++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(nums1, index);
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了99.82%的用户
>
> 内存消耗：38.6 MB, 在所有 Java 提交中击败了54.10%的用户
