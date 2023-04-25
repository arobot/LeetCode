package com.arobotv.problems.p0101_0200.p0169_majority_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    /*
     * 输入：nums = [3,2,3]
     * 输出：3
     */
    @Test
    void testMajorityElement() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = new int[] { 3, 2, 3 };
        int result = majorityElement.majorityElement(nums);
        Assertions.assertEquals(3, result);
    }

    /*
     * 输入：nums = [2,2,1,1,1,2,2]
     * 输出：2
     */
    @Test
    void testMajorityElement2() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        int result = majorityElement.majorityElement(nums);
        Assertions.assertEquals(2, result);
    }
}
