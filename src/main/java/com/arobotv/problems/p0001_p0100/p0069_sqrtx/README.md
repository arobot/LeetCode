# x的平方根

## 分析

寻找第一个平方刚好小于该数的数字。

## 二分

```java
    public int mySqrt(int x) {
        int min = 1, max = x;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (x / mid == mid)
                return mid;
            if (x / mid < mid)
                max = mid - 1;
            else
                min = mid + 1;

        }
        return max;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了95.07%的用户
>
> 内存消耗：38.5 MB, 在所有 Java 提交中击败了48.96%的用户
