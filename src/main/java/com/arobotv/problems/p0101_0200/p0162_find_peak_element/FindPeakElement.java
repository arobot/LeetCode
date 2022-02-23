package com.arobotv.problems.p0101_0200.p0162_find_peak_element;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        return findPeak(nums, 0, nums.length - 1);
    }

    int findPeak(int[] nums, int start, int end) {
        int mid = (start + end) >>> 1;
        if (end - start == 1) {
            return nums[start] < nums[end] ? end : start;
        }
        if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1])
            return findPeak(nums, mid, end);
        else if (nums[mid - 1] > nums[mid] && nums[mid] > nums[mid + 1])
            return findPeak(nums, start, mid);
        else
            return findPeak(nums, start + 1, end);
    }
}
