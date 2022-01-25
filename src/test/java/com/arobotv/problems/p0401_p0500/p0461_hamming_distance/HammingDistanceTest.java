package com.arobotv.problems.p0401_p0500.p0461_hamming_distance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingDistanceTest {
    @Test
    void texthamming(){
        HammingDistance distance = new HammingDistance();
        Assertions.assertEquals(2, distance.hammingDistance(1, 4));
        Assertions.assertEquals(1, distance.hammingDistance(1, 3));
    }
}
