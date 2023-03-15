package com.arobotv.problems.p0301_0400.p0350_intersection_of_two_arrays_ii;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersetcionOfTwoArraysTest {

    static IntersetcionOfTwoArrays twoArrays = new IntersetcionOfTwoArrays();

    @Test
    void testOne() {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = twoArrays.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
        Assertions.assertEquals("[2, 2]", Arrays.toString(result));
        int[] nums3 = { 1, 2, 2, 1 };
        int[] nums4 = { 2, 2 };
        result = twoArrays.intersect2(nums3, nums4);
        Assertions.assertEquals("[2, 2]", Arrays.toString(result));

    }

    @Test
    void testTwo() {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] result = twoArrays.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
        Assertions.assertEquals("[4, 9]", Arrays.toString(result));

        int[] nums3 = { 4, 9, 5 };
        int[] nums4 = { 9, 4, 9, 8, 4 };
        result = twoArrays.intersect2(nums3, nums4);
        Assertions.assertEquals("[4, 9]", Arrays.toString(result));
    }

    @Test
    void test3() {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = twoArrays.intersect3(nums1, nums2);
        System.out.println(Arrays.toString(result));
        Assertions.assertEquals("[2, 2]", Arrays.toString(result));

    }

    @Test
    void test4() {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] result = twoArrays.intersect3(nums1, nums2);
        System.out.println(Arrays.toString(result));
        Assertions.assertEquals("[9, 4]", Arrays.toString(result));
    }
}
