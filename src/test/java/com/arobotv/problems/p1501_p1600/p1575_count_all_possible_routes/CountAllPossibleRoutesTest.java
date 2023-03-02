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
        Assertions.assertEquals(4, countAllPossibleRoutes.dfsOptmizeCountRoutes(ls, start, finish, fuel));
        Assertions.assertEquals(4, countAllPossibleRoutes.countRoutesDp(ls, start, finish, fuel));
    }

    @Test
    void testDfs2() {
        int[] ls = { 4,3,1 };
        int start = 1, finish = 0, fuel = 6;
        int sum = countAllPossibleRoutes.countRoutes(ls, start, finish, fuel);
        Assertions.assertEquals(5, sum);
        Assertions.assertEquals(5, countAllPossibleRoutes.dfsOptmizeCountRoutes(ls, start, finish, fuel));
        Assertions.assertEquals(5, countAllPossibleRoutes.countRoutesDp(ls, start, finish, fuel));
    }

    @Test
    void testDfs3() {
        int[] ls = { 5,2,1 };
        int start = 0, finish = 2, fuel = 3;
        int sum = countAllPossibleRoutes.countRoutes(ls, start, finish, fuel);
        Assertions.assertEquals(0, sum);
        Assertions.assertEquals(0, countAllPossibleRoutes.dfsOptmizeCountRoutes(ls, start, finish, fuel));
        Assertions.assertEquals(0, countAllPossibleRoutes.countRoutesDp(ls, start, finish, fuel));
    }

    @Test
    void testDfs4() {
        int[] ls = { 2,1,5 };
        int start = 0, finish = 0, fuel = 3;
        int sum = countAllPossibleRoutes.countRoutes(ls, start, finish, fuel);
        Assertions.assertEquals(2, sum);
        Assertions.assertEquals(2, countAllPossibleRoutes.dfsOptmizeCountRoutes(ls, start, finish, fuel));
        Assertions.assertEquals(2, countAllPossibleRoutes.countRoutesDp(ls, start, finish, fuel));
    }
}
