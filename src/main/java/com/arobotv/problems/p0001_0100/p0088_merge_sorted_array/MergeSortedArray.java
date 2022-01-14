package com.arobotv.problems.p0001_0100.p0088_merge_sorted_array;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n == 0)
            return;
        if (m == 0)
            nums1[n - 1] = nums2[n-- - 1];
        else if (n == 0)
            nums1[m - 1] = nums1[m-- - 1];
        else if (nums1[m - 1] < nums2[n - 1])
            nums1[m + n - 1] = nums2[n-- - 1];
        else
            nums1[m + n - 1] = nums1[m-- - 1];
        merge(nums1, m, nums2, n);
    }
}
