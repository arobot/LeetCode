package com.arobotv.problems.p1501_p1600.p1575_count_all_possible_routes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountAllPossibleRoutesTest {

    CountAllPossibleRoutes countAllPossibleRoutes;

    @BeforeEach
    void setUp() {
        countAllPossibleRoutes = new CountAllPossibleRoutes();
    }

    @Test
    void testDfs() {
        int[] ls = { 2, 3, 6, 8, 4 };
        int start = 1, finish = 3, fuel = 5;
        int sum = countAllPossibleRoutes.countRoutes(ls, start, finish, fuel);
        Assertions.assertEquals(4, sum);
    }
}
