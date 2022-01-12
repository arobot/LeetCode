package com.arobotv.problems.p0001_0100.p0066_plus_one;

import com.arobotv.utils.PrintUtils;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] nums = new int[digits.length + 1];
        nums[0] = 1;
        return nums;
    }

    public static void main(String[] args) {
        int[] digits = { 1, 9, 9, 9 };
        PrintUtils.printArray(plusOne(digits));
    }
}
