package com.arobotv.problems.p0101_0200.p0119_pascals_triangle_ii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleII {
    /*
     * 执行用时：1 ms, 在所有 Java 提交中击败了77.56%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了80.67%的用户
     */
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex;
        List<Integer> last = Collections.singletonList(1);
        List<Integer> current = last;
        while (numRows > 0) {
            current = new ArrayList<>();
            current.add(1);
            for (int i = 1; i < last.size(); i++) {
                current.add(last.get(i - 1) + last.get(i));
            }
            current.add(1);
            numRows--;
            last = current;
        }
        return current;
    }

    /**
     * 使用公式
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了82.99%的用户
     * 
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow2(int rowIndex) {
        List<Integer> last = new ArrayList<>() {
            {
                add(1);
            }
        };
        for (int i = 1; i < rowIndex + 1; i++) {
            last.add((int) ((long) last.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return last;
    }
}
