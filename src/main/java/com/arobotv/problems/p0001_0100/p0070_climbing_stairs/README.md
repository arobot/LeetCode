# 爬楼梯

假设你正在爬楼梯。需要 `n` 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

## 分析

示例 1：

```html
输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
```

示例 2：

```html
输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
```

示例3：

```html
输入： 4
输出： 5
解释： 有五种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶 + 1 阶
3.  2 阶 + 1 阶 + 1 阶
4.  1 阶 + 1 阶 + 2 阶
5.  2 阶 + 2 阶
```

假设函数 ${f(N)}$ 为计算爬楼方式的方法，`N`为楼梯数量。

因为每一步只能向前跨进1阶或者2阶，从示例3可以归纳得出

${f(4) = f(3)*1+f(2)*2}$

其中，`*` 符号表示步进阶梯数量。其实际的爬楼方法就是 ${f(N-1)}+f(N-2)$.

现在已经得出其计算方式。

### 1. 递归

$$
f(n)=
\begin{cases}
1, \quad n =1\\
2,\quad  n=2\\
3, \quad  n=3\\
f(n-1)+f(n-2), \quad  n>3
\end{cases}
\tag{1}
$$

```java
    public int recrusive(int n) {
        if (n < 1)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 3;
        return recrusive(n - 1) + recrusive(n - 2);
    }
```

递归是一个很简单清晰的思路，从代码上着手是很容易的事情，但是因为在进行分解的过程中，进行了非常多的重复计算，导致时间增长很快，达到了${O(2^n)}$。是很恐怖的增长。

所以我们必须对过程进行修改。很多的迭代过程实际上是重复执行，我们把前面执行过的数据存储下俩，当再次需要的时候，就直接读取即可。

```java
    int[] cache;

    public int climbStairs(int n) {
        cache = new int[n];
        return recrusive(n);
    }

    public int recrusive(int n) {
        if (n < 1)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (n == 3)
            return 3;
        if (cache[n - 1] > 0)
            return cache[n - 1];
        int steps = recrusive(n - 1) + recrusive(n - 2);
        cache[n - 1] = steps;
        return steps;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：35 MB, 在所有 Java 提交中击败了81.70%的用户

### 2. 动态规划

动态规划的思想区别于递归来讲，递归是自底而上，动态规划则从头开始向后。

```java
    public int dp(int n) {
        if (n <= 2)
            return n > 0 ? n : 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        int i = 3;
        while (i <= n) {
            dp[i] = dp[i - 1] + dp[i - 2];
            i++;
        }
        return dp[n];
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：35.1 MB, 在所有 Java 提交中击败了59.35%的用户
