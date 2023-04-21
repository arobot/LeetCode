package com.arobotv.problems.p2401_p2500.p2413_smallest_even_multiple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestEvenMultipleTest {
    /*
     * 输入：n = 5
     * 输出：10
     */
    @Test
    void testSmallestEvenMultiple() {
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        int n = 5;
        int result = smallestEvenMultiple.smallestEvenMultiple(n);
        Assertions.assertEquals(10, result);
    }

    /*
     * 输入：n = 6
     * 输出：6
     */
    @Test
    void testSmallestEvenMultiple2() {
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        int n = 6;
        int result = smallestEvenMultiple.smallestEvenMultiple(n);
        Assertions.assertEquals(6, result);
    }
}
