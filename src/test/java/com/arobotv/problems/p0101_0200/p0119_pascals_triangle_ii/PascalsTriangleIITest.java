package com.arobotv.problems.p0101_0200.p0119_pascals_triangle_ii;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalsTriangleIITest {

    /*
     * 输入: rowIndex = 3
     * 输出: [1,3,3,1]
     */
    @Test
    void testGetRow() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow(3);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 3, 1 }, list.toArray(array));
    }

    /*
     * 输入: rowIndex = 0
     * 输出: [1]
     */
    @Test
    void testGetRow2() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow(0);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1 }, list.toArray(array));
    }

    /*
     * 输入: rowIndex = 1
     * 输出: [1, 1]
     */
    @Test
    void testGetRow3() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow(1);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1, 1 }, list.toArray(array));
    }

    /*
     * 输入: rowIndex = 4
     * 输出: [1,4,6,4,1]
     */
    @Test
    void testGetRow4() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow(4);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1, 4, 6, 4, 1 }, list.toArray(array));
    }


        /*
     * 输入: rowIndex = 3
     * 输出: [1,3,3,1]
     */
    @Test
    void testGetRow20() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow2(3);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1, 3, 3, 1 }, list.toArray(array));
    }

    /*
     * 输入: rowIndex = 0
     * 输出: [1]
     */
    @Test
    void testGetRow22() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow2(0);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1 }, list.toArray(array));
    }

    /*
     * 输入: rowIndex = 1
     * 输出: [1, 1]
     */
    @Test
    void testGetRow23() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow2(1);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1, 1 }, list.toArray(array));
    }

    /*
     * 输入: rowIndex = 4
     * 输出: [1,4,6,4,1]
     */
    @Test
    void testGetRow24() {
        PascalsTriangleII triangle = new PascalsTriangleII();
        List<Integer> list = triangle.getRow2(4);
        Integer[] array = new Integer[0];
        Assertions.assertArrayEquals(new Integer[] { 1, 4, 6, 4, 1 }, list.toArray(array));
    }
}
