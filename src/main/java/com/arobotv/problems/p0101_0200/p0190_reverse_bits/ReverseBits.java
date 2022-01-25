package com.arobotv.problems.p0101_0200.p0190_reverse_bits;

public class ReverseBits {
    public int reverseBits(int n) {
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n << 1 & 0xaaaaaaaa));
        n = ((n & 0xcccccccc) >>> 2) | ((n << 2 & 0xcccccccc));
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n << 4 & 0xf0f0f0f0));
        n = ((n & 0xff00ff00) >>> 8) | ((n << 8 & 0xff00ff00));
        n = ((n & 0xffff0000) >>> 16) | ((n << 16 & 0xffff0000));
        return n;
    }

}

