package com.arobotv.problems.p0201_0300.p0238_product_of_array_except_self;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {
    /*
     * 输入: nums = [1,2,3,4]
     * 输出: [24,12,8,6]
     */
    @Test
    void testProductExceptSelf() {
        ProductOfArrayExceptSelf exceptSelf = new ProductOfArrayExceptSelf();
        int[] data = { 1, 2, 3, 4 };
        int[] result = { 24, 12, 8, 6 };
        Assertions.assertArrayEquals(result, exceptSelf.productExceptSelf(data));
    }

    /*
     * 输入: nums = [-1,1,0,-3,3]
     * 输出: [0,0,9,0,0]
     */
    @Test
    void testProductExceptSelf2() {
        ProductOfArrayExceptSelf exceptSelf = new ProductOfArrayExceptSelf();
        int[] data = { -1, 1, 0, -3, 3 };
        int[] result = { 0, 0, 9, 0, 0 };
        Assertions.assertArrayEquals(result, exceptSelf.productExceptSelf(data));
    }
}
