package com.arobotv.problems.p1101_p1200.p1147_longest_chunked_palindrome_decomposition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestChunkedPalindromeDecompositionTest {
    /**
     * 输入：ghiabcdefhelloadamhelloabcdefghi
     * 输出：7
     * 使用Assetions.assertEquals()方法进行断言
     */
    @Test
    void testLongestDecomposition() {
        LongestChunkedPalindromeDecomposition solution = new LongestChunkedPalindromeDecomposition();
        String text = "ghiabcdefhelloadamhelloabcdefghi";
        int result = solution.longestDecomposition(text);
        // 断言等于7
        Assertions.assertEquals(7, result);
        Assertions.assertEquals(7, solution.longestDecomposition2(text));
    }

    /**
     * 输入：merchant
     * 输出：1
     * 使用Assetions.assertEquals()方法进行断言
     */

    @Test
    void testLongestDecomposition2() {
        LongestChunkedPalindromeDecomposition solution = new LongestChunkedPalindromeDecomposition();
        String text = "merchant";
        int result = solution.longestDecomposition(text);
        // 断言等于1
        Assertions.assertEquals(1, result);
        Assertions.assertEquals(1, solution.longestDecomposition2(text));
    }

    /**
     * 输入：antaprezatepzapreanta
     * 输出：11
     * 使用Assetions.assertEquals()方法进行断言
     */
    @Test
    void testLongestDecomposition3() {
        LongestChunkedPalindromeDecomposition solution = new LongestChunkedPalindromeDecomposition();
        String text = "antaprezatepzapreanta";
        int result = solution.longestDecomposition(text);
        // 断言等于11
        Assertions.assertEquals(11, result);
        Assertions.assertEquals(11, solution.longestDecomposition2(text));
    }

    /**
     * 输入：elvtoelvto
     * 输出：2
     * 使用Assetions.assertEquals()方法进行断言
     */
    @Test
    void testLongestDecomposition4() {
        LongestChunkedPalindromeDecomposition solution = new LongestChunkedPalindromeDecomposition();
        String text = "elvtoelvto";
        int result = solution.longestDecomposition(text);
        // 断言等于2
        Assertions.assertEquals(2, result);
        Assertions.assertEquals(2, solution.longestDecomposition2(text));
    }

    /**
     * 输入：aaa
     * 输出：3
     * 使用Assetions.assertEquals()方法进行断言
     */
    @Test
    void testLongestDecomposition5() {
        LongestChunkedPalindromeDecomposition solution = new LongestChunkedPalindromeDecomposition();
        String text = "aaa";
        int result = solution.longestDecomposition(text);
        // 断言等于3
        Assertions.assertEquals(3, result);
        Assertions.assertEquals(3, solution.longestDecomposition2(text));
    }

    /**
     * 输入：aaaa
     * 输出：4
     * 使用Assetions.assertEquals()方法进行断言
     */
    @Test
    void testLongestDecomposition6() {
        LongestChunkedPalindromeDecomposition solution = new LongestChunkedPalindromeDecomposition();
        String text = "aaaa";
        int result = solution.longestDecomposition(text);
        // 断言等于4
        Assertions.assertEquals(4, result);
        Assertions.assertEquals(4, solution.longestDecomposition2(text));
    }
}
