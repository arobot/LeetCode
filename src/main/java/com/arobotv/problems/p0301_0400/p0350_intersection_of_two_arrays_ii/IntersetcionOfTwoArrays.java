package com.arobotv.problems.p0301_0400.p0350_intersection_of_two_arrays_ii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersetcionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums1[index] = nums1[i];
                    nums2[j] = -1;
                    index++;
                    break;
                }
            }
        }
        return Arrays.copyOf(nums1, index);
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums1[index++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOf(nums1, index);
    }

    public int[] intersect3(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i : nums1) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
        }
        int index = 0;
        for (int i : nums2) {
            if (hash.getOrDefault(i, 0) > 0) {
                nums2[index++] = i;
                hash.put(i, hash.getOrDefault(i, 0) - 1);

            }
        }
        return Arrays.copyOf(nums2, index);
    }
}
