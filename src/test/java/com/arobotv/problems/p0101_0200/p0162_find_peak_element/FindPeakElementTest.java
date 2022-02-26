package com.arobotv.problems.p0101_0200.p0162_find_peak_element;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {
    @Test
    void testFindPeakElement1() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(2, findPeakElement.findPeakElement(new int[] { 1, 2, 3, 1 }));

    }

    @Test
    void testFindPeakElement2() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(0, findPeakElement.findPeakElement(new int[] { 1 }));
    }

    @Test
    void testFindPeakElement3() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(1, findPeakElement.findPeakElement(new int[] { 1, 2 }));
    }

    @Test
    void testFindPeakElement4() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(1, findPeakElement.findPeakElement(new int[] { 1, 2, 1 }));
    }

    @Test
    void testFindPeakElement5() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(2, findPeakElement.findPeakElement(new int[] { 1, 2, 3 }));
    }

    @Test
    void testFindPeakElement6() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(5, findPeakElement.findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
    }

    @Test
    void testFindPeakElement7() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(1, findPeakElement.findPeakElement(new int[] { 3, 4, 3, 2, 1 }));
    }

    @Test
    void testFindPeakElement8() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(0, findPeakElement.findPeakElement(new int[] { 3, 2, 1 }));
    }

    @Test
    void testFindPeakElement9() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(3, findPeakElement.findPeakElement(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
    }

    @Test
    void testFindPeakElement10() {
        FindPeakElement findPeakElement = new FindPeakElement();
        Assertions.assertEquals(6, findPeakElement.findPeakElement(new int[] { 7, 0, 1, 2, 4, 5, 6 }));
    }
}
