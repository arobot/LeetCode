# 阶乘后的零

## 分析

阶乘中尾数0的来源，必然来自阶乘数列中**2*5**的组合所得的0。将阶乘数列进行因式分解可得，分解出来的2必然是远多于5的个数的，故这个问题的求解变成了求解数列中因式分解后5的个数。

### 因式分解法

```java
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        while (n>1) {
            zeroCount += n / 5;
            n/=5;
        }
        return zeroCount;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.1 MB, 在所有 Java 提交中击败了45.02%的用户
