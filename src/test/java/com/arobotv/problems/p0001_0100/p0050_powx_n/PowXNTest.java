package com.arobotv.problems.p0001_0100.p0050_powx_n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowXNTest {
    private final PowXN powXN = new PowXN();

    @Test
    void testMyPow() {
        Assertions.assertEquals(1024f, powXN.myPow(2, 10));
    }

    @Test
    void testMyPow2() {
        Assertions.assertEquals(Math.pow(2.1, 3), powXN.myPow(2.1, 3));
    }

    @Test
    void testMyPow3() {
        Assertions.assertEquals(0.25000f, powXN.myPow(2, -2));
    }

    @Test
    void testMyPow4() {
        Assertions.assertEquals(Math.pow(0.44528, 0), powXN.myPow(0.44528, 0));
    }

    @Test
    void testMyPow5() {
        Assertions.assertEquals(Math.pow(0.00001, Integer.MAX_VALUE), powXN.myPow(0.00001, Integer.MAX_VALUE));
    }

    @Test
    void testMyPow6() {
        Assertions.assertEquals(Math.pow(2, Integer.MIN_VALUE), powXN.myPow(2, Integer.MIN_VALUE));
    }
}
