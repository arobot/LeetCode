package com.arobotv.problems.p0001_0100.p0070_climbing_stairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    static ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void testRecrusive() {
        Assertions.assertEquals(1, climbingStairs.climbStairs(1));
        Assertions.assertEquals(2, climbingStairs.climbStairs(2));
        Assertions.assertEquals(3, climbingStairs.climbStairs(3));
        Assertions.assertEquals(5, climbingStairs.climbStairs(4));
        Assertions.assertEquals(8, climbingStairs.climbStairs(5));
    }

    @Test
    void testDp() {
        Assertions.assertEquals(1, climbingStairs.dp(1));
        Assertions.assertEquals(2, climbingStairs.dp(2));
        Assertions.assertEquals(3, climbingStairs.dp(3));
        Assertions.assertEquals(5, climbingStairs.dp(4));
        Assertions.assertEquals(8, climbingStairs.dp(5));
    }
}
