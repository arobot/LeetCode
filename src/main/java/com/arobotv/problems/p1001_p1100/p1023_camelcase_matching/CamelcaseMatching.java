package com.arobotv.problems.p1001_p1100.p1023_camelcase_matching;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了40.00%的用户
     */
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for (String query : queries) {
            result.add(match(query, pattern));
        }
        return result;
    }

    /*
     * 驼峰匹配
     * 输入一个字符串query和一个匹配模式pattern
     * 如果query匹配pattern，返回true，否则返回false
     */
    private boolean match(String query, String pattern) {
        // 使用双指针分别指向query和pattern
        int i = 0, j = 0;
        while (i < query.length() && j < pattern.length()) {
            // 如果query[i]和pattern[j]相等，两个指针都向后移动
            if (query.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                // 如果query[i]和pattern[j]不相等，判断query[i]是否为大写字母
                if (Character.isUpperCase(query.charAt(i))) {
                    // 如果是大写字母，说明query[i]不匹配pattern[j]，返回false
                    return false;
                } else {
                    // 如果不是大写字母，说明query[i]可以忽略，只移动query的指针
                    i++;
                }
            }
        }
        // 判定query是否还有剩余
        while (i < query.length()) {
            // 如果query[i]是大写字母，说明query[i]不匹配pattern[j]，返回false
            if (Character.isUpperCase(query.charAt(i))) {
                return false;
            }
            i++;
        }
        return j == pattern.length();
    }
}
