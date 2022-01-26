package com.arobotv.problems.p0201_0300.p0268_missing_number;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        len = (1 + len) * len / 2;
        for (int i : nums) {
            len -= i;
        }
        return len;
    }

    public int missingNumber2(int[] nums) {
        int len = nums.length;
        int xor = 0;
        for (int i = 0; i < len; i++) {
            xor = xor ^ nums[i] ^ (i + 1);
        }
        return xor;
    }
}
