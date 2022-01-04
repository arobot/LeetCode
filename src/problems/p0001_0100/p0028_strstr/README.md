# 实现 strStr()

实现`strStr()`函数。

给你两个字符串`haystack` 和 `needle` ，请你在 `haystack` 字符串中找出 `needle`字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 `-1` 。

说明：

当`needle`是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当`needle`是空字符串时我们应当返回`0`。这与 C 语言的`strstr()`以及 Java 的`indexOf()`定义相符。

## 关键字

- 包含字符串

## 分析

该题涉及到两个字符串的比较，并且把原字符串 `haystack` 和目标字符串 `needle` 指明。显然是遍历 `haystack` 并从中匹配 `needle` 的字符。

在遍历 `haystack` 的过程中，可能会碰到能够匹配 `needle` 开头的字符串并重复出现的情况。更有甚者，`needle` 会出现 "ababcd" 的情况，在 `haystack` 中呈现出 "abababcd",会出现连续匹配头的状况，需要小心处理。

### 1. 暴力求解

`haystack` 依次往后面遍历循环比对 `needle`,最差时间复杂度${O(M*N)}$

### 2. KMP算法

经典字符串匹配算法，难点在于求解 `prefix table`.

