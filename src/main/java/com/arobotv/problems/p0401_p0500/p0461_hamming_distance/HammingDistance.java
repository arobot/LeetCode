package com.arobotv.problems.p0401_p0500.p0461_hamming_distance;

public class HammingDistance {
    public int hammingDistance(int x,int y){
        x= x^y;
        return Integer.bitCount(x);
    }
}
