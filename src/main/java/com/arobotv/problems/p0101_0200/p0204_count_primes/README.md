# 计数质数

统计所有小于非负整数 `n` 的质数的数量。

## 分析

质数的概念：只能被1和自己整除的数，就是质数。

[艾拉托斯特尼筛法（OI Wiki)](https://oi-wiki.org/math/number-theory/sieve/) 中说明，如果从小到大考虑每个数，然后同时把当这个数的所有倍数标记为合数，那么运行结束时没有被标记的就是素数了。

### 1. 艾拉托斯特尼筛法

#### 原始方法

```java
    public int countPrimes(int n) {
        boolean[] b = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (b[i] == true)
                continue;
            count++;
            for (int j = i * 2; j < n; j += i) {
                b[j] = true;
            }
        }
        return count;
    }
```

> 执行用时：119 ms, 在所有 Java 提交中击败了71.95%的用户
>
> 内存消耗：42.8 MB, 在所有 Java 提交中击败了65.54%的用户

#### 优化1.去掉偶数

上述方法中，其实大于2的偶数都是不用去判定的，首先可以去掉这一半的判定时间。

```java
    public int countPrimes(int n) {
        boolean[] b = new boolean[n];
        int count = n > 2 ? 1 : 0;
        for (int i = 3; i < n; i += 2) {
            if (b[i] == true)
                continue;
            count++;
            for (int j = i * 2; j < n; j += i) {
                b[j] = true;
            }
        }
        return count;
    }
```

> 执行用时：100 ms, 在所有 Java 提交中击败了90.80%的用户
>
> 内存消耗：42.7 MB, 在所有 Java 提交中击败了76.34%的用户
