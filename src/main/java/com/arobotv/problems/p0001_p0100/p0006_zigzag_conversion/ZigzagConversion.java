package com.arobotv.problems.p0001_p0100.p0006_zigzag_conversion;

public class ZigzagConversion {
    /*
     * 执行用时：4 ms, 在所有 Java 提交中击败了86.16%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了63.79%的用户
     */
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        // Z字形变换
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int rows2 = 0; rows2 < rows.length; rows2++) {
            rows[rows2] = new StringBuilder();
        }
        int rowIndex = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows[rowIndex].append(c);
            if (rowIndex == numRows - 1 || rowIndex == 0) {
                flag = -flag;
            }
            rowIndex += flag;
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : rows) {
            sb.append(row);
        }
        return sb.toString();
    }
}
