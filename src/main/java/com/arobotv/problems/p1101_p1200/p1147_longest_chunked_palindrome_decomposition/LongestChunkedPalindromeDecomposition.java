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

    /*
     * 使用字符串截取的方式，递归执行
     * 
     * 执行用时：1 ms, 在所有 Java 提交中击败了65.47%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了30.50%的用户
     */
    public int longestDecomposition2(String text) {
        int length = text.length();
        if (length == 0) {
            return 0;
        }
        for (int i = 1; i <= length / 2; i++) {
            String left = text.substring(0, i);
            String right = text.substring(length - i, length);
            if (left.equals(right)) {
                return 2 + longestDecomposition2(text.substring(i, length - i));
            }
        }
        return 1;
    }
}
