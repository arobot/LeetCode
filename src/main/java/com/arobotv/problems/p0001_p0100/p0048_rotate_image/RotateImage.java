package com.arobotv.problems.p0001_p0100.p0048_rotate_image;

import com.arobotv.utils.ArrayUtils;
import com.arobotv.utils.PrintUtils;

public class RotateImage {
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

    public static void main(String[] args) {
        // int[][] matrix = {
        // { 2, 29, 20, 26, 16, 28 },
        // { 12, 27, 9, 25, 13, 21 },
        // { 32, 33, 32, 2, 28, 14 },
        // { 13, 14, 32, 27, 22, 26 },
        // { 33, 1, 20, 7, 21, 7 },
        // { 4, 24, 1, 6, 32, 34 }
        // };

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] matrix = {
        // { 1, 2, 3, 4, 5 },
        // { 6, 7, 8, 9, 10 },
        // { 11, 12, 13, 14, 15 },
        // { 16, 17, 18, 19, 20 },
        // { 21, 22, 23, 24, 25 }
        // };
        rotate3(matrix);
        PrintUtils.printMatrix(matrix);
    }
}
