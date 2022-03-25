package com.arobotv.problems.p0101_0200.p0172_factorial_trailing_zeroes;

public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        while (n>1) {
            zeroCount += n / 5;
            n/=5;
        }
        return zeroCount;
    }
}
