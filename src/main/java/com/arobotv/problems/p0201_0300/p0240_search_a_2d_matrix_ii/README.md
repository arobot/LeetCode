# 搜索二维矩阵 II

## 分析

先进行两次二分查找首行和首列，得到一个可用的最大行列号。再对所有可查找的行进行二分查找，边界值为最大列的号。

### 1. 多次二分

```java
    public boolean searchMatrix(int[][] matrix, int target) {
        int mi = matrix.length - 1, mj = matrix[0].length - 1;
        int l = 0, r = matrix.length - 1;
        while (l <= r) {
            int m = (r + l) >>> 1;
            if (matrix[m][0] > target) {
                r = m - 1;
                mi = r;
            } else if (matrix[m][0] < target)
                l = m + 1;
            else
                return true;
        }
        l = 0;
        r = matrix[0].length - 1;
        while (l <= r) {
            int m = (r + l) >>> 1;
            if (matrix[0][m] > target) {
                r = m - 1;
                mj = r;
            } else if (matrix[0][m] < target)
                l = m + 1;
            else
                return true;
        }
        for (int i = 0; i <= mi; i++) {
            l = 0;
            r = mj;
            while (l <= r) {
                int m = (r + l) >>> 1;
                if (matrix[i][m] > target) {
                    r = m - 1;
                } else if (matrix[i][m] < target)
                    l = m + 1;
                else
                    return true;
            }
        }
        return false;
    }
```

> 执行用时：5 ms, 在所有 Java 提交中击败了94.68%的用户
>
> 内存消耗：46.7 MB, 在所有 Java 提交中击败了33.02%的用户

### 2. Z字搜索

```java
    public boolean searchMatrix2(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] < target)
                i++;
            else if (target < matrix[i][j])
                j--;
            else
                return true;
        }
        return false;
    }
```
