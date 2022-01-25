# 汉明距离

两个整数之间的 `汉明距离` 指的是这两个数字对应二进制位不同的位置的数目。

给你两个整数 `x` 和 `y`，计算并返回它们之间的汉明距离。

## 分析

异或操作：相异为1，相同为0.

然后统计1的个数。

### 1.异或后求位1的数量

```java
    public int hammingDistance(int x,int y){
        x= x^y;
        return Integer.bitCount(x);
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.8 MB, 在所有 Java 提交中击败了5.46%的用户