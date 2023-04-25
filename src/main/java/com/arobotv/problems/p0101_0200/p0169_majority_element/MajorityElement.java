package com.arobotv.problems.p0101_0200.p0169_majority_element;

public class MajorityElement {
    /*
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.62%的用户
     * 内存消耗：44.6 MB, 在所有 Java 提交中击败了88.75%的用户
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
