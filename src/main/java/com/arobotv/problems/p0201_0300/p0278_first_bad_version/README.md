# 第一个错误版本

你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。

假设你有 `n` 个版本 `[1, 2, ..., n]`，你想找出导致之后所有版本出错的第一个错误的版本。

你可以通过调用`bool isBadVersion(version)`接口来判断版本号 `version` 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。

## 分析

这个题目的目的，就是在一个数组中，通过一个外部的方法作为辅助，进行数据查找。而错误的数据是连续保存在数组的后半段。类似一个搜索的算法，可以从后往前暴力遍历，也可以直接上二分查找。

### 1. 二分查找

二分查找通过不断的找到头上的`badVersion`这个点，并将结束版本号进行前移。在最终会找到一个点处在最开始坏掉的地方。

```java
    public int firstBadVersion(int n) {
        return firstBadVersion(0, n);
    }

    public int firstBadVersion(int s, int e) {
        int mid = (e >> 1) + (s >> 1);
        if (s == e)
            return e;
        if (isBadVersion(mid))
            return firstBadVersion(s, mid);
        else
            return firstBadVersion(mid + 1, e);
    }
```

> 执行用时：11 ms, 在所有 Java 提交中击败了99.95%的用户
>
> 内存消耗：35 MB, 在所有 Java 提交中击败了77.65%的用户

### 2. 暴力查找

我不禁想看看暴力查找的时间。

```java
    public int firstBadVersion(int n) {
        while (isBadVersion(n)) {
            n--;
        }
        return n + 1;
    }
```

直接就超时了。
