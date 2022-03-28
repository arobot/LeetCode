package com.arobotv.problems.p0101_0200.p0171_excel_sheet_column_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelColumnNumberTest {
    private final ExcelColumnNumber columnNumber = new ExcelColumnNumber();
    @Test
    void testTitleToNumber() {
        Assertions.assertEquals(1, columnNumber.titleToNumber("A"));
    }

    @Test
    void testTitleToNumber2() {
        Assertions.assertEquals(28, columnNumber.titleToNumber("AB"));
    }

    @Test
    void testTitleToNumber3() {
        Assertions.assertEquals(701, columnNumber.titleToNumber("ZY"));
    }

    @Test
    void testTitleToNumber4() {
        Assertions.assertEquals(702, columnNumber.titleToNumber("ZZ"));
    }

}
