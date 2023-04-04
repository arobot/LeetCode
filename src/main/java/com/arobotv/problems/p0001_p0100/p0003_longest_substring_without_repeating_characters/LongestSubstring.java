package com.arobotv.problems.p0001_p0100.p0003_longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> cMap = new HashMap<>();
        int fast = 0, slow = 0;
        int length = 0;

        for (char c : s.toCharArray()) {
            int exist = cMap.getOrDefault(c, -1);
            if (exist >= slow)
                slow = exist + 1;
            cMap.put(c, fast);
            fast++;
            length = Math.max(length, fast - slow);
        }
        return length;
    }
}
