package com.arobotv.problems.p0001_0100.p0005_longest_palindromic_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    @Test
    void testLongestPalindrome() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        Assertions.assertEquals("aaaaa", longestPalindromicSubstring.longestPalindrome("aaaaa"));
        Assertions.assertEquals("aaaa", longestPalindromicSubstring.longestPalindrome("aaaa"));
        Assertions.assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        Assertions.assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
        Assertions.assertEquals("c", longestPalindromicSubstring.longestPalindrome("c"));
        Assertions.assertEquals("a", longestPalindromicSubstring.longestPalindrome("ac"));
        Assertions.assertEquals("ccc", longestPalindromicSubstring.longestPalindrome("ccc"));
    }
}
