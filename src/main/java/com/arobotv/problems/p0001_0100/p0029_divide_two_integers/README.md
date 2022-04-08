# 两数相除

## 分析

不断倍增除数后，与被除数做比较。当倍增到大于被除数后，找到商的上界，可以缩减规模，循环求解。

## 辗转相除

```java
    public int divide(int dividend, int divisor) {
        // 边界条件
        if (divisor == 1)
            return dividend;
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            return -dividend;
        }

        boolean negative = (dividend >>> 31 ^ divisor >>> 31) == 1;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int result = 0;
        int count = 1;
        int baseDivisor = divisor;
        while (dividend <= baseDivisor) {
            //通过被除数减半进行判断，防止超出Integer范围溢出
            //只能小于，右移时会丢失精度
            while ((dividend >> 1) < divisor) {
                count <<= 1;
                divisor <<= 1;
            }
            result += count;
            dividend -= divisor;
            count = 1;
            divisor = baseDivisor;
        }
        return negative ? -result : result;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.3 MB, 在所有 Java 提交中击败了75.23%的用户
