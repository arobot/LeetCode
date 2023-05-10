package com.arobotv.problems.p0501_p0600.p0560_subarray_sum_equals_k;

import java.util.HashMap;

public class SubarraySumEqualsK {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了89.06%的用户
     * 内存消耗：44.8 MB, 在所有 Java 提交中击败了60.06%的用户
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
