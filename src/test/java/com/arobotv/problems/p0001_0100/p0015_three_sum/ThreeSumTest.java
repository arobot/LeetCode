package com.arobotv.problems.p0001_0100.p0015_three_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {
    static ThreeSum threeSum = new ThreeSum();

    @Test
    void testThreeSum() {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        Assertions.assertEquals("[[-1, -1, 2], [-1, 0, 1]]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum2() {
        int[] nums = {};
        Assertions.assertEquals("[]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum3() {
        int[] nums = { 0 };
        Assertions.assertEquals("[]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum4() {
        int[] nums = { 1, -1 };
        Assertions.assertEquals("[]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum5() {
        int[] nums = { 0, 0, 0 };
        Assertions.assertEquals("[[0, 0, 0]]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum6() {
        int[] nums = { 0, 0, 0, 0 };
        Assertions.assertEquals("[[0, 0, 0]]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum7() {
        int[] nums = { -2, 0, 0, 2, 2 };
        Assertions.assertEquals("[[-2, 0, 2]]", threeSum.threeSum(nums).toString());
    }

    @Test
    void testThreeSum8() {
        int[] nums = { 3, 0, 3, 2, -4, 0, -3, 2, 2, 0, -1, -5 };
        Assertions.assertEquals("[[-5, 2, 3], [-4, 2, 2], [-3, 0, 3], [0, 0, 0]]", threeSum.threeSum(nums).toString());
    }
}
