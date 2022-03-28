package com.arobotv.problems.p0101_0200.p0171_excel_sheet_column_number;

public class ExcelColumnNumber {
    public int titleToNumber(String columnTitle) {
        int n = 0;
        for (int i = 0;i<columnTitle.length();i++) {
            n *= 26;
            n += charToInteger(columnTitle.charAt(i));
        }
        return n;
    }

    public int charToInteger(char c) {
        return c - 'A' + 1;
    }
}
