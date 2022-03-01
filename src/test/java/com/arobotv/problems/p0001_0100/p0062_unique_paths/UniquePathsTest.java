package com.arobotv.problems.p0001_0100.p0062_unique_paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {
    static UniquePaths uniquePaths = new UniquePaths();
    @Test
    void testUniquePaths() {
        Assertions.assertEquals(1, uniquePaths.uniquePaths(1, 1));
    }
    @Test
    void testUniquePaths2() {
        Assertions.assertEquals(1, uniquePaths.uniquePaths(1, 2));
    }
    @Test
    void testUniquePaths3() {
        Assertions.assertEquals(1, uniquePaths.uniquePaths(2, 1));
    }
    @Test
    void testUniquePaths4() {
        Assertions.assertEquals(2, uniquePaths.uniquePaths(2, 2));
    }
    @Test
    void testUniquePaths5() {
        Assertions.assertEquals(3, uniquePaths.uniquePaths(2, 3));
    }
    @Test
    void testUniquePaths6() {
        Assertions.assertEquals(28, uniquePaths.uniquePaths(3, 7));
    }
    @Test
    void testUniquePaths7() {
        Assertions.assertEquals(6, uniquePaths.uniquePaths(3, 3));
    }
}
