package com.arobotv.problems.p0001_0100.p0001_two_sum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] { hashMap.get(target - nums[i]), i };
            }
            hashMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 6;
        for (int j : twoSum(nums, target))
            System.out.println(j);
    }
}