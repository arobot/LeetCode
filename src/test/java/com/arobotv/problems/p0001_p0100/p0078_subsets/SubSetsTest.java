package com.arobotv.problems.p0001_p0100.p0078_subsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SubSetsTest {
    @Test
    void testSubsets() {
        SubSets subSets = new SubSets();
        Assertions.assertEquals("[[], [0]]", subSets.subsets(new int[] { 0 }).toString());
        Assertions.assertEquals("[[], [0], [0, 1], [1]]", subSets.subsets(new int[] { 0, 1 }).toString());
        Assertions.assertEquals("[[], [0], [0, 1], [0, 1, 2], [0, 2], [1], [1, 2], [2]]", subSets.subsets(new int[] { 0, 1,2 }).toString());
    }
}
