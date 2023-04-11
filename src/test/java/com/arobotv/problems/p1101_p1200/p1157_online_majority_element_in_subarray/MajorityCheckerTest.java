package com.arobotv.problems.p1101_p1200.p1157_online_majority_element_in_subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityCheckerTest {
    @Test
    void testQuery() {
        int[] arr = new int[]{1, 1, 2, 2, 1, 1};
        MajorityChecker majorityChecker = new MajorityChecker(arr);
        Assertions.assertEquals(1, majorityChecker.query(0, 5, 4));
    }

    @Test
    void testQuery2() {
        int[] arr = new int[]{1, 1, 2, 2, 1, 1};
        MajorityChecker majorityChecker = new MajorityChecker(arr);
        Assertions.assertEquals(-1, majorityChecker.query(0, 3, 3));
    }

    @Test
    void testQuery3() {
        int[] arr = new int[]{1, 1, 2, 2, 1, 1};
        MajorityChecker majorityChecker = new MajorityChecker(arr);
        Assertions.assertEquals(2, majorityChecker.query(2, 3, 2));
    }
}
