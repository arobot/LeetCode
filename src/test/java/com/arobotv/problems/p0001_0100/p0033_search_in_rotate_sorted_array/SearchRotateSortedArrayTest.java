package com.arobotv.problems.p0001_0100.p0033_search_in_rotate_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchRotateSortedArrayTest {
    static SearchRotateSortedArray searchRotateSortedArray = new SearchRotateSortedArray();

    @Test
    void testSearch() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(4, searchRotateSortedArray.search(nums, 0));
    }

    @Test
    void testSearch2() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(3, searchRotateSortedArray.search(nums, 7));
    }

    @Test
    void testSearch3() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(2, searchRotateSortedArray.search(nums, 6));
    }

    @Test
    void testSearch4() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(5, searchRotateSortedArray.search(nums, 1));
    }

    @Test
    void testSearch5() {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        Assertions.assertEquals(-1, searchRotateSortedArray.search(nums, 3));
    }

    @Test
    void testSearch6() {
        int[] nums = { 1 };
        Assertions.assertEquals(0, searchRotateSortedArray.search(nums, 1));
    }

    @Test
    void testSearch7() {
        int[] nums = { 1 };
        Assertions.assertEquals(-1, searchRotateSortedArray.search(nums, -11));
    }

    @Test
    void testSearch8() {
        int[] nums = { 5,1,3 };
        Assertions.assertEquals(2, searchRotateSortedArray.search(nums, 3));
    }
}
