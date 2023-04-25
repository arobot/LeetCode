package com.arobotv.problems.p1001_p1100.p1027_longest_arithmetic_subsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestArithmeticSubsequenceTest {
    /*
     * 输入：nums = [3,6,9,12]
     * 输出：4
     */
    @Test
    void testLongestArithSeqLength() {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        int[] nums = new int[] { 3, 6, 9, 12 };
        int result = longestArithmeticSubsequence.longestArithSeqLength(nums);
        Assertions.assertEquals(4, result);
    }

    /*
     * 输入：nums = [9,4,7,2,10]
     * 输出：3
     */
    @Test
    void testLongestArithSeqLength2() {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        int[] nums = new int[] { 9, 4, 7, 2, 10 };
        int result = longestArithmeticSubsequence.longestArithSeqLength(nums);
        Assertions.assertEquals(3, result);
    }

    /*
     * 输入：nums = [20,1,15,3,10,5,8]
     * 输出：4
     */
    @Test
    void testLongestArithSeqLength3() {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        int[] nums = new int[] { 20, 1, 15, 3, 10, 5, 8 };
        int result = longestArithmeticSubsequence.longestArithSeqLength(nums);
        Assertions.assertEquals(4, result);
    }

    /*
     * 输入：nums = [24,13,1,100,0,94,3,0,3]
     * 输出：2
     */
    @Test
    void testLongestArithSeqLength4() {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        int[] nums = new int[] { 24, 13, 1, 100, 0, 94, 3, 0, 3 };
        int result = longestArithmeticSubsequence.longestArithSeqLength(nums);
        Assertions.assertEquals(2, result);
    }

    /*
     * 输入：nums = [0,8,45,88,48,68,28,55,17,24]
     * 输出：2
     */
    @Test
    void testLongestArithSeqLength5() {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        int[] nums = new int[] { 0, 8, 45, 88, 48, 68, 28, 55, 17, 24 };
        int result = longestArithmeticSubsequence.longestArithSeqLength(nums);
        Assertions.assertEquals(2, result);
    }

    /*
     * 输入：nums =
     * [48,37,51,45,48,48,22,7,30,55,3,54,57,53,13,39,27,8,49,19,47,1,6,42,20,13,13,
     * 42,49,46,12,30,41,30,59,51,11,54,35,17,7,28,43,29,22,37,48,11,5,2,49,55,10,3,
     * 47,56,4,32,24,59,46,12,17,43,11,56,33,27,25,49,41,13,31,41,28,22,48,45,36,48,
     * 28,33,10,26,42,58,56,21,58,54,7,22,4,54,45,56,58,47,13,27]
     * 输出：6
     */
    @Test
    void testLongestArithSeqLength6() {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        int[] nums = new int[] { 48, 37, 51, 45, 48, 48, 22, 7, 30, 55, 3, 54, 57, 53, 13, 39, 27, 8, 49, 19, 47, 1,
                6, 42, 20, 13, 13, 42, 49, 46, 12, 30, 41, 30, 59, 51, 11, 54, 35, 17, 7, 28, 43, 29, 22, 37, 48, 11, 5,
                2, 49, 55, 10, 3, 47, 56, 4, 32, 24, 59, 46, 12, 17, 43, 11, 56, 33, 27, 25, 49, 41, 13, 31, 41, 28, 22,
                48, 45, 36, 48, 28, 33, 10, 26, 42, 58, 56, 21, 58, 54, 7, 22, 4, 54, 45, 56, 58, 47, 13, 27 };
        int result = longestArithmeticSubsequence.longestArithSeqLength(nums);
        Assertions.assertEquals(6, result);
    }
}
