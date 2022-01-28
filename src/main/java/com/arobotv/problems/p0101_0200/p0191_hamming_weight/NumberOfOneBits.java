package com.arobotv.problems.p0101_0200.p0191_hamming_weight;

public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int weight = 0;
        do {
            weight += n & 1;
            n = n >>> 1;
        } while (n != 0);
        return weight;
    }

    public int hammingWeight2(int n) {
        return Integer.bitCount(n);
    }
}