package com.arobotv.problems.p0101_0200.p0190_reverse_bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseBitsTest {
    @Test
    void testReverseBits(){
        ReverseBits reverseBits = new ReverseBits();
        Assertions.assertEquals(0b11111111111111110000000000000000, reverseBits.reverseBits(0b00000000000000001111111111111111));
        Assertions.assertEquals(0xaaaaaaaa, reverseBits.reverseBits(0x55555555));
        Assertions.assertEquals(-1, reverseBits.reverseBits(-1));
        Assertions.assertEquals(Integer.MAX_VALUE, reverseBits.reverseBits(0xffffffff-1));
    }
}
