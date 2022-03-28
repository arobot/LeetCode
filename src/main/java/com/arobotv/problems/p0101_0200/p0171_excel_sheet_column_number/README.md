# Excel表序列号

## 分析

字母`A-Z`分别代表了`1-26`，实际上是实现了一个26进制转10进制的逻辑。

## 遍历

```java
    public int titleToNumber(String columnTitle) {
        int n = 0;
        for (int i = 0;i<columnTitle.length();i++) {
            n *= 26;
            n += charToInteger(columnTitle.charAt(i));
        }
        return n;
    }

    public int charToInteger(char c) {
        return c - 'A' + 1;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.9 MB, 在所有 Java 提交中击败了51.83%的用户
