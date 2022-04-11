package com.arobotv.problems.p0101_0200.p0166_fraction_to_recurring_decimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private final Solution solution = new Solution();
    @Test
    void testFractionToDecimal() {
        Assertions.assertEquals("1.5", solution.fractionToDecimal(3, 2));
    }

    @Test
    void testFractionToDecimal2() {
        Assertions.assertEquals("-1.5", solution.fractionToDecimal(-3, 2));
    }

    @Test
    void testFractionToDecimal3() {
        Assertions.assertEquals("1", solution.fractionToDecimal(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void testFractionToDecimal4() {
        Assertions.assertEquals("0.(012)", solution.fractionToDecimal(4, 333));
    }

    @Test
    void testFractionToDecimal5() {
        Assertions.assertEquals("0.(000136863)", solution.fractionToDecimal(45621, 333333333));
    }


    @Test
    void testFractionToDecimal6() {
        Assertions.assertEquals(String.valueOf(Integer.MIN_VALUE), solution.fractionToDecimal(Integer.MIN_VALUE, 1));
    }

    @Test
    void testFractionToDecimal7() {
        Assertions.assertEquals("-0.58(3)", solution.fractionToDecimal(7, -12));
    }


}
