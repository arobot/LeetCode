package com.arobotv.problems.p0201_0300.p0278_first_bad_version;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {
    @Test
    void testFirstBadVersion() {
        int firstBad = 5;
        FirstBadVersion firstBadVersion = new FirstBadVersion(firstBad);
        Assertions.assertEquals(firstBad,
                firstBadVersion.firstBadVersion(firstBad + new Random(30).nextInt(Integer.MAX_VALUE - firstBad)));
    }

    @Test
    void testFirstBadVersion2() {
        int firstBad = 68932;
        FirstBadVersion firstBadVersion = new FirstBadVersion(firstBad);
        Assertions.assertEquals(firstBad,
                firstBadVersion.firstBadVersion(firstBad + new Random(30).nextInt(Integer.MAX_VALUE - firstBad)));
    }

    @Test
    void testFirstBadVersion3() {
        int firstBad = 1;
        FirstBadVersion firstBadVersion = new FirstBadVersion(firstBad);
        Assertions.assertEquals(firstBad,
                firstBadVersion.firstBadVersion(firstBad + new Random(30).nextInt(Integer.MAX_VALUE - firstBad)));
    }

    @Test
    void testFirstBadVersion4() {
        int firstBad = Integer.MAX_VALUE;
        FirstBadVersion firstBadVersion = new FirstBadVersion(firstBad);
        Assertions.assertEquals(firstBad, firstBadVersion.firstBadVersion(firstBad));
    }
}
