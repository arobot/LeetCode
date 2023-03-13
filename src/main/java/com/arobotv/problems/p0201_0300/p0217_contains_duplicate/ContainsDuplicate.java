package com.arobotv.problems.p0201_0300.p0217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
     * 执行用时：13 ms, 在所有 Java 提交中击败了55.06%的用户
     * 内存消耗：53.5 MB, 在所有 Java 提交中击败了77.08%的用户
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (set.contains(a))
                return true;
            set.add(a);
        }
        return false;
    }
}
