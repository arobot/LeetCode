package com.arobotv.problems.p0001_p0100.p0006_zigzag_conversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigzagConversionTest {
    @Test
    void testConvert() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = zigzagConversion.convert(s, numRows);
        Assertions.assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void testConvert2() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = zigzagConversion.convert(s, numRows);
        Assertions.assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    void testConvert3() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String s = "AB";
        int numRows = 1;
        String result = zigzagConversion.convert(s, numRows);
        Assertions.assertEquals("AB", result);
    }
}
