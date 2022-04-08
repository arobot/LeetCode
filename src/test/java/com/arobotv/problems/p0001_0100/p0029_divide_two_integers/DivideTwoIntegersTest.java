package com.arobotv.problems.p0001_0100.p0029_divide_two_integers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideTwoIntegersTest {

    private final DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    void testDivide() {
        Assertions.assertEquals(3, divideTwoIntegers.divide(10, 3));
    }

    @Test
    void testDivide2() {
        Assertions.assertEquals(5, divideTwoIntegers.divide(15, 3));
    }

    @Test
    void testDivide3() {
        Assertions.assertEquals(Integer.MAX_VALUE, divideTwoIntegers.divide(Integer.MIN_VALUE, -1));
    }

    @Test
    void testDivide4() {
        Assertions.assertEquals(8, divideTwoIntegers.divide(-17, -2));
    }

    @Test
    void testDivide5() {
        Assertions.assertEquals(-2, divideTwoIntegers.divide(7, -3));
    }

    @Test
    void testDivide6() {
        Assertions.assertEquals(Integer.MAX_VALUE, divideTwoIntegers.divide(Integer.MAX_VALUE, 1));
    }

    @Test
    void testDivide7() {
        Assertions.assertEquals(Integer.MIN_VALUE / 2, divideTwoIntegers.divide(Integer.MIN_VALUE, 2));
    }

    @Test
    void testDivide8() {
        Assertions.assertEquals(-1, divideTwoIntegers.divide(1, -1));
    }

    @Test
    void testDivide9() {
        Assertions.assertEquals(Integer.MAX_VALUE / 3, divideTwoIntegers.divide(Integer.MAX_VALUE, 3));
    }

    @Test
    void testDivide10() {
        Assertions.assertEquals(-1, divideTwoIntegers.divide(1100540749, -1090366779));
    }

    @Test
    void testDivide11() {
        Assertions.assertEquals(Integer.MAX_VALUE/2, divideTwoIntegers.divide(Integer.MAX_VALUE, 2));
    }
}
