package com.arobotv.utils;

public class PrintUtils {
    public static void printArray(int[] arrays) {
        for (int n : arrays)
            System.out.print(n + ", ");
        System.out.println();
    }

    public static void printArray(char[] arrays) {
        for (char n : arrays)
            System.out.print(n + ", ");
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrix[x][y] + ", ");
            }
            System.out.println(" ");
        }
    }
}
