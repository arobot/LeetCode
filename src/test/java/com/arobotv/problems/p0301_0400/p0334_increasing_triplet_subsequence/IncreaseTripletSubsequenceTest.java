package com.arobotv.problems.p0301_0400.p0334_increasing_triplet_subsequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreaseTripletSubsequenceTest {
    @Test
    void testIncreasingTriplet() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {1,2,3,4,5};
        Assertions.assertTrue(increaseTripletSubsequence.increasingTriplet(nums));
    }
    @Test
    void testIncreasingTriplet4() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {2,1,5,0,4,6};
        Assertions.assertTrue(increaseTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    void testIncreasingTriplet2() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {5,4,3,2,1};
        Assertions.assertFalse(increaseTripletSubsequence.increasingTriplet(nums));
    }


    @Test
    void testIncreasingTriplet3() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {2,1};
        Assertions.assertFalse(increaseTripletSubsequence.increasingTriplet(nums));
    }

    @Test
    void testIncreasingTriplet5() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {20,100,10,12,5,13};
        Assertions.assertTrue(increaseTripletSubsequence.increasingTriplet(nums));
    }
    @Test
    void testIncreasingTriplet6() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {1,5,0,4,1,3};
        Assertions.assertTrue(increaseTripletSubsequence.increasingTriplet(nums));
    }
    @Test
    void testIncreasingTriplet7() {
        IncreaseTripletSubsequence increaseTripletSubsequence = new IncreaseTripletSubsequence();
        int[] nums = {4,5,2147483647,1,2};
        Assertions.assertTrue(increaseTripletSubsequence.increasingTriplet(nums));
    }
}
