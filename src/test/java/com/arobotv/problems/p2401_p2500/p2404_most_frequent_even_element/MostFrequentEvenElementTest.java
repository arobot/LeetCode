package com.arobotv.problems.p2401_p2500.p2404_most_frequent_even_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostFrequentEvenElementTest {
    /*
     * 输入：nums = [0,1,2,2,4,4,1]
     * 输出：2
     * 使用Assertions.assertEquals(expected, actual)进行断言
     *
     */
    @Test
    void testMostFrequentEven() {
        MostFrequentEvenElement mostFrequentEvenElement = new MostFrequentEvenElement();
        int[] nums = { 0, 1, 2, 2, 4, 4, 1 };
        int result = mostFrequentEvenElement.mostFrequentEven(nums);
        Assertions.assertEquals(2, result);
    }

    /*
     * 输入：nums = [4,4,4,9,2,4]
     * 输出：4
     * 使用Assertions.assertEquals(expected, actual)进行断言
     */
    @Test
    void testMostFrequentEven2() {
        MostFrequentEvenElement mostFrequentEvenElement = new MostFrequentEvenElement();
        int[] nums = { 4, 4, 4, 9, 2, 4 };
        int result = mostFrequentEvenElement.mostFrequentEven(nums);
        Assertions.assertEquals(4, result);
    }

    /*
     * 输入：nums = [29,47,21,41,13,37,25,7]
     * 输出：-1
     * 使用Assertions.assertEquals(expected, actual)进行断言
     */
    @Test
    void testMostFrequentEven3() {
        MostFrequentEvenElement mostFrequentEvenElement = new MostFrequentEvenElement();
        int[] nums = { 29, 47, 21, 41, 13, 37, 25, 7 };
        int result = mostFrequentEvenElement.mostFrequentEven(nums);
        Assertions.assertEquals(-1, result);
    }

        /*
     * 输入：nums = [8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290]
     * 输出：3346
     * 使用Assertions.assertEquals(expected, actual)进行断言
     */
    @Test
    void testMostFrequentEven4() {
        MostFrequentEvenElement mostFrequentEvenElement = new MostFrequentEvenElement();
        int[] nums = { 8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290 };
        int result = mostFrequentEvenElement.mostFrequentEven(nums);
        Assertions.assertEquals(3346, result);
    }
}
