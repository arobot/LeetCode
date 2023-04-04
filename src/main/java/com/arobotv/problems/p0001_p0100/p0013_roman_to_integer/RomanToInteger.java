package com.arobotv.problems.p0001_p0100.p0013_roman_to_integer;

import java.util.HashMap;

public class RomanToInteger {
    static HashMap<Character, Integer> romap = new HashMap<>();
    {
        romap.put('I', 1);
        romap.put('V', 5);
        romap.put('X', 10);
        romap.put('L', 50);
        romap.put('C', 100);
        romap.put('D', 500);
        romap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int last = 0;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = romap.get(s.charAt(i));
            if (j < last) {
                sum -= j;
            } else
                sum += j;
            last = j;
        }
        return sum;
    }
}
