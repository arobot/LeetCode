package com.arobotv.problems.p0201_0300.p0217_contains_duplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    @Test
    void testContainsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = new int[]{1,2,3,1};
        Assertions.assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate2() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = new int[]{1,2,3,4};
        Assertions.assertFalse(containsDuplicate.containsDuplicate(nums));
    }
}
