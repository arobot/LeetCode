package com.arobotv.problems.p0201_0300.p0268_missing_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {
    @Test
    void testSum() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = { 3, 0, 1 };
        Assertions.assertEquals(2, missingNumber.missingNumber(nums));
    }

    @Test
    void testSum2() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = { 0, 1 };
        Assertions.assertEquals(2, missingNumber.missingNumber(nums));
    }

    @Test
    void testSum3() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Assertions.assertEquals(8, missingNumber.missingNumber(nums));
    }
    @Test
    void testSum4() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0};
        Assertions.assertEquals(1, missingNumber.missingNumber(nums));
    }

    @Test
    void testXor() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = { 3, 0, 1 };
        Assertions.assertEquals(2, missingNumber.missingNumber2(nums));
    }

    @Test
    void testXor2() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = { 0, 1 };
        Assertions.assertEquals(2, missingNumber.missingNumber2(nums));
    }

    @Test
    void testXor3() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Assertions.assertEquals(8, missingNumber.missingNumber2(nums));
    }
    @Test
    void testXor4() {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0};
        Assertions.assertEquals(1, missingNumber.missingNumber2(nums));
    }
}
