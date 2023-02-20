package com.arobotv.problems.p0101_0200.p0120_triangle;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        List<Integer> lastRow;
        List<Integer> curRow;
        for (int i = row - 2; i >= 0; i--) {
            lastRow = triangle.get(i);
            curRow = triangle.get(i + 1);
            for (int j = i; j >= 0; j--) {
                lastRow.set(j, lastRow.get(j) + Math.min(curRow.get(j), curRow.get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }
    /*
     * 执行用时：5 ms, 在所有 Java 提交中击败了21.97%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了78.00%的用户
     */

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3));
        System.out.println("data:" + minimumTotal(triangle));
    }
}
