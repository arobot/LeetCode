# Pow(x,n)

## 分析

幂计算就是计算一个数的连乘。

负数的意义就是把计算的结果放在分母上。

## 递归

```java
    public double myPow(double x, int n) {
        double result = recrusive(x, 1.0, n);
        return n > 0 ? result : 1 / result;
    }

    public double recrusive(double x, double result, int n) {
        if (n == 0)
            return result;
        if (n % 2 != 0)
            result *= x;
        return recrusive(x * x, result, n / 2);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：40.4 MB, 在所有 Java 提交中击败了46.60%的用户
