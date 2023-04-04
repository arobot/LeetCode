package com.arobotv.problems.p0001_p0100.p0073_set_matrix_zeroes;

import com.arobotv.utils.PrintUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetMetrixZeroesTest {
    static SetMetrixZeroes setMetrixZeroes = new SetMetrixZeroes();

    @Test
    void testOne() {
        int[][] nums = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setMetrixZeroes.setZeroes(nums);
        // PrintUtils.printMatrix(nums);
        Assertions.assertEquals(0, nums[1][0]);
        Assertions.assertEquals(0, nums[1][3]);
        Assertions.assertEquals(0, nums[2][0]);
        Assertions.assertNotEquals(0, nums[2][1]);
    }

    @Test
    void testTwo() {
        int[][] nums = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setMetrixZeroes.setZeroes2(nums);
        PrintUtils.printMatrix(nums);
        Assertions.assertEquals(0, nums[1][0]);
        Assertions.assertEquals(0, nums[1][3]);
        Assertions.assertEquals(0, nums[2][0]);
        Assertions.assertNotEquals(0, nums[2][1]);
    }
}
