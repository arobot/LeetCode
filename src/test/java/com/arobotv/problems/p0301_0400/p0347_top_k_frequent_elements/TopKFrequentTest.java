package com.arobotv.problems.p0301_0400.p0347_top_k_frequent_elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKFrequentTest {
    @Test
    void testTopKFrequent() {
        TopKFrequent topKFrequent = new TopKFrequent();
        Assertions.assertArrayEquals(new int[] { 1, 2 }, topKFrequent.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
        Assertions.assertArrayEquals(new int[] { 1 }, topKFrequent.topKFrequent(new int[] { 1 }, 1));
    }
}
