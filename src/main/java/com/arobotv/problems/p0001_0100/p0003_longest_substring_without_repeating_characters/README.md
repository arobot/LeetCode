# 无重复字符的最长子串

给定一个字符串 `s` ，请你找出其中不含有重复字符的 最长子串 的长度。

## 分析

当往后遍历的过程中，随时都可能遇到一个前面出现过的字符，如何找到这个在前面出现过的位置，就是现在需要考虑的重点。

使用一个`HashMap`或许可以很好的解决这个问题。

### 1. HashMap 窗口滑动

```java
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> cMap = new HashMap<>();
        int fast = 0, slow = 0;
        int length = 0;

        for (char c : s.toCharArray()) {
            int exist = cMap.getOrDefault(c, -1);
            if (exist >= slow)
                slow = exist + 1;
            cMap.put(c, fast);
            fast++;
            length = Math.max(length, fast - slow);
        }
        return length;
    }
```

> 执行用时：4 ms, 在所有 Java 提交中击败了86.84%的用户
>
> 内存消耗：41.5 MB, 在所有 Java 提交中击败了5.01%的用户
