package com.arobotv.problems.p0301_0400.p0380_insert_delete_getrandom_o1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomizedSetTest {

    static RandomizedSet ra = new RandomizedSet();

    @Test
    void test1() {
        Assertions.assertTrue(ra.insert(3));
        Assertions.assertFalse(ra.insert(3));
        ra.insert(4);
        ra.insert(5);
        ra.insert(6);
        Assertions.assertTrue(ra.remove(4));
        Assertions.assertFalse(ra.remove(4));
        Assertions.assertFalse(ra.remove(10));
        ra.insert(7);
        ra.insert(8);
        ra.insert(9);
        Assertions.assertNotNull(ra.getRandom());
        Assertions.assertTrue(ra.getRandom() > 2);
        Assertions.assertTrue(ra.getRandom() < 10);
    }

    @Test
    void test2() {
        ra = new RandomizedSet();
        ra.insert(0);
        ra.insert(1);
        ra.remove(0);
        ra.insert(2);
        ra.remove(1);
        Assertions.assertEquals(2, ra.getRandom());
    }


}
