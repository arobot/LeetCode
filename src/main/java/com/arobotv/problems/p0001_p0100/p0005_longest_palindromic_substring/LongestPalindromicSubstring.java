package com.arobotv.problems.p0001_p0100.p0005_longest_palindromic_substring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        // 边界条件判断
        if (s.length() < 2)
            return s;
        // start表示最长回文串开始的位置，
        // maxLen表示最长回文串的长度
        int start = 0, maxLen = 1;
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for (int right = 1; right < length; right++) {
            for (int left = 0; left < right; left++) {
                // 如果两种字符不相同，肯定不能构成回文子串
                if (s.charAt(left) != s.charAt(right))
                    continue;

                // 下面是s.charAt(left)和s.charAt(right)两个
                // 字符相同情况下的判断
                // 如果只有一个字符，肯定是回文子串
                if (right == left) {
                    dp[left][right] = true;
                } else if (right - left <= 2) {
                    // 类似于"aa"和"aba"，也是回文子串
                    dp[left][right] = true;
                } else {
                    // 类似于"a******a"，要判断他是否是回文子串，只需要
                    // 判断"******"是否是回文子串即可
                    dp[left][right] = dp[left + 1][right - 1];
                }
                // 如果字符串从left到right是回文子串，只需要保存最长的即可
                if (dp[left][right] && right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }
            }
        }
        // 截取最长的回文子串
        return s.substring(start, start + maxLen);
    }
}
