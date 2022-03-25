package com.arobotv.problems.p0101_0200.p0172_factorial_trailing_zeroes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrailingZeroesTest {
    private static TrailingZeroes trailingZeroes = new TrailingZeroes();

    @Test
    void testTrailingZeroes() {
        Assertions.assertEquals(0, trailingZeroes.trailingZeroes(4));
    }

    @Test
    void testTrailingZeroes2() {
        Assertions.assertEquals(1, trailingZeroes.trailingZeroes(5));
    }

    @Test
    void testTrailingZeroes3() {
        Assertions.assertEquals(2, trailingZeroes.trailingZeroes(10));
    }

    @Test
    void testTrailingZeroes4() {
        Assertions.assertEquals(4, trailingZeroes.trailingZeroes(20));
    }

    @Test
    void testTrailingZeroes5() {
        Assertions.assertEquals(6, trailingZeroes.trailingZeroes(25));
    }

    @Test
    void testTrailingZeroes6() {
        Assertions.assertEquals(7, trailingZeroes.trailingZeroes(30));
    }
}
