package com.arobotv.problems.p0001_p0100.p0046_permutations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PermutationsTest {
    @Test
    void testPermute() {
        Permutations permutations = new Permutations();
        Assertions.assertEquals("[[1]]", permutations.permute(new int[] { 1 }).toString());
        Assertions.assertEquals("[[1, 2], [2, 1]]", permutations.permute(new int[] { 1, 2 }).toString());
        Assertions.assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", permutations.permute(new int[] { 1, 2 ,3}).toString());
        Assertions.assertEquals("[[1]]", permutations.permute2(new int[] { 1 }).toString());
        Assertions.assertEquals("[[1, 2], [2, 1]]", permutations.permute2(new int[] { 1, 2 }).toString());
        Assertions.assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", permutations.permute2(new int[] { 1, 2 ,3}).toString());
    }
}
