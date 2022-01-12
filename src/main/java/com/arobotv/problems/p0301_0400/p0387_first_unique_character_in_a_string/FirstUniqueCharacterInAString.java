package com.arobotv.problems.p0301_0400.p0387_first_unique_character_in_a_string;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int index = Integer.MAX_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }
        for (int i : map.values()) {
            if (i != -1) {
                index = Math.min(index, i);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

    public static int firstUniqChar2(String s) {
        int[] a = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1 };
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (a[c - 'a'] == -2)
                continue;
            if (a[c - 'a'] >= 0)
                a[c - 'a'] = -2;
            else
                a[c - 'a'] = i;
        }
        int index = Integer.MAX_VALUE;
        for (int i : a) {
            if (i >= 0) {
                index = Math.min(index, i);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

    public static void main(String[] args) {
        // String s = "loveleetcode";
        String s = "leetcode";
        // String s = "sss";
        // String s = "dddccdbba";
        System.out.println(firstUniqChar2(s));
    }
}
