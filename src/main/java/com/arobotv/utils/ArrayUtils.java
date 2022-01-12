package com.arobotv.utils;

public class ArrayUtils {
    public static void swap(int[] nums, int aIndex, int bIndex) {
        if (nums[aIndex] == nums[bIndex])
            return;
        nums[aIndex] ^= nums[bIndex];
        nums[bIndex] ^= nums[aIndex];
        nums[aIndex] ^= nums[bIndex];
    }

    public static void swap(int[][] nums, int[] aIndex, int[] bIndex) {
        if (nums[aIndex[0]][aIndex[1]] == nums[bIndex[0]][bIndex[1]])
            return;
        nums[aIndex[0]][aIndex[1]] ^= nums[bIndex[0]][bIndex[1]];
        nums[bIndex[0]][bIndex[1]] ^= nums[aIndex[0]][aIndex[1]];
        nums[aIndex[0]][aIndex[1]] ^= nums[bIndex[0]][bIndex[1]];
    }

}
