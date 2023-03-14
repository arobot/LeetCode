package com.arobotv.utils;

import java.util.LinkedList;

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

    public static LinkedList<Integer> asList(int[] nums) {
        if (nums == null || nums.length == 0)
            return new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : nums) {
            list.add(i);
        }
        return list;
    }

    public static LinkedList<Character> asList(char[] nums) {
        if (nums == null || nums.length == 0)
            return new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (Character i : nums) {
            list.add(i);
        }
        return list;
    }

    public  static <T> LinkedList<T> asList(T[] nums) {
        if (nums == null || nums.length == 0)
            return new LinkedList<>();
        LinkedList<T> list = new LinkedList<>();
        for (T i : nums) {
            list.add(i);
        }
        return list;
    }
}
