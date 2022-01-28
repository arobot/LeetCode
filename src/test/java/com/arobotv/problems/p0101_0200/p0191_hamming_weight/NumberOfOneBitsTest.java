package com.arobotv.problems.p0101_0200.p0191_hamming_weight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfOneBitsTest {
    @Test
    void testHammingWeight() {
NumberOfOneBits bits = new NumberOfOneBits();
Assertions.assertEquals(1, bits.hammingWeight(1));
Assertions.assertEquals(3, bits.hammingWeight(11));
Assertions.assertEquals(1, bits.hammingWeight(2));
Assertions.assertEquals(1, bits.hammingWeight(1));
Assertions.assertEquals(31, bits.hammingWeight(Integer.MAX_VALUE));
Assertions.assertEquals(32, bits.hammingWeight(-1));
    }
}
