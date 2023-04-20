package com.arobotv.problems.p1101_p1200.p1187_make_array_strictly_increasing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeArrayStrictlyIncreasingTest {
    /*
     * 输入：arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
     * 输出：1
     */
    @Test
    void testMakeArrayIncreasing() {
        int[] arr1 = { 1, 5, 3, 6, 7 };
        int[] arr2 = { 1, 3, 2, 4 };
        MakeArrayStrictlyIncreasing makeArrayStrictlyIncreasing = new MakeArrayStrictlyIncreasing();
        int result = makeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2);
        Assertions.assertEquals(1, result);
    }

    /*
     * 输入：arr1 = [1,5,3,6,7], arr2 = [4,3,1]
     * 输出：2
     */
    @Test
    void testMakeArrayIncreasing2() {
        int[] arr1 = { 1, 5, 3, 6, 7 };
        int[] arr2 = { 4, 3, 1 };
        MakeArrayStrictlyIncreasing makeArrayStrictlyIncreasing = new MakeArrayStrictlyIncreasing();
        int result = makeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2);
        Assertions.assertEquals(2, result);
    }

    /*
     * 输入：arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
     * 输出：-1
     */
    @Test
    void testMakeArrayIncreasing3() {
        int[] arr1 = { 1, 5, 3, 6, 7 };
        int[] arr2 = { 1, 6, 3, 3 };
        MakeArrayStrictlyIncreasing makeArrayStrictlyIncreasing = new MakeArrayStrictlyIncreasing();
        int result = makeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2);
        Assertions.assertEquals(-1, result);
    }

    /*
     * 输入：arr1 = [0,11,6,1,4,3], arr2 = [5,4,11,10,1,0]
     * 输出：5
     */
    @Test
    void testMakeArrayIncreasing4() {
        int[] arr1 = { 0, 11, 6, 1, 4, 3 };
        int[] arr2 = { 5, 4, 11, 10, 1, 0 };
        MakeArrayStrictlyIncreasing makeArrayStrictlyIncreasing = new MakeArrayStrictlyIncreasing();
        int result = makeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2);
        Assertions.assertEquals(5, result);
    }

    /*
     * 输入：arr1 = [5,16,19,2,1,12,7,14,5,16], arr2 =
     * [6,17,4,3,6,13,4,3,18,17,16,7,14,1,16]
     * 输出：8
     */
    @Test
    void testMakeArrayIncreasing5() {
        int[] arr1 = { 5, 16, 19, 2, 1, 12, 7, 14, 5, 16 };
        int[] arr2 = { 6, 17, 4, 3, 6, 13, 4, 3, 18, 17, 16, 7, 14, 1, 16 };
        MakeArrayStrictlyIncreasing makeArrayStrictlyIncreasing = new MakeArrayStrictlyIncreasing();
        int result = makeArrayStrictlyIncreasing.makeArrayIncreasing(arr1, arr2);
        Assertions.assertEquals(8, result);
    }
}
