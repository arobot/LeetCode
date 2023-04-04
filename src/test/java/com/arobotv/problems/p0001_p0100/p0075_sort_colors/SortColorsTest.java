package com.arobotv.problems.p0001_p0100.p0075_sort_colors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SortColorsTest {

    @Test
    void sortColors() {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        Assertions.assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, nums);
    }

    @Test
    void sortColors2() {
        int[] nums = { 2, 0, 1 };
        SortColors sortColors = new SortColors();
        sortColors.sortColors(nums);
        Assertions.assertArrayEquals(new int[] { 0, 1, 2 }, nums);
    }

    @Test
    void sortColors3() {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        SortColors sortColors = new SortColors();
        sortColors.sortColors2(nums);
        Assertions.assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, nums);
    }

    @Test
    void sortColors4() {
        int[] nums = { 2, 0, 1 };
        SortColors sortColors = new SortColors();
        sortColors.sortColors2(nums);
        Assertions.assertArrayEquals(new int[] { 0, 1, 2 }, nums);
    }

    @Test
    void sortColors5() {
        int[] nums = { 1, 2, 0 };
        SortColors sortColors = new SortColors();
        sortColors.sortColors2(nums);
        Assertions.assertArrayEquals(new int[] { 0, 1, 2 }, nums);
    }
}
