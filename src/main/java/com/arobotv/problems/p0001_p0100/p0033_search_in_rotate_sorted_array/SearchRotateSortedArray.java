package com.arobotv.problems.p0001_p0100.p0033_search_in_rotate_sorted_array;

public class SearchRotateSortedArray {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        if (nums[l] > target && nums[r] < target)
            return -1;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] == target)
                return m;
            if (nums[m] >= nums[l]) {// 左边有序
                if (nums[l] <= target && target <= nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            } else {
                if (nums[m] <= target && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }

        }
        return -1;
    }
}
