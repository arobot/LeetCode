package com.arobotv.problems.p0501_p0600.p0576_out_of_boundary_paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfBoundaryPathsTest {
    @Test
    void testFindPaths() {
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;
        int paths = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        Assertions.assertEquals(6, paths);
    }

    @Test
    void testFindPaths2() {
        int m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1;
        int paths = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        Assertions.assertEquals(12, paths);
    }

    @Test
    void testFindPaths3() {
        int m = 4, n = 5, maxMove = 8, startRow = 3, startColumn = 2;
        int paths = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        Assertions.assertEquals(3875, paths);
    }

    @Test
    void testFindPaths4() {
        int m = 10, n = 10, maxMove = 10, startRow = 5, startColumn = 7;
        int paths = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        Assertions.assertEquals(42592, paths);
    }
    @Test
    void testFindPaths5() {
        int m = 7, n = 9, maxMove = 10, startRow = 6, startColumn = 7;
        int paths = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        Assertions.assertEquals(27982, paths);
    }
    @Test
    void testFindPaths6() {
        int m = 8, n = 50, maxMove = 23, startRow = 5, startColumn = 26;
        int paths = OutOfBoundaryPaths.findPaths(m, n, maxMove, startRow, startColumn);
        Assertions.assertEquals(914783380, paths);
    }
}
