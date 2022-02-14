package com.arobotv.problems.p0101_0200.p0200_number_of_islands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfIslandsTest {
    @Test
    void testNumIslands() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = {
                { '1', '1', '1', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '0' }
        };
        Assertions.assertEquals(1, numberOfIslands.numIslands(grid));
    }

    @Test
    void testNumIslands2() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        Assertions.assertEquals(3, numberOfIslands.numIslands(grid));
    }
}
