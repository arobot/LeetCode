package com.arobotv.problems.p1101_p1200.p1147_longest_chunked_palindrome_decomposition;

public class LongestChunkedPalindromeDecomposition {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了90.13%的用户
     */
    public int longestDecomposition(String text) {
        int count = 0;
        int start = 0, end = start;
        int length = text.length();
        while (end < length / 2) {
            if (isSame(text, start, end)) {
                count += 2;
                start = end + 1;
                end = start;
            } else {
                end++;
            }
        }
        return (start == length / 2 && length % 2 == 0) ? count : count + 1;
    }

    /**
     * 判断给定的字符串从指定起始点到结束点是否和末尾相同长度内容相同；
     * 结束点不能越过中点
     * 匹配指定点开始，到结束点终止，和末尾相同长度的字符串开始顺序匹配
     */
    private boolean isSame(String text, int start, int end) {
        int length = text.length();
        int i = start;
        int j = length - end - 1;
        while (i <= end) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
