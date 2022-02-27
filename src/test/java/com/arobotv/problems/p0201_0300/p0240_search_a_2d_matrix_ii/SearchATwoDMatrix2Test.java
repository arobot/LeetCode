package com.arobotv.problems.p0201_0300.p0240_search_a_2d_matrix_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchATwoDMatrix2Test {
    static SearchATwoDMatrix2 searchATwoDMatrix2 = new SearchATwoDMatrix2();

    @Test
    void testSearchMatrix() {
        int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        Assertions.assertTrue(searchATwoDMatrix2.searchMatrix(matrix, 5));
        Assertions.assertFalse(searchATwoDMatrix2.searchMatrix(matrix, 25));
    }
    @Test
    void testSearchMatrix2() {
        int matrix[][] = { { 1, 4}, { 2, 5 } };
        Assertions.assertTrue(searchATwoDMatrix2.searchMatrix(matrix, 5));
    }
}
