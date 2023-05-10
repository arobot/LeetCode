package com.arobotv.problems.p0201_0300.p0238_product_of_array_except_self;

public class ProductOfArrayExceptSelf {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：50.5 MB, 在所有 Java 提交中击败了11.98%的用户
     */
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        result[0] = 1;
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int r = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= r;
            r *= nums[i];
        }
        return result;
    }
}
