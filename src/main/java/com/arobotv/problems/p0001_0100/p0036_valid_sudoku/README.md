# 有效的数独

请你判断一个`9 x 9` 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。

1. 数字`1-9`在每一行只能出现一次。
1. 数字`1-9`在每一列只能出现一次。
1. 数字`1-9`在每一个以粗实线分隔的`3x3`宫内只能出现一次。（请参考示例图）

注意：

- 一个有效的数独（部分已被填充）不一定是可解的。
- 只需要根据以上规则，验证已经填入的数字是否有效即可。
- 空白格用 `'.'` 表示。

## 分析

一眼就是暴力求解直冲上脑。横向遍历，纵向遍历以及小正方形遍历。

### 1. 暴力求解

整个过程分为三个阶段。

1. 遍历横向是否有效
2. 遍历纵向是否有效
3. 遍历小方块是否有效

#### 横向

```java
    boolean validHorizontal(char[][] board) {
        int size = board.length;
        while (size-- > 0) {
            char[] horizontal = board[size];
            int[] h = new int[9];
            for (int i = 0; i < 9; i++) {
                if ('0' < horizontal[i] && horizontal[i] <= '9') {
                    int num = (int) (horizontal[i] - '1');
                    if (h[num] > 0)
                        return false;
                    else
                        h[num]++;
                }
            }
        }
        return true;
    }
```

#### 纵向

```java
    boolean validVertical(char[][] board) {
        int size = board.length;
        while (size-- > 0) {
            int[] h = new int[9];
            for (int i = 0; i < 9; i++) {
                if ('0' < board[i][size] && board[i][size] <= '9') {
                    int num = (int) (board[i][size] - '1');
                    if (h[num] > 0)
                        return false;
                    else
                        h[num]++;
                }
            }
        }
        return true;
    }
```

#### 小方块

```java
    boolean validSquare(char[][] board) {
        int h = 0, v = 0;
        while (h < 3) {
            while (v < 3) {
                int[] b = new int[9];
                for (int i = h * 3; i < h * 3 + 3; i++) {
                    for (int j = v * 3; j < v * 3 + 3; j++) {
                        if ('0' < board[i][j] && board[i][j] <= '9') {
                            int num = (int) (board[i][j] - '1');
                            if (b[num] > 0)
                                return false;
                            else
                                b[num]++;
                        }
                    }
                }
                v++;
            }
            v = 0;
            h++;
        }
        return true;
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了50.81%的用户
>
> 内存消耗：38.6 MB, 在所有 Java 提交中击败了32.27%的用户
