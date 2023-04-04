package com.arobotv.problems.p0001_p0100.p0069_sqrtx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SqrtTest {
    private final Sqrt sqrt = new Sqrt();

    @Test
    void testMySqrt() {
        Assertions.assertEquals(2, sqrt.mySqrt(4));
    }

    @Test
    void testMySqrt2() {
        Assertions.assertEquals(2, sqrt.mySqrt(8));
    }

    @Test
    void testMySqrt3() {
        Assertions.assertEquals(1, sqrt.mySqrt(1));
    }

    @Test
    void testMySqrt4() {
        double sqrt2 = Math.sqrt(Integer.MAX_VALUE);
        Assertions.assertEquals(Math.floor(sqrt2), sqrt.mySqrt(Integer.MAX_VALUE));
    }
}
