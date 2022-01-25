package com.arobotv.problems.p0101_0200.p0118_pascals_triangle;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalsTriangleTest {
    @Test
    void testGenerate() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> generate = pascalsTriangle.generate(5);
        Assertions.assertEquals(5, generate.size());
        Assertions.assertEquals("[1, 4, 6, 4, 1]", generate.get(4).toString());
    }

    @Test
    void testGenerate2() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> generate = pascalsTriangle.generate(3);
        Assertions.assertEquals(3, generate.size());
        Assertions.assertEquals("[1, 2, 1]", generate.get(2).toString());
    }
}
