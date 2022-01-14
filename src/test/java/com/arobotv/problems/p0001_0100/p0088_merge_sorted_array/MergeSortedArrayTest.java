package com.arobotv.problems.p0001_0100.p0088_merge_sorted_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import com.arobotv.utils.ArrayUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    static MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    void testMerge() {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertEquals("[1, 2, 2, 3, 5, 6]", ArrayUtils.asList(nums1).toString());
    }

    @Test
    void testMerge2() {
        int[] nums1 = { 1 }, nums2 = {};
        int m = 1, n = 0;
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertEquals("[1]", ArrayUtils.asList(nums1).toString());
    }

    @Test
    void testMerge3() {
        int[] nums1 = { 0 }, nums2 = { 1 };
        int m = 0, n = 1;
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertEquals("[1]", ArrayUtils.asList(nums1).toString());
    }
}
