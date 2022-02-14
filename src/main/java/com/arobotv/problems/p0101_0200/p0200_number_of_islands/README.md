# 岛屿数量

## 分析

DFS遍历

### 1. DFS

通过深度遍历，找到第一个为`1`的点之后，将该点四周进行深度优先遍历，并把遇到的`1`全部都置为`0`.

```java
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int i, int j) {
        int h = grid.length;
        int v = grid[0].length;
        if (i < 0 || j < 0 || i >= h || j >= v)
            return;

        if (grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了99.80%的用户
>
> 内存消耗：49.8 MB, 在所有 Java 提交中击败了7.89%的用户
