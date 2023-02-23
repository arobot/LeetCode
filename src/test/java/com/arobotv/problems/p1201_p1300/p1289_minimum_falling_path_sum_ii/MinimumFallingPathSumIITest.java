package com.arobotv.problems.p1201_p1300.p1289_minimum_falling_path_sum_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumFallingPathSumIITest {

    @Test
    public void testOne() {
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Assertions.assertEquals(13, MinimumFallingPathSumII.minFallingPathSum(grid));
    }

    @Test
    public void testTwo() {
        int[][] grid = { { 7 } };
        Assertions.assertEquals(7, MinimumFallingPathSumII.minFallingPathSum(grid));
    }

    @Test
    public void testThree() {
        int[][] grid = { { 7, 8 }, { 8, 7 } };
        Assertions.assertEquals(14, MinimumFallingPathSumII.minFallingPathSum(grid));
    }

    
    @Test
    public void testFour() {
        int[][] grid = { {-73,61,43,-48,-36 }, {3,30,27,57,10},{96,-76,84,59,-15},{5,-49,76,31,-7} ,{97,91,61,-46,67}};
        Assertions.assertEquals(-192, MinimumFallingPathSumII.minFallingPathSum(grid));
    }  
    
    @Test
    public void testFive() {
        int[][] grid = { 
            {50,-18,-38,39,-20,-37,-61,72,22,79 },
            {82,26,30,-96,-1,28,87,94,34,-89},
            {55,-50,20,76,-50,59,-58,85,83,-83},
            {39,65,-68,89,-62,-53,74,2,-70,-90} ,
            {1,57,-70,83,-91,-32,-13,49,-11,58},
            {-55,83,60,-12,-90,-37,-36,-27,-19,-6},
            {76,-53,78,90,70,62,-81,-94,-32,-57},
            {-32,-85,81,25,80,90,-24,10,27,-55},
            {39,54,39,34,-45,17,-2,-61,-81,85},
            {-77,65,76,92,21,68,78,-13,39,22}};
        Assertions.assertEquals(-807, MinimumFallingPathSumII.minFallingPathSum(grid));
    }   

}
