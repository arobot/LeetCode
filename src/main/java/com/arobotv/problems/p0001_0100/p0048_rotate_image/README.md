## 关键字
- 顺时针90°
- 原地旋转
- 二维矩阵

## 分析

- 将矩阵以对角线划分，对角线到中线所包含的元素恰好占所有元素的1/4
- 将上述1/4元素循环向横坐标和纵坐标旋转对称循环即可完成一次旋转
- 每次向内层收缩后，该循环横坐标+1
- 收缩到中点结束

### 1. 原始逻辑

按照x轴方向行进，遍历y轴深度。

```java
    public static void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int edge = n - 1;
        for (int x = 0; x < edge; x++) {
            int level = level(x, edge);
            for (int y = 0; y < level; y++) {
                int temp = matrix[x][y];
                int count = 4;
                while (count-- > 0) {
                    int x1 = x;
                    int y1 = y;
                    if (x != y) {
                        x ^= y;
                        y ^= x;
                        x ^= y;
                    }
                    if (count > 0)
                        matrix[x1][y1] = matrix[x = edge - x][y];
                    else {
                        x = edge - x;
                        matrix[x1][y1] = temp;
                    }
                }
            }
        }
    }

    static int level(int x, int edge) {
        x += 1;
        int deep = (edge + 1) / 2;
        if (x > deep) {
            if (edge % 2 == 1)
                return 2 * deep - x;
            else
                return 2 * deep - x + 1;
        } else
            return x;

    }
```
### 2. 层先法

上述方法纠结最久的是深度的计算。通过分层处理应该可以简化逻辑。

最大层数`level`和矩阵边长`n`的关系为：

${level=n/2}$

每一层需要旋转的数量`length`和`level`也存在如下关系：

${length = n - 2*level - 1}$

因为每一层需要遍历的长度只需要从起点开始到转角之前。

```java
public static void rotate2(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length)
            return;
        int n = matrix.length;
        int level = n / 2;
        while (level-- > 0) {
            int length = n - 2 * level - 1;
            for (int i = 0; i < length; i++) {
                int x = i + level;
                int y = level;
                int temp = matrix[x][y];
                int count = 4;
                while (count-- > 0) {
                    int x1 = x;
                    int y1 = y;
                    if (x != y) {
                        x ^= y;
                        y ^= x;
                        x ^= y;
                    }
                    if (count > 0)
                        matrix[x1][y1] = matrix[x = n - 1 - x][y];
                    else {
                        x = n - 1 - x;
                        matrix[x1][y1] = temp;
                    }
                }
            }
        }
    }
```

### 3. 先对称，后翻转

原始矩阵

|1|2|3|
---|---|---
|4|5|6|
|7|8|9|

对称

|9|6|3|
---|---|---
|8|5|2|
|7|4|1|

翻转
|7|4|1|
---|---|---
|8|5|2|
|9|6|3|

```java
    public static void rotate3(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length)
            return;
        int n = matrix.length;
        for (int x = 0; x < n - 1; x++) {
            for (int y = 0; y < n - 1 - x; y++) {
                ArrayUtils.swap(matrix, new int[] { x, y }, new int[] { n - 1 - y, n - 1 - x });
            }
        }
        for (int x = 0; x < n / 2; x++) {
            for (int y = 0; y < n; y++) {
                ArrayUtils.swap(matrix, new int[] { x, y }, new int[] { n - 1 - x, y });
            }
        }
    }
```