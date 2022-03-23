package com.arobotv.problems.p0201_0300.p202_happy_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void testIsHappy() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertTrue(happyNumber.isHappy(19));
    }

    @Test
    void testIsHappy2() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertFalse(happyNumber.isHappy(2));
    }

    @Test
    void testIsHappy3() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertTrue(happyNumber.isHappy2(19));
    }

    @Test
    void testIsHappy4() {
        HappyNumber happyNumber = new HappyNumber();
        Assertions.assertFalse(happyNumber.isHappy2(2));
    }

}
