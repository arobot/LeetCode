package com.arobotv.problems.p0001_p0100.p0034_find_first_and_last_position_of_element_in_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindSectionInSortedArrayTest {
    static FindSectionInSortedArray findSectionInSortedArray = new FindSectionInSortedArray();

    @Test
    void testSearchRange() {
        Assertions.assertArrayEquals(new int[] { 3, 4 },
                findSectionInSortedArray.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
    }

    @Test
    void testSearchRange2() {
        Assertions.assertArrayEquals(new int[] { -1, -1 },
                findSectionInSortedArray.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
    }

    @Test
    void testSearchRange3() {
        Assertions.assertArrayEquals(new int[] { -1, -1 },
                findSectionInSortedArray.searchRange(new int[] {}, 6));
    }

    @Test
    void testSearchRange4() {
        Assertions.assertArrayEquals(new int[] { -1, -1 },
                findSectionInSortedArray.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 60));
    }

    @Test
    void testSearchRange5() {
        Assertions.assertArrayEquals(new int[] { -1, -1 },
                findSectionInSortedArray.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 4));
    }

    @Test
    void testSearchRange6() {
        Assertions.assertArrayEquals(new int[] { 0, 0 },
                findSectionInSortedArray.searchRange(new int[] { 1 }, 1));
    }
    @Test
    void testSearchRange7() {
        Assertions.assertArrayEquals(new int[] { 0, 0 },
                findSectionInSortedArray.searchRange2(new int[] { 1 }, 1));
    }
}
