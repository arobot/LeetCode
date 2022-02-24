package com.arobotv.problems.p0001_0100.p0034_find_first_and_last_position_of_element_in_sorted_array;

public class FindSectionInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int left = -1;
        while (start <= end) {
            int mid = (start + end) >>> 1;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] == target) {
                end = mid - 1;
                left = mid;
            } else
                start = mid + 1;
        }

        start = 0;
        end = nums.length - 1;
        int right = -1;
        while (start <= end) {
            int mid = start + end >>> 1;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] == target) {
                start = mid + 1;
                right = mid;
            } else
                start = mid + 1;
        }
        return new int[] { left, right };
    }

    public int[] searchRange2(int[] nums, int target) {
        int start = -1, end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                    end = i;
                } else
                    end = i;
            }
        }
        return new int[] { start, end };
    }
}
