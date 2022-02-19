# 单词搜索

## 分析

类似于岛屿数量问题处理，只不过涉及到了回溯的问题。将搜索到的已经匹配的值暂时设置为常数以避免重复进入。

### 1. 遍历回溯

```java
public boolean exist(char[][] board, String word) {
        exist = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtrack(board, i, j, 0, word);
            }
        }
        return exist;
    }

    boolean exist = false;

    void backtrack(char[][] board, int i, int j, int index, String word) {
        if (index == word.length()) {
            exist = true;
            return;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return;

        if (board[i][j] == '1')
            return;

        if (board[i][j] == word.charAt(index)) {
            board[i][j] = '1';
            backtrack(board, i + 1, j, index + 1, word);
            backtrack(board, i - 1, j, index + 1, word);
            backtrack(board, i, j + 1, index + 1, word);
            backtrack(board, i, j - 1, index + 1, word);
            board[i][j] = word.charAt(index);
        } else {
            return;
        }
    }
```

> 执行用时：85 ms, 在所有 Java 提交中击败了73.84%的用户
>
> 内存消耗：39.5 MB, 在所有 Java 提交中击败了14.11%的用户
