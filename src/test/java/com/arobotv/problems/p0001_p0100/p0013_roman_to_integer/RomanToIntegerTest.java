package com.arobotv.problems.p0001_p0100.p0013_roman_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanToIntegerTest {
    @Test
    void testRomanToInt() {
RomanToInteger romanToInteger = new RomanToInteger();
Assertions.assertEquals(3, romanToInteger.romanToInt("III"));
Assertions.assertEquals(4, romanToInteger.romanToInt("IV"));
Assertions.assertEquals(9, romanToInteger.romanToInt("IX"));
Assertions.assertEquals(58, romanToInteger.romanToInt("LVIII"));
Assertions.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
