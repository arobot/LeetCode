package com.arobotv.problems.p0001_p0100.p0049_group_anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int a = 1;
            for (char c : s.toCharArray()) {
                a *= (c * 36 + 1);
            }
            if (map.containsKey(a)) {
                map.get(a).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(a, list);
            }
        }
        return  new ArrayList<>(map.values());
    }
}
