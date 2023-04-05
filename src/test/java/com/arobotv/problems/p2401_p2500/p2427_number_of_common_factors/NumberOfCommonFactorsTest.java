package com.arobotv.problems.p2401_p2500.p2427_number_of_common_factors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfCommonFactorsTest {
    @Test
    void testCommonFactors() {
        NumberOfCommonFactors numberOfCommonFactors = new NumberOfCommonFactors();
        Assertions.assertEquals(4,numberOfCommonFactors.commonFactors(12, 6));
    }

    @Test
    void testCommonFactors2() {
        NumberOfCommonFactors numberOfCommonFactors = new NumberOfCommonFactors();
        Assertions.assertEquals(2,numberOfCommonFactors.commonFactors(25, 30));
    }
}
