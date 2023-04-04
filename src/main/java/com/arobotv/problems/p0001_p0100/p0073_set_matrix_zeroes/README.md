# 矩阵置零

给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。

## 分析

因为只能将原始的数据0所在行和列置零，可以考虑先遍历后置零的操作。

### 1. 行列存储法

使用两个`Set`把遇见的横纵坐标记录下来，最大使用$O(m+n)$的空间

```java
    public void setZeroes(int[][] matrix) {
        int h = matrix.length;
        int v = matrix[0].length;
        Set<Integer> hSet = new HashSet<>();
        Set<Integer> vSet = new HashSet<>();
        for(int i = 0;i<h;i++){
            for(int j=0;j<v;j++){
                if(matrix[i][j]==0){
                    hSet.add(i);
                    vSet.add(j);
                }
            }
        }
        for(int i = 0;i<h;i++){
            for(int j=0;j<v;j++){
                if(hSet.contains(i)||vSet.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了21.14%的用户
>
> 内存消耗：42.6 MB, 在所有 Java 提交中击败了5.03%的用户

### 2. 现有首行列暂存

```java
public void setZeroes2(int[][] matrix) {
        int h = matrix.length;
        int v = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstRowZero = true;
                    if (j == 0)
                        firstColZero = true;
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < v; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int i = 0; i < v; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < h; i++) {
                matrix[i][0] = 0;
            }
        }
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：43.1 MB, 在所有 Java 提交中击败了5.03%的用户
