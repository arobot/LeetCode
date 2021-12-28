### 关键字

- 轮转K位
- 向高位方向轮转

### 进阶

- 三种方法
- `in place` 空间复杂度为${O(1)}$解决

### 分析

1. 轮转k位相当于将高位的[n-k,n-k+1,...,n]位移动到[0,1,...,k-1]上，原位置的数据依次向高位移动

#### 解法思路
序号|解法|简述|时间复杂度|空间复杂度
---|---|---|---|---
1|临时数组|按轮转序号依次拷贝到新数组|${O(N)}$|${O(N)}$
2|就地修改|直接交换需要的数组|${O(N)}$|${O(1)}$
3|翻转法|两次翻转|${O(N)}$|${O(1)}$

#### 就地翻转

```java
    static void rotate2(int[] nums, int k) {
        k %= nums.length;
        int length = nums.length;
        int n = 0;
        if (k == 0)
            return;
        while (k>0) {
            for (int i = 0; i < k; i++) {
                swap(nums, n + i, length - k + i);
            }
            n += k;
            k %= (length - n);
        }
    }

    static void swap(int[] nums, int aIndex, int bIndex) {
        if (nums[aIndex] == nums[bIndex])
            return;
        nums[aIndex] ^= nums[bIndex];
        nums[bIndex] ^= nums[aIndex];
        nums[aIndex] ^= nums[bIndex];
    }
```

通过不断的翻转剩余数组解决问题。