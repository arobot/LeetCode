# 合并区间

## 分析

各个区间没有说明是按照什么规律有单调性。所以第一步是解决整个数组基于某种规则的单调性问题，为后续合并做准备。

这里按照左或者右区间边界值都可以，假如我们选择左边界做单调性排序，那么后续过程只需要判断相邻区间的边界是否存在交集或者是否是子集的关系。

### 1. 排序后合并

```java
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[index][1] >= intervals[i][1]) {
                continue;
            } else if (intervals[index][1] >= intervals[i][0]) {
                intervals[index][1] = intervals[i][1];
            } else {
                intervals[++index] = intervals[i];
            }
        }
        return Arrays.copyOf(intervals, ++index);
    }
```

> 执行用时：6 ms, 在所有 Java 提交中击败了89.20%的用户
>
> 内存消耗：46.4 MB, 在所有 Java 提交中击败了7.61%的用户
