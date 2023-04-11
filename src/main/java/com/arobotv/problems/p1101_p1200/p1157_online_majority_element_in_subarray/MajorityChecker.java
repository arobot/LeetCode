package com.arobotv.problems.p1101_p1200.p1157_online_majority_element_in_subarray;

import java.util.HashMap;
import java.util.Map;

public class MajorityChecker {

    private int[] arr;

    public MajorityChecker(int[] arr) {
        this.arr = arr;
    }

    public int query(int left, int right, int threshold) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = left; i <= right; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.getOrDefault(arr[i], 0) >= threshold)
                return arr[i];
        }
        return -1;
    }
}