package com.arobotv.problems.p0001_p0100.p0003_longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTest {
    @Test
    void testLengthOfLongestSubstring() {
        LongestSubstring lSubstring = new LongestSubstring();
        Assertions.assertEquals(3, lSubstring.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, lSubstring.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, lSubstring.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(0, lSubstring.lengthOfLongestSubstring(""));
        Assertions.assertEquals(1, lSubstring.lengthOfLongestSubstring(" "));
    }
}
