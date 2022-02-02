# 递增的三元子序列

给你一个整数数组 `nums` ，判断这个数组中是否存在长度为 `3` 的递增子序列。

如果存在这样的三元组下标 `(i, j, k)` 且满足 `i < j < k` ，使得 `nums[i] < nums[j] < nums[k]` ，返回 `true` ；否则，返回 `false` 。

## 分析

遍历数组，通过比较不断获取较小值和次小值。如果后续的遍历过程找到一个比前面两个值大的，就算通过。

### 1. 遍历比较

```java
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;
        int small  = Integer.MAX_VALUE,mid = Integer.MAX_VALUE;
        for(int num :nums){
            if(num<=small){
                small = num;
            }else if(num<=mid){
                mid = num;
            }else{
                return true;
            }
        }
        return false;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了99.94%的用户
>
> 内存消耗：82 MB, 在所有 Java 提交中击败了5.34%的用户
