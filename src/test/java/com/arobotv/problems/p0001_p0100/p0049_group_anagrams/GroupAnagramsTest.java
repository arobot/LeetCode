package com.arobotv.problems.p0001_p0100.p0049_group_anagrams;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GroupAnagramsTest {
    @Test
    void test() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> groups = groupAnagrams.groupAnagrams(strs);
        Assertions.assertEquals(3, groups.size());
    }

    @Test
    void test2() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {};
        List<List<String>> groups = groupAnagrams.groupAnagrams(strs);
        Assertions.assertEquals(0, groups.size());
    }

    @Test
    void test3() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"a"};
        List<List<String>> groups = groupAnagrams.groupAnagrams(strs);
        Assertions.assertEquals(1, groups.size());
    }
}
